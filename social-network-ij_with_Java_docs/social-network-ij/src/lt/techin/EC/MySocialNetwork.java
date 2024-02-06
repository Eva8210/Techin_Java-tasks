package lt.techin.EC;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;
import java.util.stream.Collectors;

public class MySocialNetwork implements SocialNetwork {

//    private List<Friend> friends=  new ArrayList<>();

    private List<Friend> friends = new ArrayList<>();


    @Override
    public void addFriend(Friend friend) {
        if(friend == null) throw new IllegalArgumentException();
        if(friend.getFirstName() == null) throw new IllegalArgumentException();
        if(friend.getFirstName().isEmpty()) throw new IllegalArgumentException();
        if(!friends.contains(friend)) {
            friends.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        if (!friends.isEmpty()) {
            return friends.size();
        }
        return 0;

    }

    @Override
    public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException {
        if (firstName == null || lastName ==null) throw new IllegalArgumentException(("First name and last name must not be null"));

       return friends.stream()
               .filter(name -> name.getFirstName().equals(firstName) && name.getLastName().equals(lastName))
               .findFirst()
               .orElseThrow(() -> new FriendNotFoundException(firstName, lastName));

    }

    @Override
    public Collection<Friend> findByCity(String city) {
        if (city == null) throw new IllegalArgumentException();

        return friends.stream()
                .filter(friend -> friend.getCity().contains(city))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Friend> getOrderedFriends() {

        return friends.stream()
                .sorted(Comparator.comparing(Friend::getCity)
                .thenComparing(Friend::getLastName)
                .thenComparing(Friend::getFirstName))
                .collect(Collectors.toList());

    }
}
