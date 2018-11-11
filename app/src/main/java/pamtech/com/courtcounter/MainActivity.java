package pamtech.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score;//team A score
    int scoreB;//team B score

    //Button one = findViewById(R.id.onePoint);
    //Button two = findViewById(R.id.twoPoints);
    //Button three = findViewById(R.id.threePoints);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(getScore());//show team A score at launch
        displayForTeamB(getScoreB());//show team B score at launch

    }

    /**
     * updates the score for team A
     * @param score current team point total
     */
    public void displayForTeamA(int score){
        TextView scoreView = findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Updates the score for team B
     * @param scoreB current team point total
     */
    public void displayForTeamB(int scoreB){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     *
     * @return score for team B
     */
    public int getScoreB() {
        return scoreB;
    }

    /**
     * sets score for team B
     * @param scoreB
     */
    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    /**
     *
     * @return score for team A
     */
    public int getScore() {
        return score;
    }

    /**
     * set score for team A
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * awards 2 points to team A
     */
    public void twoPoints(){
        int current = getScore();
        setScore(current + 2);
        displayForTeamA(getScore());
    }



    /**
     * awards 3 points to team A
     */
    public void threePoints(){
        int current = getScore();
        setScore(current + 3);
        displayForTeamA(getScore());
    }

    /**
     * awards a single point to team A
     */
    public void freeThrow(){
        int current = getScore();
        setScore(current + 1);
        displayForTeamA(getScore());
    }

    public void twoPointsB(){
        int current = getScoreB();
        setScoreB(current + 2);
        displayForTeamB(getScoreB());
    }

    public void threePointsB(){
        int current = getScoreB();
        setScoreB(current + 3);
        displayForTeamB(getScoreB());
    }

    public void freeThrowB(){
        int current = getScoreB();
        setScoreB(current + 1);
        displayForTeamB(getScoreB());
    }


    public void reset(){
        setScore(0);
        setScoreB(0);
        displayForTeamA(getScore());
        displayForTeamB(getScoreB());
    }

    public void reSet(View v){
        reset();
    }

    public void tWPB(View v){
        twoPointsB();
    }

    public void tHPB(View v){
        threePointsB();
    }

    public void fThrowB(View v){
        freeThrowB();
    }

    public void tWP(View v){
        twoPoints();
    }

    public void tHP(View v){
        threePoints();
    }

    public void fThrow(View v){
        freeThrow();
    }

}
