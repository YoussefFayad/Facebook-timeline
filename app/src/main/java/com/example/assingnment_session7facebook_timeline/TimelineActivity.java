package com.example.assingnment_session7facebook_timeline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.*;


public class TimelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        RecyclerView recyclerView = findViewById(R.id.rv_timeline);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Data> timelineItems = generateSampleTimelineItems();
        FacebookTimeLineAdapter adapter = new FacebookTimeLineAdapter(timelineItems);
        recyclerView.setAdapter(adapter);
    }

    private List<Data> generateSampleTimelineItems() {

        List<Data> timelineItems = new ArrayList<>();

        timelineItems.add(new Data("Ali", "1 hour ago", ContextCompat.getColor(this, R.color.yellow),"220","13"));
        timelineItems.add(new Data("Mohamed", "2 hours ago", ContextCompat.getColor(this, R.color.blue),"236","41"));
        timelineItems.add(new Data("Ahmed", "3 hours ago", ContextCompat.getColor(this, R.color.white_green),"20","3"));
        timelineItems.add(new Data("Youssef", "4 hours ago", ContextCompat.getColor(this, R.color.red),"19","1"));
        timelineItems.add(new Data("Khaled", "5 hours ago",  ContextCompat.getColor(this, R.color.blue),"125","10"));
        timelineItems.add(new Data("Yehia", "6 hours ago",  ContextCompat.getColor(this, R.color.orange),"180","22"));
        timelineItems.add(new Data("Omar", "7 hours ago",  ContextCompat.getColor(this, R.color.indigo),"130","32"));
        timelineItems.add(new Data("Hazem", "8 hours ago",  ContextCompat.getColor(this, R.color.white),"173","7"));
        timelineItems.add(new Data("Sherif", "9 hours ago", ContextCompat.getColor(this, R.color.purple),"77","9"));
        timelineItems.add(new Data("Abdelrahman", "11 hours ago", ContextCompat.getColor(this, R.color.brown),"68","11"));

        return timelineItems;
    }

}