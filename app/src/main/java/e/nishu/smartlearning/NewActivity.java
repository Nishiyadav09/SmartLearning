package e.nishu.smartlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NewActivity extends AppCompatActivity {

    ImageButton playgrp;
    ImageButton nursery;
    ImageButton lkg;
    ImageButton ukg;
    ImageButton first;
    ImageButton second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        playgrp = findViewById(R.id.play_id);
        nursery = findViewById(R.id.nursery_id);
        lkg = findViewById(R.id.lkg_id);
        ukg = findViewById(R.id.ukg_id);
        first = findViewById(R.id.first_id);
        second = findViewById(R.id.second_id);

        playgrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewActivity.this,Playgroup.class);
                startActivity(intent);
            }
        });

        nursery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewActivity.this,Nursery.class);
                startActivity(intent);
            }
        });

        lkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewActivity.this,Lkg.class);
                startActivity(intent);
            }
        });

        ukg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewActivity.this,Ukg.class);
                startActivity(intent);
            }
        });

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewActivity.this,First.class);
                startActivity(intent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewActivity.this,Second.class);
                startActivity(intent);
            }
        });
    }
}
