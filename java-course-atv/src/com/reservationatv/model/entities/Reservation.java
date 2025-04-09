package com.reservationatv.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.reservationatv.model.exceptions.ReservationException;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws ReservationException {
        validateDateAfter(checkIn, checkOut);
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    //Estudar mais sobre esse TimeUnit
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void validateDateBefore(Date checkIn, Date checkOut) throws ReservationException {
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)) {
            throw new ReservationException("Reservation dates must be future dates");
        }
    }

    public void validateDateAfter(Date checkIn, Date checkOut) throws ReservationException {
        if(!checkOut.after(checkIn)) {
            throw new ReservationException("Check-out must be after check-in date");
        }
    }

    public void updateDates(Date checkIn, Date checkOut) throws ReservationException {
        validateDateBefore(checkIn, checkOut);
        validateDateAfter(checkIn, checkOut);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber 
        + ", Check-in: " + sdf.format(checkIn)
        + ", Check-out " + sdf.format(checkOut)
        + ", "
        + duration()
        + " nights";
    }

}
