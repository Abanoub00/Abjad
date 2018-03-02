package com.example.islamiccenter.abjad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CourseAct extends AppCompatActivity {

    Button Lecs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Lecs =(Button)findViewById(R.id.lecsBtn);
        Lecs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), WatchAct.class);
                startActivity(intent);
            }
        });

    }
}
