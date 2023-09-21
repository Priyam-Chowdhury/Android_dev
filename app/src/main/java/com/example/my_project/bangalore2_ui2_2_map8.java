package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class bangalore2_ui2_2_map8 extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore2_ui22_map8);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map8);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }

    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(12.9765, 77.5985);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Bangalore Aquarium"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}