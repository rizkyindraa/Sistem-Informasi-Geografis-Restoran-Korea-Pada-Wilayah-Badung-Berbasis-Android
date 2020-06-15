package com.example.hanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    TextView datanama,datatelpon,dataalamat;
    Button btncall;
    ImageView datagambar;

    public static String id,nama,telpon,gambar,alamat;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama = findViewById(R.id.data_nama);
        datatelpon = findViewById(R.id.data_telpon);
        dataalamat = findViewById(R.id.data_alamat);
        btncall = findViewById(R.id.btn_call);
        datagambar = findViewById(R.id.data_gambar);

        Picasso.get().load(gambar).into(datagambar);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatelpon.setText(telpon);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+telpon));
        startActivity(call);
    }
}
