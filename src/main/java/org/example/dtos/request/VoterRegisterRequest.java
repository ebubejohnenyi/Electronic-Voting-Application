package org.example.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VoterRegisterRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
}
