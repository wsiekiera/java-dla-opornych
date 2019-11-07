package net.siekiera.tasks.lekcja2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketCheckerTest {
    private Ticket ticket1;
    private Ticket ticket2;
    private Ticket ticket3;
    private Ticket ticket4;

    private String[] result1;
    private String[] result2;
    private String[] result3;
    private String[] result4;

    @Before
    public void prepare() {
        ticket1 = new Ticket(1,2,4);
        ticket2 = new Ticket(12,60,3);
        ticket3 = new Ticket(100,20,4);
        ticket4 = new Ticket(10, 20, 5);

        result1 = new String[]{"1-0", "2-2", "0-4"};
        result2 = new String[]{"5-1", "5-2", "2-2"};
        result3 = new String[]{"1-1", "4-3", "4-1"};
        result4 = new String[]{"3-0", "1-1", "0-2"};
    }

    @Test
    public void homeWin() {
        TicketChecker ticketChecker1 = new TicketChecker(result1, ticket1);
        TicketChecker ticketChecker2 = new TicketChecker(result2, ticket2);
        TicketChecker ticketChecker3 = new TicketChecker(result3, ticket3);
        TicketChecker ticketChecker4 = new TicketChecker(result4, ticket4);

        assertEquals(1, ticketChecker1.calculateWin());
        assertEquals(15, ticketChecker2.calculateWin());
        assertEquals(0, ticketChecker3.calculateWin());
        assertEquals(10, ticketChecker4.calculateWin());
    }

}
