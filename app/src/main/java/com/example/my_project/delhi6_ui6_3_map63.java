package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class delhi6_ui6_3_map63 extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi6_ui63_map63);
        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map63);

        // Initialize the map asynchronously
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;
        LatLng sydney = new LatLng(28.6305,  77.2415);
        myMap.addMarker(new MarkerOptions().position(sydney).title("Shankar's International Dolls Museum"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}