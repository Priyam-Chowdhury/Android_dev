package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class bangalore1_ui1_5_map5 extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore1_ui15_map5);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map5);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }

    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(12.9742, 77.5953);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Venkatappa"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}