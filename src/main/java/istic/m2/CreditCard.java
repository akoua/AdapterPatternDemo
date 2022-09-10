package istic.m2;

/**
 * La carte de credit permet de faire office du compte en banque
 */
public class CreditCard implements IMoney {
    private IMoney bankAccount;
    private boolean isOwner;

    public CreditCard(boolean isOwner) {
        this.isOwner = isOwner;
        this.bankAccount = new BankAccount();
    }

    @Override
    public void operation() {
        if (isOwner) {
            bankAccount.operation();
        } else {
            System.out.println("It's not account");
        }

    }
}
