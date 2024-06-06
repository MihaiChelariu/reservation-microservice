package org.chelariulicenta.rezervation.views;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VRezervation implements Serializable{

    @JsonProperty
    private int idRezervare;
    @JsonProperty
    private int idUser;
    @JsonProperty
    private int idHotel;
    @JsonProperty
    private LocalDate checkinDate;
    @JsonProperty
    private LocalDate checkoutDate;
    @JsonProperty
    private int nrSingleRooms;
    @JsonProperty
    private int nrDoubleRooms;
    @JsonProperty
    private int nrPremiumRooms;
}
