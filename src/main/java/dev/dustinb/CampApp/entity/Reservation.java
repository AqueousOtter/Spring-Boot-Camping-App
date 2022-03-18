package dev.dustinb.CampApp.entity;

import javax.persistence.*;


/*
        TODO
        Change Date For input and database

 */

@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @Column(name="id")
    private String reservationCode;

    @Column(name = "site")
    private int siteNumber;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "guest_id")
    private int guestID;

    public Reservation(){}

    public Reservation(int siteNumber, String startDate, String endDate, int guestID) {
        this.siteNumber = siteNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guestID = guestID;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }
}
