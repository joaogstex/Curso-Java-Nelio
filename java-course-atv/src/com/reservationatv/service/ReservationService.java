package com.reservationatv.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.reservationatv.model.entities.Reservation;
import com.reservationatv.model.exceptions.ReservationException;

public class ReservationService {
    
    static final Scanner scanner = new Scanner(System.in);
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void reservarQuarto() {
        try {

            System.out.println("Room number: ");
            Integer roomNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Check-in date: ");
            Date checkIn = sdf.parse(scanner.nextLine());
            System.out.println("Check-out date: ");
            Date checkOut = sdf.parse(scanner.nextLine());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update Reservation: ");
            System.out.println("Check-in date: ");
            checkIn = sdf.parse(scanner.nextLine());
            System.out.println("Check-out date: ");
            checkOut = sdf.parse(scanner.nextLine());
            reservation.updateDates(checkIn, checkOut);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (ReservationException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
