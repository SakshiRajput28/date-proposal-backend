package com.sakshi.date_proposal_backend.service;

import org.springframework.stereotype.Service;

import com.sakshi.date_proposal_backend.entity.DateProposal;
import com.sakshi.date_proposal_backend.repository.DateProposalRepo;

@Service
public class DateProposalService {

    private final DateProposalRepo repository;

    public DateProposalService(DateProposalRepo repository) {
        this.repository = repository;
    }

    public DateProposal saveDateProposal(DateProposal dateProposal) {
        return repository.save(dateProposal);
    }
}