package org.example.service;

import org.example.dtos.request.VoterRegisterRequest;
import org.example.dtos.response.VoterRegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class VoterServiceImpleTest {
    @Autowired
    private VoterService voterService;
    @Test public void resgisterVoter(){
        VoterRegisterRequest voterRequest = new VoterRegisterRequest();
        voterRequest.setFirstName("Mariam");
        voterRequest.setLastName("Dapo");
        voterRequest.setGender("Female");
        voterRequest.setAge(13);
        VoterRegisterResponse voterResponse = voterService.registerVoter(voterRequest);
//        assertNotEquals(1, voterResponse);
    }
}