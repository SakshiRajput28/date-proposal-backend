package com.sakshi.date_proposal_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "date_proposals")
@Getter
@Setter
public class DateProposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean dateAccepted;

    private String outfit;

    private String restaurant;

    private String cuisine;

    private LocalDate date;

    private LocalTime time;
}
