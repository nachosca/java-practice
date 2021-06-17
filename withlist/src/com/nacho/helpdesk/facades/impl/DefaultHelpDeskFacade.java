package com.nacho.helpdesk.facades.impl;

import java.util.PriorityQueue;
import java.util.Queue;

import com.nacho.helpdesk.entities.SupportTicket;
import com.nacho.helpdesk.facades.HelpDeskFacade;
import com.nacho.helpdesk.utils.CustomSupportTicketsComparator;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	
	private Queue<SupportTicket> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		tickets.offer(supportTicket);
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return tickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return tickets.size();
	}

}
