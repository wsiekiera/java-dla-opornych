package net.siekiera.tasks.lekcja2;

public class TicketChecker {
    private String[] results;
    private Ticket ticket;

    public TicketChecker(String[] results, Ticket ticket) {
        this.results = results;
        this.ticket = ticket;
    }

    public int calculateWin() {
        Bet[] bets = this.ticket.getBets();
        int sum = 0;
        for (int i=0; i<bets.length; i++) {
            sum+=calculateWinForSingleBet(bets[i], results[i]);
        }
        return sum;
    }

    private int calculateWinForSingleBet(Bet bet, String result) {
        if (bet.getSide().equals(whoWins(result))) return bet.getAmount();
        else return 0;
    }

    private Side whoWins(String result) {
        int homeScore = Integer.parseInt(result.split("-")[0]);
        int awayScore = Integer.parseInt(result.split("-")[1]);
        if (homeScore>awayScore) return Side.Home;
        else if (homeScore<awayScore) return Side.Away;
        else return Side.Draw;
    }
}
