package com.demo.dto;

import java.time.Instant;

public class JavaExample {


    public void demo() {
        Match match = new Match("", null, null, Instant.now());
        match.getId();
        match.getMatchDateTime();

        System.out.println(match.getAwayTeam().toString()); //nullable values are marked and IDE informs you that this can be null

        System.out.println(match.getMatchDateTime().toString());

        System.out.println(match.toString()); // includes all members by default

        Match.Companion.newInstanceKotlin("");

        //JvmStatic annotated method
        Match.Companion.newInstanceJava("");
        Match.newInstanceJava("");

    }
}
