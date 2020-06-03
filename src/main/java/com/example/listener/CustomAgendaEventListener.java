package com.example.listener;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAgendaEventListener implements AgendaEventListener {

	private static final Logger logger = LoggerFactory.getLogger(CustomAgendaEventListener.class);

	public void matchCreated(MatchCreatedEvent event) {
		logger.info("Match Created: " + event.getMatch());

	}

	public void matchCancelled(MatchCancelledEvent event) {
		logger.info("Match Cancelled: " + event.getMatch());

	}

	public void beforeMatchFired(BeforeMatchFiredEvent event) {
		logger.info("Before Match Fired: " + event.getMatch());

	}

	public void afterMatchFired(AfterMatchFiredEvent event) {
		logger.info("After Match Fired: " + event.getMatch());

	}

	public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
		logger.info("Agenda Group Popped: " + event.getAgendaGroup());

	}

	public void agendaGroupPushed(AgendaGroupPushedEvent event) {
		logger.info("Agenda Group Pushed: " + event.getAgendaGroup());

	}

	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		logger.info("Before Rule Flow Group Activated: " + event.getRuleFlowGroup());

	}

	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		logger.info("After Rule Flow Group Activated: " + event.getRuleFlowGroup());

	}

	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		logger.info("Before Rule Flow Group Deactivated: " + event.getRuleFlowGroup());

	}

	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		logger.info("After Rule Flow Group Deactivated: " + event.getRuleFlowGroup());

	}

}
