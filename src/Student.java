public class Student {
    private String ime;
    private double ocjena;
    private final int studentID;

    public Student(String ime, int studentID) {
        this.ime = ime;
        this.studentID = studentID;
        this.ocjena = 0.0;
    }

    public void prikazPodataka() {
        System.out.println("Ime: " + ime + ", ID studenta: " + studentID + ", ocjena: " + ocjena);
    }

    public String getIme() {
        return ime;
    }

    public double getOcjena() {
        return ocjena;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setOcjena(double ocjena) {
        if (ocjena >= 1.0 && ocjena <= 5.0) {
            this.ocjena = ocjena;
            System.out.println("Uspjesan unos ocjene za studenta! " + this.ime);
        } else {
            System.out.println("Krivi unos ocjene, molim unesite ocjenu 1-5!");
        }
    }


}
