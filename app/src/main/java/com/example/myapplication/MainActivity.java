package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id = item.getItemId();
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);

        switch (id) {
            case (R.id.action_settings): infoTextView.setText("Вы выбрали пункт "+getString(R.string.action_settings));
            imageView.setImageDrawable(getDrawable(R.drawable.settings));
                break;
            case (R.id.action_cat1): infoTextView.setText("Вы выбрали пункт "+getString(R.string.action_cat1));
                imageView.setImageDrawable(getDrawable(R.drawable.cake));
                break;
            case (R.id.action_cat2): infoTextView.setText("Вы выбрали пункт "+getString(R.string.action_cat2));
                imageView.setImageDrawable(getDrawable(R.drawable.rudolf));
                break;
            case (R.id.action_cat3): infoTextView.setText("Вы выбрали пункт "+getString(R.string.action_cat3));
                imageView.setImageDrawable(getDrawable(R.drawable.snowball));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}