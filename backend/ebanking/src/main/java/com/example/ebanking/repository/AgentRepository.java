package com.example.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ebanking.entity.Agent;


public interface AgentRepository extends JpaRepository<Agent, Long> {

	

}
