public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marko Marić", 25);
        Student student2 = new Student("Juanito Ivić", 24);

        student1.prikazPodataka();
        System.out.println(student2.getIme());

        student2.setIme("Juanito Juarez");
        student2.prikazPodataka();

        student1.setOcjena(6);
        System.out.println(student1.getOcjena());
        student1.setOcjena(3);
        System.out.println(student1.getOcjena());
    }
}