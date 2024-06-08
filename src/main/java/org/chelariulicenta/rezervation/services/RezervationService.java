package org.chelariulicenta.rezervation.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dozermapper.core.Mapper;
import org.chelariulicenta.rezervation.model.Rezervation;
import org.chelariulicenta.rezervation.repositories.RezervationRepository;
import org.chelariulicenta.rezervation.resources.UserResource;
import org.chelariulicenta.rezervation.resources.HotelResource;
import org.chelariulicenta.rezervation.resources.VHotel;
import org.chelariulicenta.rezervation.resources.VUser;
import org.chelariulicenta.rezervation.views.VRezervation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RezervationService {

    @Autowired
    private RezervationRepository rezervationRepository;
    @Autowired
    private Mapper mapper;
    @Autowired
    private UserResource userResource;
    @Autowired
    private HotelResource hotelResource;

    @Transactional(readOnly = true)
    public List<VRezervation> getAllRezervations() {
        List<Rezervation> rezervationList = rezervationRepository.findAll();
        List<VRezervation> vRezervationList = rezervationList.stream()
                .map(rezervation -> mapper.map(rezervation, VRezervation.class)).toList();
        return vRezervationList;
    }

    @Transactional(readOnly = true)
    public List<VRezervation> getAllRezervationsByUserId(Integer id) {
        List<Rezervation> allByUserId = rezervationRepository.findAllByIdUser(id);
        return allByUserId.stream().map(r -> mapper.map(r, VRezervation.class)).collect(Collectors.toList());
    }

    public void saveReservation(VRezervation vRezervation){
        Rezervation rezervation = mapper.map(vRezervation, Rezervation.class);
        int idHotel = rezervation.getIdHotel();
//        LocalDate checkinDate = rezervation.getCheckinDate();
//        LocalDate checkoutDate = rezervation.getCheckoutDate();
        rezervationRepository.saveAndFlush(rezervation);
    }

    public void deleteReservation(Integer id){
        rezervationRepository.deleteByIdRezervare(id);
    }
}
