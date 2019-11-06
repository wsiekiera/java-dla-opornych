package net.siekiera.tasks.lekcja2;

public class TicketChecker {
    private String[] results;
    private Ticket ticket;

    public TicketChecker(String[] results, Ticket ticket) {
        this.results = results;
        this.ticket = ticket;
    }

    public int calculateWin() {
        //todo implement me.
        // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
        // sprawdzenie czy wynik jest poprawny int-int, jesli nie jest rzuc wyjątek IllegalArgumentException
        return 0;
    }
}
