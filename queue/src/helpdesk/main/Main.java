package helpdesk.main;

import helpdesk.entities.RequestType;
import helpdesk.entities.SupportTicket;
import helpdesk.entities.impl.DefaultSupportTicket;
import helpdesk.facades.impl.DefaultHelpDeskFacade;

public class Main {
    public static void main(String[] args) {

        final DefaultHelpDeskFacade defaultHelpDeskFacade = new DefaultHelpDeskFacade();

        defaultHelpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_BLOCKED));
        defaultHelpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
        defaultHelpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.CAN_NOT_LOGIN));
        defaultHelpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
        defaultHelpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.COOPERATION));
        defaultHelpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));

        SupportTicket nextSupportTicket = defaultHelpDeskFacade.getNextSupportTicket();
        System.out.println(nextSupportTicket.getPriority() + " " + nextSupportTicket.getRequestType() + " " + nextSupportTicket.getSequentialNumber());

        nextSupportTicket = defaultHelpDeskFacade.getNextSupportTicket();
        System.out.println(nextSupportTicket.getPriority() + " " + nextSupportTicket.getRequestType() + " " + nextSupportTicket.getSequentialNumber());
        nextSupportTicket = defaultHelpDeskFacade.getNextSupportTicket();
        System.out.println(nextSupportTicket.getPriority() + " " + nextSupportTicket.getRequestType() + " " + nextSupportTicket.getSequentialNumber());




    }
}
