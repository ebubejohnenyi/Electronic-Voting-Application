package org.example.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CandidateRegisterRequest {
    private String name;
    private String party;
}
