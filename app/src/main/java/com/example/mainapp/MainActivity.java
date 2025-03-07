package com.example.mainapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText etName, etPrenom, etAge, etAdresse, etVille;
    private Button btnEnvoyer, btnQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPrenom = findViewById(R.id.etPrenom);
        etAge = findViewById(R.id.etAge);
        etAdresse = findViewById(R.id.etAdresse);
        etVille = findViewById(R.id.etVille);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);
        btnQuitter = findViewById(R.id.btnQuitter);

        btnEnvoyer.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecapActivity.class);
            intent.putExtra("name", etName.getText().toString());
            intent.putExtra("prenom", etPrenom.getText().toString());
            intent.putExtra("age", etAge.getText().toString());
            intent.putExtra("adresse", etAdresse.getText().toString());
            intent.putExtra("ville", etVille.getText().toString());
            startActivity(intent);
        });

        btnQuitter.setOnClickListener(v -> finish());
    }
}