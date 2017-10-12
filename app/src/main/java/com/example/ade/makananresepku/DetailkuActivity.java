package com.example.ade.makananresepku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailkuActivity extends AppCompatActivity {
    ImageView gambar;
    TextView tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailku);
          Bundle b = getIntent().getExtras();
        tv3=(TextView)findViewById(R.id.tr);
        tv4=(TextView)findViewById(R.id.td);
        gambar=(ImageView)findViewById(R.id.gambar);
        tv3.setText(b.getString("resep"));
        tv4.setText(b.getString("procedur"));
        gambar.setImageResource(b.getInt("gambar"));
        setTitle(b.getString("label"));

    }

}
