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
        int[][] resultsSplitted = new int[3][2];
        int i = 0;
        int suma = 0;
        for (String result: this.results) {
            String[] resultSplitted = result.split("-");
            int j = 0;
            for(String side : resultSplitted) resultsSplitted[i][j++] = Integer.parseInt(side);
            i++;
        }
        i = 0;
        int j = 0;
        for(int[] result: resultsSplitted) {
            if (result[i] > result [i+1] && ticket.getBet(j).getSide() == Side.Home) suma += ticket.getBet(j).getAmount();
            else if (result[i] < result [i+1] && ticket.getBet(j).getSide() == Side.Away) suma += ticket.getBet(j).getAmount();
            else if (result[i] == result [i+1] && ticket.getBet(j).getSide() == Side.Draw) suma += ticket.getBet(j).getAmount();
            j++;
        }
        return suma;
    }
}
