package dev.dustinb.CampApp.entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @Column(name="id")
    private String reservationId;

    @Column(name = "site")
    private int siteNumber;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "guest_id")
    private int guestID;

    public Reservation(){}

    public Reservation(int siteNumber, Date startDate, Date endDate, int guestID) {
        this.siteNumber = siteNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guestID = guestID;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationCode) {
        this.reservationId = reservationCode;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }
}
