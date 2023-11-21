package org.example.service;

import org.example.data.model.Voter;
import org.example.data.repositories.VoterRepository;
import org.example.dtos.request.VoterRegisterRequest;
import org.example.dtos.response.VoterRegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImple implements VoterService{
    @Autowired
    private VoterRepository voterRepository;
    @Autowired
    private Voter voter;
    @Override
    public VoterRegisterResponse registerVoter(VoterRegisterRequest voterRequest) {
        voter.setFirstName(voterRequest.getFirstName());
        voter.setLastName(voterRequest.getLastName());
        voter.setGender(voterRequest.getGender());
        voter.setAge(voterRequest.getAge());

        Voter registeredVoter = voterRepository.save(voter);
        VoterRegisterResponse voterResponse = new VoterRegisterResponse();
        voterResponse.setFirstName(registeredVoter.getFirstName());
        voterResponse.setLastName(registeredVoter.getLastName());
        voterResponse.setGender(registeredVoter.getGender());
        voterResponse.setAge(registeredVoter.getAge());
        return voterResponse;
    }
}
