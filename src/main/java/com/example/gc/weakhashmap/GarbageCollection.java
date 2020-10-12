package com.example.gc.weakhashmap;

import lombok.Value;

import java.util.Map;
import java.util.WeakHashMap;

public class GarbageCollection {

    private static Map<User, Address> userInfoMap = new WeakHashMap<>();
//    private static Map<User, Address> userInfoMap = new HashMap<>();

    private static void setUser(String name, String city) {
        User user = new User(name);
        Address address = new Address(city);
        userInfoMap.put(user, address);
    }

    public static void main(String[] args) {
        setUser("Mary", "LA");
        System.out.println(userInfoMap);
        // Weak: {User(name=Mary)=Address(city=LA)}
        // none: {User(name=Mary)=Address(city=LA)}

        System.gc();
        System.out.println(userInfoMap);
        // Weak: {}
        // none: {User(name=Mary)=Address(city=LA)}
    }

}

@Value
class Address {

    String city;

}

@Value
class User {

    String name;

}

