package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {

       return users.stream()
               .filter(user -> user.getAge() >25)
               .toList()
               .size();
    }

    public static double getAverageAge(List<User> users) {

        return users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .min()
                .orElse(0);
    }

    public static User findByName(List<User> users, String name) {

        return  users.stream()
                .filter(byName -> byName.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream()
                .max(Comparator.comparing(User::getAge))
                .orElse(null);

    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .sum();

    }

}
