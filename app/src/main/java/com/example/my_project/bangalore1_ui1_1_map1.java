package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class bangalore1_ui1_1_map1 extends AppCompatActivity implements OnMapReadyCallback {


    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore1_ui11_map1);

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map1);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        myMap=googleMap;
        LatLng sydney=new LatLng(12.9594,77.5736);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Tipu sultan summer palace"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}