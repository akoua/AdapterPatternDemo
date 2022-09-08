package istic.m2;

/**
 * Service which contains logical functionnality of the client
 */
public class MagasinService implements IUtilisateur {

    @Override
    public String getUserInfo(OurEntity magasins) {
        return magasins.toString();
    }
}
