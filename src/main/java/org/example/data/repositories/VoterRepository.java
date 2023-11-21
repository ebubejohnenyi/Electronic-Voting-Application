package org.example.data.repositories;

import org.example.data.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VoterRepository extends JpaRepository<Voter, Long> {
}
