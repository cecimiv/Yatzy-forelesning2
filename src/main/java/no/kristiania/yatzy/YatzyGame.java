package no.kristiania.yatzy;

public class YatzyGame {
    public int score(String category, int[] dice) {
        int result = 5;
        for (int die : dice) {
            if(die == 1){
                result += 1;
            }
        }

        return 5;
    }
}
