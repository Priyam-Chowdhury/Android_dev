package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class bangalore1_ui1_6_map6 extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore1_ui16_map6);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map6);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(12.9741, 77.6107);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Mayo Hall"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}