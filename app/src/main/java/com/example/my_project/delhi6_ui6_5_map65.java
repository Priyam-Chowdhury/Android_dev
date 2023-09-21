package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class delhi6_ui6_5_map65 extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi6_ui65_map65);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map65);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(28.6389,  77.2459);
        myMap.addMarker(new MarkerOptions().position(sydney).title("National Gandhi Museum"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}