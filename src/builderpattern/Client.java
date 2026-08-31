package builderpattern;

public class Client {
    public static void main(String[] args) {

        Instructor ins = Instructor.getBuilder().setCompany("jpmc").setName("ankit").build();

        Instructor ins1 = Instructor.getBuilder().setCompany("neo").build();
    }
}
