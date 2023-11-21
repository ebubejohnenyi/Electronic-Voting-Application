package org.example.service;

import org.example.data.model.Candidate;
import org.example.data.repositories.CandidateRepository;
import org.example.dtos.request.CandidateRegisterRequest;
import org.example.dtos.request.VotingRequest;
import org.example.dtos.response.CandidateRegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImple implements CandidateService{
    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private Candidate candidate;

    public CandidateRegisterResponse register(CandidateRegisterRequest candidateRequest) {
        candidate.setName(candidateRequest.getName());
        candidate.setParty(candidateRequest.getParty());
        Candidate saveCandidate = candidateRepository.save(candidate);
        CandidateRegisterResponse candidateResponse = new CandidateRegisterResponse();
        candidateResponse.setName(saveCandidate.getName());
        candidateResponse.setParty(saveCandidate.getParty());
        return candidateResponse;
    }

    @Override
    public Candidate findByParty(VotingRequest name) {
        List <Candidate> candidateList = candidateRepository.findAll();
        for (Candidate foundCadidate : candidateList) {
            if(foundCadidate.getParty().equals(name.getParty())){
                return foundCadidate;
            }
        }
        return null;
    }

    @Override
    public int votes(String party) {
        List <Candidate> candidateList = candidateRepository.findAll();
        int countVotes = 0;
        for (Candidate foundCandidate : candidateList) {
            if(foundCandidate.getParty().equals(party)){
                countVotes++;
                foundCandidate.setVotes(foundCandidate.getVotes() + 1);
                System.out.println("This is the number of votes "+ foundCandidate.getName() +" have --> "+foundCandidate.getVotes());
            }
        }
//        System.out.println("The Number of vote for " + party + ":: "+ countVotes);
        return countVotes;
    }
}
