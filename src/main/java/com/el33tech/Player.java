package com.el33tech;

import java.io.Serializable;
import java.util.List;

/**
 * Created by taimurqureshi on 6/4/17.
 */
public class Player implements Serializable{

    private static final long serialVersionUID = 2214709242502038874L;

    private String playerId;
    private String firstName;
    private String lastName;
    private int age;
    private List<Game> games;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
