package com.example.hanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgmap = findViewById(R.id.img_map);
        imgmap.setOnClickListener(this);
        ImageView imgmap2 = findViewById(R.id.img_map2);
        imgmap2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent pindahmap = new Intent(MainActivity.this,MapsActivity.class);
        startActivity(pindahmap);
        Intent pindahabout = new Intent(MainActivity.this,About.class);
        startActivity(pindahabout);
    }
}
