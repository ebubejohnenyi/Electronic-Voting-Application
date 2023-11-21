package org.example.service;

import org.example.data.model.Candidate;
import org.example.dtos.request.CandidateRegisterRequest;
import org.example.dtos.request.VotingRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CandidateServiceImpleTest {
    @Autowired
    private CandidateService candidateService;
    @Test public void registerCandidate(){
        CandidateRegisterRequest candidateRequest = new CandidateRegisterRequest();
        candidateRequest.setName("Peter Obi");
        candidateRequest.setParty("LP");
        candidateService.register(candidateRequest);
    }

    @Test public void findByParty(){
        VotingRequest votingRequest = new VotingRequest();
        votingRequest.setParty("PDP");
        Candidate foundParty = candidateService.findByParty((votingRequest));
        assertEquals("PDP", foundParty.getParty());
    }
    @Test public void testIcan_CountNumber_OfCandidateVotes(){
        VotingRequest votingRequest = new VotingRequest();
        votingRequest.setParty("PDP");
        int voteNumber = candidateService.votes(votingRequest.getParty());
        assertEquals(1, voteNumber);

        VotingRequest votingRequest2 = new VotingRequest();
        votingRequest2.setParty("PDP");
        int voteNumber2 = candidateService.votes(votingRequest2.getParty());
        int totalVotes = voteNumber + voteNumber2;
        assertEquals(2, totalVotes);
    }
}