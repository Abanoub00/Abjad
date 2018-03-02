package com.example.islamiccenter.abjad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import me.anwarshahriar.calligrapher.Calligrapher;

public class WatchAct extends AppCompatActivity {
    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"elmessiri-regular.otf",true);

        textView = new TextView(getApplicationContext(),null);
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));

        listView = (ListView) findViewById(R.id.course_list);
        final String[] values = new String[] { "الدرس الاول",
                "الدرس الثاني",
                "الدرس الثالث",
                "الدرس الرابع",
                "الدرس الخامس",
                "الدرس السادس",
                "الدرس السابع",
                "الدرس الثامن"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.text_color , values);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),values[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
