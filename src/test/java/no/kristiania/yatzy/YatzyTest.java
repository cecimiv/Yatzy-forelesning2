package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnce(){
        assertEquals(5, new YatzyGame().score("ONES", new int[]{1, 1, 1, 1, 1}));
    }
}
