package org.chelariulicenta.rezervation.controllers;

import org.chelariulicenta.rezervation.services.RezervationService;
import org.chelariulicenta.rezervation.views.VRezervation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rezervation")
@CrossOrigin
public class RezervationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RezervationController.class);
    @Autowired
    private RezervationService rezervationService;

    @GetMapping("/getAllRezervations")
    private List<VRezervation> getRezervation(){
        List<VRezervation> allRezervations = rezervationService.getAllRezervations();
        LOGGER.info("GET all Rezervations");
        return allRezervations;
    }

    @GetMapping("/getAllRezervations/{id}")
    List<VRezervation> getAllRezervationsByUserId(@PathVariable(name = "id") Integer id) {
        LOGGER.info("Get all rezervations by user id");
        return rezervationService.getAllRezervationsByUserId(id);
    }

    @PostMapping("/saveRezervation")
    void saveRezervation(@RequestBody VRezervation vRezervation){
        rezervationService.saveReservation(vRezervation);
    }
}
