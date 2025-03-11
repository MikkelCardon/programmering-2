package opgave04;

public class BowlingSerie {
    int[][] point = {
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0,0}
            };

    int[] score = new int[10];

    public void calculatePoints(){
        for (int i = 0; i < score.length-1; i++) {
            score[i] = point[i][0] + point[i][1];

            if (point[i][0] == 10){
                strikePoints(i);
            }else if(score[i] == 10){
                sparePoints(i);
            }
        }

        //10'ende omgang
        if (point[9][0] == 10 || point[9][0] + point[9][1] == 10){
            score[9] = point[9][0] + point[9][1] + point[9][2];
        } else {
            score[9] = point[9][0] + point[9][1];
        }
    }

    public void strikePoints(int index){
        score[index] += point[index+1][0] + point[index+1][1];
    }

    public void sparePoints(int index){
        score[index] += point[index+1][0];
    }


    public int[][] getPoint() {
        return point;
    }

    public int[] getScore() {
        return score;
    }

    public int totalScore(){
        int points = 0;
        for (int i : score) {
            points+= i;
        }
        return points;
    }
}
