package exercitii.ex13socialnetwork;

public class User {

    private String name;

    private String[] interests;

    private User[] friends;

    private int numberOfFriends;

    public User(String name, String[] interests) {
        this.name = name;
        this.interests = interests;
        this.friends = new User[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public User[] getFriends() {
        return friends;
    }

    public void setFriends(User[] friends) {
        this.friends = friends;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public void addFriend (User newFriend){
        //adaug newFriend in lista lui this
        this.friends[numberOfFriends] = newFriend;
        this.numberOfFriends++;

        //adaug this in lista lui newFriend
        newFriend.getFriends()[newFriend.getNumberOfFriends()]=this;
        newFriend.setNumberOfFriends(newFriend.getNumberOfFriends()+1);
    }

    public boolean isFriendSuggestion (User potentialFriend){ //TODO de facut
        //returnam true daca user-ul primit ca parametru are minim 3 interese la fel cu userul this (pe care se apeleaza metoda)
        return true;
    }
}
