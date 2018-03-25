package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    public void teamAadd2 (View view)
    {
        count_a = count_a + 2;
    }

    public void teamAadd1 (View view)
    {
        count_a = count_a + 1;
    }

    public void teamBadd3 (View view)
    {
        count_b = count_b + 3;
    }

    public void teamBadd2 (View view)
    {
        count_b = count_b + 2;
    }
    public void teamBadd1 (View view)
    {
        count_b = count_b + 1;
    }
    public void reset (View view)
    {
        count_a = 0;
        count_b = 0;
    }
}
