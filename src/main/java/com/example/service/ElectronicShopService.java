package com.example.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.listener.CustomAgendaEventListener;
import com.example.model.Electronic;

@Service
public class ElectronicShopService {

	private final KieContainer kieContainer;

	@Autowired
	public ElectronicShopService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Electronic getElectronicDiscount(Electronic electronic) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(electronic);
		kieSession.addEventListener(new CustomAgendaEventListener());
		kieSession.fireAllRules();
		kieSession.dispose();
		return electronic;
	}

}
