package com.sakshi.date_proposal_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sakshi.date_proposal_backend.entity.DateProposal;

public interface DateProposalRepo extends JpaRepository<DateProposal, Long> {

}
