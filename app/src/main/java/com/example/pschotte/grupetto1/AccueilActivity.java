package com.example.pschotte.grupetto1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button_sport = (Button) findViewById(R.id.button_my_groups);
        button_sport.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccueilActivity.this, ListGroupActivity.class);
                startActivity(intent);
            }
        }));

        Button search_user = (Button) findViewById(R.id.button_search_training);
        search_user.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccueilActivity.this, SportActivity.class);
                startActivity(intent);
            }
        }));

        Button button_join_discussion = (Button) findViewById(R.id.button_propose_training);
        button_join_discussion.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AccueilActivity.this, CreateTrainingActivity.class);
                startActivity(intent2);
            }
        }));

        Button button_calendrier = (Button) findViewById(R.id.button_my_calendar);
        button_calendrier.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccueilActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        }));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccueilActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });



    }
}
