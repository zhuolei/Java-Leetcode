package com.mercury.interview;

public interface CardTypes {
    static enum Color{
        RED, BLACK;
    }

    static enum Suit{
        CLUBS(Color.BLACK), SPADES(Color.BLACK), HEARTS(Color.RED), DIAMONDS(Color.RED);

        private Color color;

        public Color getColor() {
            return color;
        }

        private Suit(Color color) {
            this.color = color;
        }
    }

    static enum FaceValue {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

}
