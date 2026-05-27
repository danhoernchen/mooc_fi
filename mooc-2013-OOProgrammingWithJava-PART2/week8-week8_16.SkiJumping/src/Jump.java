
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amigo
 */
public class Jump {

    private ArrayList<Integer> judgePoints, judgeScore;
    private int length, totalScore, score;
    private Random random;

    public Jump() {
        judgePoints = new ArrayList<Integer>();
        judgeScore = new ArrayList<Integer>();
        random = new Random();
    }

    public void jump() {
        length = jumpLength();
        judges();
    }

    public int jumpLength() {
        return random.nextInt(120 - 60) + 60;
    }

    public void judges() {
        judgePoints.clear();
        judgeScore.clear();
        for (int i = 0; i < 5; i++) {
            judgePoints.add(judgeVote());
        }
        Collections.sort(judgePoints);
        for (int i = 1; i < (judgePoints.size() - 1); i++) {
            score += judgePoints.get(i);
        }
    }

    public int getLength() {
        return length;
    }

    public int getJudgeScore() {
        return score;
    }

    public ArrayList<Integer> getJudgePoints() {
        return judgePoints;
    }

    private int judgeVote() {
        return random.nextInt(20 - 10) + 10;
    }

    @Override
    public String toString() {
        return "      length: " + length + "\n      judge votes: " + judgePoints;
    }
}
