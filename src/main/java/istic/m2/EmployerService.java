package istic.m2;

public class EmployerService implements AdapteeInterface {

    public String getEmployerInfos(Employer e) {
        return e.toString();
    }
}
