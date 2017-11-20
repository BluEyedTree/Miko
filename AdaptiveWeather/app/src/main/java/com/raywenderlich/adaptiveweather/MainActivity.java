package com.raywenderlich.adaptiveweather;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.flexbox.FlexboxLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private List<Location> mLocations = new ArrayList<>();
  LocationAdapter mLocationAdapter;
  private static final String SELECTED_LOCATION_INDEX = "selectedLocationIndex";
  ImageButton _FoodButton;
  ImageButton _SocialButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("FODD sdsadasd PRESSED");
    setContentView(R.layout.forecast_grid);

    initializeElements();
    setListeners();


  }
  private void setListeners(){
    _FoodButton.setOnClickListener(this);
    _SocialButton.setOnClickListener(this);
  }

  private void initializeElements(){
    _FoodButton = (ImageButton)findViewById(R.id.FoodButton);
    _SocialButton = (ImageButton)findViewById(R.id.SocialButton);
  }

  @Override
  public void onClick(View view) {
    switch(view.getId()){
      case R.id.FoodButton:
        System.out.println("FODD BUTTON PRESSED");
        Intent toMenuActivity = new Intent(getApplicationContext(), ResultScreen.class);
        //Grabbing the username to display in the Menu activity
        //Starting the Menu activity

        startActivity(toMenuActivity);
        break;
      case R.id.SocialButton:
        //Starting the Signup activity
        Intent resultScreen = new Intent(getApplicationContext(), ResultScreen.class);
        startActivity(resultScreen);
        break;
    }
  }
}
