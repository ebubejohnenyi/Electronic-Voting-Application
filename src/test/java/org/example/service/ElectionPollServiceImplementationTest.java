package org.example.service;

import org.example.data.model.Candidate;
import org.example.data.model.Voter;
import org.example.data.repositories.CandidateRepository;
import org.example.data.repositories.VoterRepository;
import org.example.dtos.request.VotingRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ElectionPollServiceImplementationTest {
    @Autowired public Voter voter;
    @Autowired public VoterRepository voterRepository;
    @Autowired public ElectionPollServiceImplementation electionPollimplementation;

    @Test public void testI_canVote(){
        VotingRequest votingRequest = new VotingRequest();
        votingRequest.setId(3);
        votingRequest.setParty("PDP");
        Candidate votedCandidateParty = electionPollimplementation.Vote(votingRequest);
        assertEquals("PDP", votedCandidateParty.getParty());
    }
    @Test public void testI_CanCount_NumberOfVotes(){
        VotingRequest votingRequest = new VotingRequest();
        votingRequest.setId(1);
        votingRequest.setParty("PDP");
        Candidate votedCandidateParty = electionPollimplementation.Vote(votingRequest);
        assertEquals("PDP", votedCandidateParty.getParty());
    }
}