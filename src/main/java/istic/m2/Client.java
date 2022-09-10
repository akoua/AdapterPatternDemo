package istic.m2;

public class Client {

    private IMoney iMoney;

    public void process(IMoney iMoney) {
        iMoney.operation();
    }

    public void setUtilisateur(IMoney iMoney) {
        this.iMoney = iMoney;
    }
}
