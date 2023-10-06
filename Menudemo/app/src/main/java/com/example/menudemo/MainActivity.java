package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      int itemId = item.getItemId();
      if (itemId == R.id.action_search){
          Toast.makeText(this, "This is search", Toast.LENGTH_SHORT).show();
      }
      else if (itemId==R.id.home){
            Toast.makeText(this, "This is home", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}