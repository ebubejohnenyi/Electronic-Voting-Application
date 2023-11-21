package org.example.service;

import org.example.data.model.Candidate;
import org.example.dtos.request.CandidateRegisterRequest;
import org.example.dtos.request.VotingRequest;
import org.example.dtos.response.CandidateRegisterResponse;
import org.springframework.stereotype.Service;


public interface CandidateService {
    CandidateRegisterResponse register(CandidateRegisterRequest candidateRequest);

    Candidate findByParty(VotingRequest name);
    int votes(String party);
}
