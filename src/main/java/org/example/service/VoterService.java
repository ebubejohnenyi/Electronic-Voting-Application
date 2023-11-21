package org.example.service;

import org.example.dtos.request.VoterRegisterRequest;
import org.example.dtos.response.VoterRegisterResponse;

public interface VoterService {
    VoterRegisterResponse registerVoter(VoterRegisterRequest voterRegisterRequest);
}
