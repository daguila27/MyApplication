package com.example.casa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AdaptadordeFotos adaptador;
    GridView grid_photos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_photos = (GridView) findViewById(R.id.grid_photos);
        adaptador = new AdaptadordeFotos(this);
        grid_photos.setAdapter(adaptador);
    }
}
