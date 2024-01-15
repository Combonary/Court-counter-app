package pamtech.com.courtcounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /**
     *
     * @return score for team A
     */
    /**
     * set score for team A
     * @param score
     */
    private var score = 0 //team A score
    /**
     *
     * @return score for team B
     */
    /**
     * sets score for team B
     * @param scoreB
     */
    private var scoreB = 0 //team B score
    private lateinit var scoreViewA: TextView
    private lateinit var scoreViewB: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scoreViewA = findViewById(R.id.team_a_score)
        scoreViewB = findViewById(R.id.team_b_score)
        displayForTeamA(score) //show team A score at launch
        displayForTeamB(scoreB) //show team B score at launch
        if (savedInstanceState != null) {
            val scoreTA = savedInstanceState.getInt("TeamA")
            val scoreTB = savedInstanceState.getInt("TeamB")
            score = scoreTA
            scoreB = scoreTB
            scoreViewA.text = score.toString()
            scoreViewB.text = scoreB.toString()
        }
    }

    /**
     * updates the score for team A
     * @param score current team point total
     */
    private fun displayForTeamA(score: Int) {
        scoreViewA.text = score.toString()
    }

    /**
     * Updates the score for team B
     * @param scoreB current team point total
     */
    private fun displayForTeamB(scoreB: Int) {
        scoreViewB.text = scoreB.toString()
    }

    /**
     * awards 2 points to team A
     */
    private fun twoPoints() {
        val current = score
        score = current + 2
        displayForTeamA(score)
    }

    /**
     * awards 3 points to team A
     */
    private fun threePoints() {
        val current = score
        score = current + 3
        displayForTeamA(score)
    }

    /**
     * awards a single point to team A
     */
    private fun freeThrow() {
        val current = score
        score = current + 1
        displayForTeamA(score)
    }

    private fun twoPointsB() {
        val current = scoreB
        scoreB = current + 2
        displayForTeamB(scoreB)
    }

    private fun threePointsB() {
        val current = scoreB
        scoreB = current + 3
        displayForTeamB(scoreB)
    }

    private fun freeThrowB() {
        val current = scoreB
        scoreB = current + 1
        displayForTeamB(scoreB)
    }

    private fun reset() {
        score = 0
        scoreB = 0
        displayForTeamA(score)
        displayForTeamB(scoreB)
    }

    fun reSet(v: View?) {
        reset()
    }

    fun tWPB(v: View?) {
        twoPointsB()
    }

    fun tHPB(v: View?) {
        threePointsB()
    }

    fun fThrowB(v: View?) {
        freeThrowB()
    }

    fun tWP(v: View?) {
        twoPoints()
    }

    fun tHP(v: View?) {
        threePoints()
    }

    fun fThrow(v: View?) {
        freeThrow()
    }

    public override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("TeamA", score)
        outState.putInt("TeamB", scoreB)
    }
}
