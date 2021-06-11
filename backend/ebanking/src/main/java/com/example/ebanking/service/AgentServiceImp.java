package com.example.ebanking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ebanking.entity.Agent;
import com.example.ebanking.repository.AgentRepository;
import com.example.ebanking.repository.UserRepository;
@Service
@Transactional
public class AgentServiceImp implements AgetService {

	 @Autowired
	    private AgentRepository agentRepository;
	@Override
	public Agent save(Agent agent) {
		return agentRepository.save(agent);
	}

}
