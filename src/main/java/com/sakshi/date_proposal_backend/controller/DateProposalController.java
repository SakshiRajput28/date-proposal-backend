package com.sakshi.date_proposal_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshi.date_proposal_backend.entity.DateProposal;
import com.sakshi.date_proposal_backend.service.DateProposalService;

@RestController
@RequestMapping("/api/date")
@CrossOrigin(origins = "http://localhost:4200")
public class DateProposalController {

    private final DateProposalService service;

    public DateProposalController(DateProposalService service) {
        this.service = service;
    }

    @PostMapping("/proposal")
    public ResponseEntity<DateProposal> saveProposal(
            @RequestBody DateProposal dateProposal) {

        DateProposal savedProposal =
                service.saveDateProposal(dateProposal);

        return ResponseEntity.ok(savedProposal);
    }
}
