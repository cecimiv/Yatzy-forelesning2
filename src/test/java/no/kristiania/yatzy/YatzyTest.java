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
        assertEquals(10, new YatzyGame().score("ONES", new int[]{2, 2, 2, 2, 2}));
        assertEquals(4, new YatzyGame().score("ONES", new int[]{1, 2, 3, 1, 2}));
    }
}
