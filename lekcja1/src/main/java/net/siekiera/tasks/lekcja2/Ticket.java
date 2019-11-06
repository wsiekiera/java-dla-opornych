package net.siekiera.tasks.lekcja2;

public class Ticket {
    private Bet[] bets = new Bet[3];

    public Ticket(int home, int away, int draw) {
        bets[0] = new Bet(Side.Home, home);
        bets[1] = new Bet(Side.Away, away);
        bets[2] = new Bet(Side.Draw, draw);
    }

    public Bet[] getBets() {
        return bets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("## Ticket ## \n");
        for (Bet bet : bets) {
            sb.append(bet);
        }
        return sb.toString();
    }
}
