package com.active.dbtermproject.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Date;
import java.util.List;

public class ReservationAndIsBorrow extends Reservation {
    private int isBorrow;
    private String title;

    public ReservationAndIsBorrow(String customerId, String isbn, Date reservDate, int isBorrow, String title) {
        super(customerId, isbn, reservDate);
        this.isBorrow = isBorrow;
        this.title = title;
    }

    public void setIsBorrow(int isBorrow) {
        this.isBorrow = isBorrow;
    }

    public int getIsBorrow() {
        return isBorrow;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}