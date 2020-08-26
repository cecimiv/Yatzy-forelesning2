package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnce(){

        assertEquals(5, new YatzyGame().score("ONES", new int[]{1, 1, 1, 1, 1}));
        assertEquals(3, new YatzyGame().score("ONES", new int[]{1, 2, 3, 1, 1}));
    }

    @Test
    void shouldScoreTwos(){
        assertEquals(10, new YatzyGame().score("TWOS", new int[]{2, 2, 2, 2, 2}));
        assertEquals(4, new YatzyGame().score("TWOS", new int[]{1, 2, 3, 1, 2}));
    }

    @Test
    void shouldScoreThrees(){
        assertEquals(15, new YatzyGame().score("THREES", new int[]{3, 3, 3, 3, 3}));
        assertEquals(12, new YatzyGame().score("THREES", new int[]{1, 6, 6, 1, 2}));
    }

    @Test
    void shouldScorePair(){
        assertEquals(4, new YatzyGame().score("PAIR", new int[]{1, 2, 2, 3, 4}));

    }
}
