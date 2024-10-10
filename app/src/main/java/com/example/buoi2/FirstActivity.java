package com.example.buoi2;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    private String tag = "FirstActivityLog";
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(tag, "onCreate");

        setContentView(R.layout.layout_firstactivity);

        Button bt = findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // VIet code o day
//                Toast.makeText(FirstActivity.this,
//                        "Ban bam vao nut bam", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent();
                intent.setClass(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, "onDestroy");
    }
}
