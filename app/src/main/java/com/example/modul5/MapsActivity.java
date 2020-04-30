package com.example.modul5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sekolah1 = new LatLng(-6.873596, 112.3406018);
        mMap.addMarker((new MarkerOptions().position(sekolah1).title("MA Muhammadiyah 02 Paciran")));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah1));

        LatLng sekolah2 = new LatLng(-6.8753659, 112.3400178);
        mMap.addMarker((new MarkerOptions().position(sekolah2).title("SMA Muhammadiyah 06 Paciran")));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah2));

        LatLng sekolah3 = new LatLng(-6.8732211, 112.3419849);
        mMap.addMarker((new MarkerOptions().position(sekolah3).title("SMA Mazra'atul Ulum 01 Paciran")));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah3));

        LatLng sekolah4 = new LatLng(-6.8684999, 112.3272621);
        mMap.addMarker((new MarkerOptions().position(sekolah4).title("SMK Muhammadiyah 08 Paciran")));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah4));


    }
}
