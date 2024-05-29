package exercitii.ex13socialnetwork;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Ionut",new String[]{"fotbal, sala"});
        User user2 = new User("Ioana",new String[]{"fotbal, sala"});
        User user3 = new User("Zuckerberg",new String[]{"fotbal, sala"});
        user1.addFriend(user2);
        user1.addFriend(user3);
    }
}
