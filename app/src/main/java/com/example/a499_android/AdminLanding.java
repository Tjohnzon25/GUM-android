package com.example.a499_android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminLanding extends AppCompatActivity {

    Button addEditTidbits, viewResponsesBtn;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_landing);
        clearLists();
        actionBar = getSupportActionBar();
        actionBar.setTitle("Admin Landing Page");
        actionBar.setDisplayHomeAsUpEnabled(true);
        wiredUp();

        addEditTidbits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminLanding.this, Tidbits.class));
            }
        });

        viewResponsesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminLanding.this, LoadPreviousSurvey.class));
            }
        });

    }

    private void wiredUp() {
        addEditTidbits = findViewById(R.id.addEditTidbits);
        viewResponsesBtn = findViewById(R.id.viewResponsesBtn);
    }
    private void clearLists(){
        LoadPreviousSurvey.w_survey_list_names.clear();
        GetResponseListQuery.listSelected_questions.clear();
        GetResponseListQuery.listSelected_questions_c.clear();
        GetResponseListQuery.listSelected_responses.clear();
        SelectASurvey.survey_list_names.clear();
        SelectASurvey.past_survey= false;
        GetResponseListQuery.index_charts = 0;
       // ViewResponses.questionsListC.clear();
       // ViewResponses.responseList.clear();
       // ViewResponses.questionsList.clear();
    }
}