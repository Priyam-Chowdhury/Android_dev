package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class bangalore6_ui6_2_map31 extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore6_ui62_map31);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map31);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(12.9849, 77.5896);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Jawaharlal Nehru Planetarium"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}