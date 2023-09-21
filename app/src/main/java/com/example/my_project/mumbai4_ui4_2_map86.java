package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class mumbai4_ui4_2_map86 extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai4_ui42_map86);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map86);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(18.9476,72.8343);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Jyotiba phule market"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}