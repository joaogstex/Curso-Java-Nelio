package com.reservationatv.model.exceptions;

public class ReservationException extends Exception{
    private static final long serialVersionUID = 1L;

    public ReservationException(String msg) {
        super(msg);
    }
}
