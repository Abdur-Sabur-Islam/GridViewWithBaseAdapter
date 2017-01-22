package com.bproperty.gridviewwithbaseadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageViewSelected = (ImageView) findViewById(R.id.selectedImageView);

        Intent intent = getIntent();
        imageViewSelected.setImageResource(intent.getIntExtra("image",0));

    }
}
