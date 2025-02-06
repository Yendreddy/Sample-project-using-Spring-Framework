package org.useSetter;

public class Doctor implements Staff {

    private String qualification;
    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void assist(){
        System.out.println("I am doctor");
    }
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
}
