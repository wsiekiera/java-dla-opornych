package net.siekiera.tasks.lekcja2;

public class TicketChecker {
    private String[] results;
    private Ticket ticket;

    public TicketChecker(String[] results, Ticket ticket) {
        this.results = results;
        this.ticket = ticket;
    }

    public int calculateWin() {
        int sum = 0;
        int[] resultsHome = getParsedResults(this.results[0]);
        int[] resultsAway = getParsedResults(this.results[1]);
        int[] resultsDraw = getParsedResults(this.results[2]);
        int[] ticketArr = getParsedTicket(this.ticket);

        if(isHome(resultsHome)) {
            sum += ticketArr[0];
        }
        if(isAway(resultsAway)) {
            sum += ticketArr[1];
        }
        if(isDraw(resultsDraw)) {
            sum += ticketArr[2];
        }

        //todo implement me.
        // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
        // sprawdzenie czy wynik jest poprawny int-int, jesli nie jest rzuc wyjątek IllegalArgumentException
        return sum;
    }

    private int[] getParsedResults(String result) {
        if (!results[0].matches("\\d+[-]\\d+")) {
            throw new IllegalArgumentException();
        }
        String[] resultSplitted = result.split("-");
        return new int[] {Integer.parseInt(resultSplitted[0]), Integer.parseInt(resultSplitted[1])};
    }

    private int[] getParsedTicket(Ticket ticket) {
        String[] parsedTicket = ticket.toString().split("\n");
        int homeAmount = Integer.parseInt(parsedTicket[1].split("[$]")[1]);
        int awayAmount = Integer.parseInt(parsedTicket[2].split("[$]")[1]);
        int drawAmount = Integer.parseInt(parsedTicket[3].split("[$]")[1]);
        return new int[] {homeAmount, awayAmount, drawAmount};
    }

    private boolean isDraw( int[] result) {
        return result[0] == result[1];
    }

    private boolean isHome( int[] result) {
        return result[0] > result[1];
    }

    private boolean isAway( int[] result) {
        return result[0] < result[1];
    }

}
