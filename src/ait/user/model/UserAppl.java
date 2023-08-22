package ait.user.model;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User ("markstevens@gmail.com", "Uu12345!");
        System.out.println(user);
        user.setEmail("markstevens@gmail..com");
        System.out.println(user);
        user.setPassword("Uu12345.!");
        System.out.println(user.getPassword());
    }

    }

