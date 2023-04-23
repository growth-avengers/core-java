package ch02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ch02Test {
    @Test
    void reftest(){
        ArrayList<String> friends = new ArrayList<>();
        friends.add("friends");
        ArrayList<String> people = friends;
        people.add("test");

        System.out.println(people);
        System.out.println(friends);
    }
}
