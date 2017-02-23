package com.example.youssefalaa.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddThreePointsA(View v)
    {
        ScoreTeamA = ScoreTeamA + 3 ;
        displayScoreTeamA(ScoreTeamA);


    }
    public void AddThreePointsB(View v)
    {
        ScoreTeamB = ScoreTeamB + 3 ;
        displayScoreTeamB(ScoreTeamB);


    }
    public void AddSixPointsA(View v)
    {
        ScoreTeamA = ScoreTeamA + 6 ;
        displayScoreTeamA(ScoreTeamA);


    }
    public void AddSixPointsB(View v)
    {
        ScoreTeamB = ScoreTeamB + 6 ;
        displayScoreTeamB(ScoreTeamB);


    }
    public void AddOnePointA(View v)
    {
        ScoreTeamA = ScoreTeamA + 1 ;
        displayScoreTeamA(ScoreTeamA);


    }
    public void AddOnePointB(View v)
    {
        ScoreTeamB = ScoreTeamB + 1 ;
        displayScoreTeamB(ScoreTeamB);


    }
    public void AddTwoPointsA(View v)
    {
        ScoreTeamA = ScoreTeamA + 2 ;
        displayScoreTeamA(ScoreTeamA);


    }  public void AddTwoPointsB(View v)
    {
        ScoreTeamB = ScoreTeamB + 2 ;
        displayScoreTeamB(ScoreTeamB);


    }
    public void SafetyA(View v)
    {
        ScoreTeamA = ScoreTeamA + 2 ;
        displayScoreTeamA(ScoreTeamA);

    }
    public void SafetyB(View v)
    {
        ScoreTeamB = ScoreTeamB + 2 ;
        displayScoreTeamB(ScoreTeamB);


    }
    public void resetScore(View view)
    {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayScoreTeamA(ScoreTeamA);
        displayScoreTeamB(ScoreTeamB);


    }
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void Reset(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.reset);
        scoreView.setText(String.valueOf(score));


    }
}
