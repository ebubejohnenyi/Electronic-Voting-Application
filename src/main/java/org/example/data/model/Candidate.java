package org.example.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Candidate {
    private String name;
    private String party;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long candidateId;
    private int votes;
}
