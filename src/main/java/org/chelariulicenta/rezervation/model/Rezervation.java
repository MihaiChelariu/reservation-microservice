package org.chelariulicenta.rezervation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "rezervations")
@Data
public class Rezervation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRezervare;
    private int idUser;
    private int idHotel;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private int nrSingleRooms;
    private int nrDoubleRooms;
    private int nrPremiumRooms;
}
