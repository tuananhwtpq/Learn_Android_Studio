package com.example.buoi2;

import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
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

                    //Toast.makeText(FirstActivity.this, "Pew pew",
                // Toast.LENGTH_SHORT).show();

//                    Intent intent = new Intent();
//                    intent.setClass(FirstActivity.this, SecondActivity.class);
//                    startActivity(intent);

                AlertDialog.Builder b = new AlertDialog.Builder(FirstActivity.this);
                b.setTitle("Erase your storage");
                b.setMessage("You will lose your database!");
                b.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                b.setNegativeButton("Eraze", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                b.create().show();
//
            }
        });

        CheckBox chk = findViewById(R.id.checkbox1);
        if(chk.isChecked()){
            Toast.makeText(FirstActivity.this, "Oke tot ot", Toast.LENGTH_LONG);
        }else {

        }





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
