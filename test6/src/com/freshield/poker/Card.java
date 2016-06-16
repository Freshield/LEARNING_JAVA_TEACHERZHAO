package com.freshield.poker;

/**
 * Created by FRESHIELD on 2016/6/16.
 */
public class Card {

    private int rank;
    private String suit;

    //getter setter
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Card(){

    }

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}
