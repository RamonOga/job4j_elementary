package ru.job4j.hostital;

public class Diagnosis {
    private String[] symptoms;
    private boolean seeDoctor;
    private String diagnos;

     public String getDiagnos() {
       return diagnos;
    }

     public void setDiagnos(String diag) {
        this.diagnos = diag;
    }
}
