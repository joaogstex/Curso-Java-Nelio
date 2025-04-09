package com.reservationatv;

import com.reservationatv.service.ReservationService;

public class Main {
    
    public static void main(String[] args) {
        ReservationService rs = new ReservationService();
        rs.reservarQuarto();
    }
}
