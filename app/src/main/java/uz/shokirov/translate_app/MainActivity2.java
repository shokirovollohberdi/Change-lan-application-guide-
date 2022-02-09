package uz.shokirov.translate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import uz.shokirov.translate_app.utils.LanguageManager;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnUz = findViewById(R.id.uzb);
        Button btnEng = findViewById(R.id.eng);
        LanguageManager lang = new LanguageManager(this);
        btnEng.setOnClickListener(view -> {
           lang.updateResource("en");
           recreate();
        });

        btnUz.setOnClickListener(view -> {
            lang.updateResource("uz");
            recreate();
        });
    }
}