package org.example.service;

import org.example.data.model.Candidate;
import org.example.data.model.Voter;
import org.example.data.repositories.CandidateRepository;
import org.example.data.repositories.VoterRepository;
import org.example.dtos.request.VotingRequest;
import org.example.dtos.response.VotingReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionPollServiceImplementation implements ElectionPollService{
    @Autowired private CandidateService candidateService;
    @Autowired private VoterRepository voterRepository;
    @Autowired private CandidateRepository candidateRepository;

    @Override
    public Candidate Vote(VotingRequest votingRequest) {
        List <Voter> listOfVoters = voterRepository.findAll();
        for (Voter voter : listOfVoters) {
            if(voter.getVoterId() == votingRequest.getId()){
                return candidateService.findByParty(votingRequest);
            }
        }
        System.out.println("Voter Not Found");
        return null;
    }

    @Override
    public int countVotes(String party) {
        int countVotes = 0;
        List <Candidate> candidateList = candidateRepository.findAll();
        for (Candidate candidate : candidateList) {
            if(party.equals(candidate.getParty())){
                countVotes++;
                candidate.setVotes(countVotes);
            }
        }
        return countVotes;
    }

    @Override
    public Candidate declareWinner() {
        return null;
    }
}
