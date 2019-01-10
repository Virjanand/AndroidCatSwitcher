package com.virjanand.catswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int imageNr;

    public void switchCat(View view) {

        ImageView image = (ImageView)findViewById(R.id.imageView);

        if (imageNr == 1) {
            image.setImageResource(R.drawable.cat2);
            imageNr = 2;
        }
        else if (imageNr == 2) {
            image.setImageResource(R.drawable.cat1);
            imageNr = 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageNr = 1;
    }
}
