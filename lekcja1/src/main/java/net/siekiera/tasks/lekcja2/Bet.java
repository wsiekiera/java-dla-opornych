package net.siekiera.tasks.lekcja2;

public class Bet {
    private Side side;
    private int amount;

    public Bet(Side side, int amount) {
        this.side = side;
        this.amount = amount;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return side + ":$" + amount + "\n";
    }
}
