package org.example.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VoterRegisterResponse {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
}
