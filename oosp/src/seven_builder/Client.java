package seven_builder;

public class Client {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("John", "Doe")
                            .setEmail("john.doe@example.com")
                            .setPhoneNumber("+123456789")
                            .setAddress("123 Elm Street")
                            .build();

        User user2 = new User.UserBuilder("Jane", "Smith")
                            .setEmail("jane.smith@example.com")
                            .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
