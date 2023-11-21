package org.example.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "voter")
public class Voter {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voterId")
    private Long voterId;
}
