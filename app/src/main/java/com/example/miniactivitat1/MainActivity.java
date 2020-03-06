package com.example.miniactivitat1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView)findViewById(R.id.textView);
        title.setText("Coronavirus COVID-19");

        TextView flag = (TextView)findViewById(R.id.textView1);
        flag.setText(R.string.flag);

        ImageView flagImage = (ImageView)findViewById(R.id.imageView);
        flagImage.setImageResource(R.drawable.flag);

        TextView country = (TextView)findViewById(R.id.textView2);
        country.setText(R.string.country);

        TextView countryContent = (TextView)findViewById(R.id.textView3);
        countryContent.setText(R.string.countryContent);

        TextView language = (TextView)findViewById(R.id.textView4);
        language.setText(R.string.language);

        TextView languageContent = (TextView)findViewById(R.id.textView5);
        languageContent.setText(R.string.languageContent);

        Button button = (Button)findViewById(R.id.button);
        button.setText(R.string.infecteds);
        button.setOnClickListener(new Toaster());
    }

    private class Toaster implements View.OnClickListener {
        public void onClick(View v) {
            Toast.makeText(getBaseContext(),getString(R.string.infectedsContent),Toast.LENGTH_SHORT).show();
        }
    }
}