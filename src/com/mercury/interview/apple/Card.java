package com.mercury.interview.apple;

import java.util.Random;

public class Card implements CardTypes{
    public final FaceValue face;
    public final Suit suit;

    private Card(FaceValue face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Card random() {
        Random r = new Random();
        FaceValue face = FaceValue.values()[r.nextInt(FaceValue.values().length)];
        Suit suit = Suit.values()[Suit.values().length];
        return new Card(face, suit);
    }
}
