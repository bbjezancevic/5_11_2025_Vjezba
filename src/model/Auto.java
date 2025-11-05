package model;

public class Auto {
    public String marka;
    public int brojVrata;

    public Auto(String marka, int brojVrata) {
        this.marka = marka;
        this.brojVrata = brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public void setMarka(String model) {
        this.marka = model;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public String getMarka() {
        return marka;
    }

    public void prikazPodataka() {
        System.out.println("Marka automobila je: " + marka + " i ima " + brojVrata + " vrata.");
    }
}
