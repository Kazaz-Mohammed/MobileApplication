package com.example.mainapp;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class RecapActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        TextView tvRecap = findViewById(R.id.tvRecap);

        String recap = "Nom: " + getIntent().getStringExtra("name") + "\n" +
                "Prénom: " + getIntent().getStringExtra("prenom") + "\n" +
                "Âge: " + getIntent().getStringExtra("age") + "\n" +
                "Adresse: " + getIntent().getStringExtra("adresse") + "\n" +
                "Ville: " + getIntent().getStringExtra("ville");

        tvRecap.setText(recap);
    }
}
