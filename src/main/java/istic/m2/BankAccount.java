package istic.m2;

public class BankAccount implements IMoney {

    private final int money = 10_000;

    @Override
    public void operation() {
        System.out.println("Tu as " + money + " dans ton compte");
    }
}
