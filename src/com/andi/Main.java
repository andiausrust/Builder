package com.andi;

public class Main {

    public static void main(String[] args) {
	    User james = new User.UserBuilder("James", "Bond")
                .address("London")
                .age(45)
                .phoneNumber("19283")
                .build();
    }
}
