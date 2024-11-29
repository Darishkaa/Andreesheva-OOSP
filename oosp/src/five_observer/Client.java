package five_observer;

public class Client {
    public static void main(String[] args) {
        SocialMediaUser user1 = new SocialMediaUser("Alice");
        SocialMediaUser user2 = new SocialMediaUser("Bob");

        User observer1 = new User("Charlie");
        User observer2 = new User("Diana");

        user1.subscribe(observer1);
        user1.subscribe(observer2);

        user2.subscribe(observer1);

        user1.post("Hello, world!");
        user2.comment("Great post!");
        user1.like("Great post!");
    }
}
