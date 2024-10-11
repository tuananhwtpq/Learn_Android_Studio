package com.example.buoi2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    public static int TRAVETU_ACTIVITY2 = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent i = getIntent();

        String dulieu = i.getStringExtra("dulieu");
        EditText ed = findViewById(R.id.secondEditText);
        ed.setText(dulieu);

        Button bt = findViewById(R.id.previousBtn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent();
//                intent.setClass(SecondActivity.this, FirstActivity.class);
//                startActivity(intent);

                Intent i = new Intent();
                String s = ed.getText().toString();
                i.putExtra("dulieu", s);
                setResult(TRAVETU_ACTIVITY2, i);

                finish();

            }
        });



    }
}