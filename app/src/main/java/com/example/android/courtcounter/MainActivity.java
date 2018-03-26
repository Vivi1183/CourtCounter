package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int count_a = 0;
    int count_b = 0;

    public void teamAadd3 (View view)
    {
        count_a = count_a + 3;
        displayA(count_a);
    }

    public void teamAadd2 (View view)
    {
        count_a = count_a + 2;
        displayA(count_a);
    }

    public void teamAadd1 (View view)
    {
        count_a = count_a + 1;
        displayA(count_a);
    }

    public void teamBadd3 (View view)
    {
        count_b = count_b + 3;
        displayB(count_b);
    }

    public void teamBadd2 (View view)
    {
        count_b = count_b + 2;
        displayB(count_b);
    }
    public void teamBadd1 (View view)
    {
        count_b = count_b + 1;
        displayB(count_b);
    }
    public void reset (View view)
    {
        count_a = 0;
        count_b = 0;
        displayA(count_a);
        displayB(count_b);
    }
    private void displayA(int number) {
        TextView teamA = (TextView) findViewById(R.id.counter_team_a);
        teamA.setText("" + number);
    }

    private void displayB(int number) {
        TextView teamB = (TextView) findViewById(R.id.counter_team_b);
        teamB.setText("" + number);
    }
}
