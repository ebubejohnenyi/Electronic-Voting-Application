package org.example.service;

import org.example.data.model.Candidate;
import org.example.dtos.request.VotingRequest;
import org.example.dtos.response.VotingReponse;

public interface ElectionPollService {
    Candidate Vote(VotingRequest votingByParty);
    int countVotes(String party);
    Candidate declareWinner();
}
