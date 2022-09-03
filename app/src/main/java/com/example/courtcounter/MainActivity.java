package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreForTeamA = 0;
    int ScoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void addThreeForTeamA(View v) {
        ScoreForTeamA = ScoreForTeamA + 3;
        displayForTeamA(ScoreForTeamA);
    }

    public void addTwoForTeamA(View v) {
        ScoreForTeamA = ScoreForTeamA + 2;
        displayForTeamA(ScoreForTeamA);
    }

    public void addFreeThrowForTeamA(View v) {
        ScoreForTeamA = ScoreForTeamA + 1;
        displayForTeamA(ScoreForTeamA);
    }
    public void addThreeForTeamB(View v) {
        ScoreForTeamB = ScoreForTeamB + 3;
        displayForTeamB(ScoreForTeamB);
    }

    public void addTwoForTeamB(View v) {
        ScoreForTeamB = ScoreForTeamB + 2;
        displayForTeamB(ScoreForTeamB);
    }

    public void addFreeThrowForTeamB(View v) {
        ScoreForTeamB = ScoreForTeamB + 1;
        displayForTeamB(ScoreForTeamB);
    }
 public void ResetScore(View v){
        ScoreForTeamA=0;
        ScoreForTeamB=0;
        displayForTeamA(ScoreForTeamA);
        displayForTeamB(ScoreForTeamB);
 }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}