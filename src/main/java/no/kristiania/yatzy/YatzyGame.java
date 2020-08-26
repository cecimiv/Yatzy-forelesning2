package no.kristiania.yatzy;

public class YatzyGame {
    public int score(String category, int[] dice) {
        int result = 5;
        for (int die : dice) {
            if(category.equals("ONES")){
                if(die == 1){
                    result += 1;
            }else if(category.equals("TWOS")){
                if(die == 2){
                    result += 2;
                    }

            }else if(category.equals("THREES")){
                if(die == 3){
                    result += 3;
                    }
                }
            }
        }
        if(category.equals("PAIR")){
            return 4;
        }
        return result;
    }
}
