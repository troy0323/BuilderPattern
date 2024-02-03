package BuilderPattern;

public class MainApp {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .firstName("Troy")
                .lastName("Pardillo")
                .age(21)
                .email("troy.pardillo@neu.edu.ph")
                .Address("Montalban, Rizal")
                .PhoneNum("09677445447")
                .build();

        System.out.println("Name: "+user.firstName +","+user.lastName);
        System.out.println("Age: "+user.age);
        System.out.println("Email: "+user.email);
        System.out.println("Address: "+user.address);
        System.out.println("Phone Number: "+user.phone);
    }
}
