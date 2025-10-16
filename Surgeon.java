class Surgeon extends Doctor {
    void diagnose() { System.out.println("Surgeon diagnosing for operation"); }
    void prescribe() { System.out.println("Surgeon prescribing surgery medicines"); }
}

public class RunDoctor {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Doctor.openClinic(); Doctor.closeClinic();
        d.diagnose(); d.prescribe();

        Surgeon s = new Surgeon();
        Surgeon.openClinic(); Surgeon.closeClinic();
        s.diagnose(); s.prescribe();

        Doctor d2 = new Surgeon();
        d2.diagnose(); d2.prescribe();
    }
}