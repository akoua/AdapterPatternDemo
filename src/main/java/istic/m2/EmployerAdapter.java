package istic.m2;

public class EmployerAdapter implements IUtilisateur {
    private final EmployerService oldService;

    public EmployerAdapter() {
        this.oldService = new EmployerService();
    }

    @Override
    public String getUserInfo(OurEntity entity) {
        return oldService.getEmployerInfos((Employer) entity);
    }
}
