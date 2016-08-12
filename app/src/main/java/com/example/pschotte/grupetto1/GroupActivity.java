package com.example.pschotte.grupetto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        Button button_display_users = (Button) findViewById(R.id.button_group_members);
        button_display_users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupActivity.this, UsersFoundActivity.class);
                startActivity(intent);
            }
        });

        Button button_display_calendar = (Button) findViewById(R.id.button_calendar_group);
        button_display_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        Button button_open_chat = (Button) findViewById(R.id.button_chat_group);
        button_open_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupActivity.this, DiscussionActivity.class);
                startActivity(intent);
            }
        });

        Button button_quit_group = (Button) findViewById(R.id.button_quit_group);
        button_quit_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO QUIT THE GROUP
                Toast.makeText(getApplicationContext(), "Vous venez de quitter ce groupe", Toast.LENGTH_LONG).show();
            }
        });
    }
}
