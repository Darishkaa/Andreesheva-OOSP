package five_observer;

public class SocialMediaUser extends Subject {
    private String username;

    public SocialMediaUser(String username) {
        this.username = username;
    }

    public void post(String content) {
        System.out.println(username + " posted: " + content);
        notifyObservers(username + " posted: " + content);
    }

    public void comment(String comment) {
        System.out.println(username + " commented: " + comment);
        notifyObservers(username + " commented: " + comment);
    }

    public void like(String post) {
        System.out.println(username + " liked: " + post);
        notifyObservers(username + " liked: " + post);
    }
}
