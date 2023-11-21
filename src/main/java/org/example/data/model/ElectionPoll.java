package org.example.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.data.repositories.CandidateRepository;
import org.example.data.repositories.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ElectionPoll {
    @Autowired public VoterRepository voterRepository;
    @Autowired private CandidateRepository candidateRepository;

    private int countVote;
    private int countVoter;
}
