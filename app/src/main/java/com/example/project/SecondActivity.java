package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button2 = findViewById(R.id.buttonToFirst);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePref();
                finish();
            }
        });
    }
    public void savePref() {
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("myPreferenceRef", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("MyAppPreferenceString", text);
        editor.apply();
    }
}