package com.sophiaxinlu.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    TextView teamAScoreView;
    TextView teamBScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayTeamAScore(int teamAScoreInput) {
        teamAScoreView = (TextView) findViewById(R.id.teamA_score);
        teamAScoreView.setText(Integer.toString(teamAScoreInput));
    }

    private void displayTeamBScore(int teamBScoreInput) {
        teamBScoreView = (TextView) findViewById(R.id.teamB_score);
        teamBScoreView.setText(Integer.toString(teamBScoreInput));
    }


    public void plusOneA(View view) {
        teamAScore++;
        displayTeamAScore(teamAScore);
    }

    public void plusTwoA(View view) {
        teamAScore = teamAScore + 2;
        displayTeamAScore(teamAScore);
    }

    public void plusThreeA(View view) {
        teamAScore = teamAScore + 3;
        displayTeamAScore(teamAScore);
    }

    public void plusOneB(View view) {
        teamBScore++;
        displayTeamBScore(teamBScore);
    }

    public void plusTwoB(View view) {
        teamBScore = teamBScore + 2;
        displayTeamBScore(teamBScore);
    }

    public void plusThreeB(View view) {
        teamBScore = teamBScore + 3;
        displayTeamBScore(teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }
}
