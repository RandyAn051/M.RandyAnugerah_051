package com.example.bismillah

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val man2 = LatLng(-2.411581,115.2474322)
        mMap.addMarker(MarkerOptions().position(man2).title("MAN2 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(man2))

        val mtsn2 = LatLng(-2.4041025,115.2451316)
        mMap.addMarker(MarkerOptions().position(mtsn2).title("MTSN2 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mtsn2))

        val man1 = LatLng(-2.415060,115.249287)
        mMap.addMarker(MarkerOptions().position(man1).title("Man1 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(man1))

        val opera = LatLng(-2.4119853,115.2469563)
        mMap.addMarker(MarkerOptions().position(opera).title("Rumahku"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(opera))

        val sma1 = LatLng(-2.4152357,115.2454618)
        mMap.addMarker(MarkerOptions().position(sma1).title("SMA1 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sma1))

        val smk3 = LatLng(-2.414700,115.245534)
        mMap.addMarker(MarkerOptions().position(smk3).title("SMK3 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk3))

        val smk1 = LatLng(-2.416200,115.245632)
        mMap.addMarker(MarkerOptions().position(smk1).title("SMK1 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk1))

        val smk2 = LatLng(-2.4124712,115.2468329)
        mMap.addMarker(MarkerOptions().position(smk2).title("SMKN2 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk2))

        val smp4 = LatLng(-2.414147,115.246228)
        mMap.addMarker(MarkerOptions().position(smp4).title("SMP4 Hsu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smp4))

        val options = PolylineOptions()
        options.color(Color.RED)
        options.width(10f)

        mMap.addPolyline(PolylineOptions().add(mtsn2,
                LatLng(-2.404129,115.245792),//jalan mtsn2
                LatLng(-2.404397,115.245839),//jalan mtsn2
                LatLng(-2.404519,115.245899),//jalan mtsn2
                LatLng(-2.404635,115.245974),//jalan mtsn2
                LatLng(-2.405872,115.246865),//jalan mtsn2
                LatLng(-2.405872,115.246865),//jalan mtsn2
                LatLng(-2.406195,115.246954),//jalan mtsn2
                LatLng(-2.407472,115.247213),//jalan mtsn2
                LatLng(-2.408579,115.247496),//jalan mtsn2
                LatLng(-2.408750,115.247607),//jalan mtsn2
                LatLng(-2.409332,115.248232),//jalan mtsn2
                LatLng(-2.410114,115.248714),//jalan mtsn2
                LatLng(-2.410389,115.248836),//jalan mtsn2
                LatLng(-2.410625,115.248896),//jalan mtsn2
                LatLng(-2.410901,115.248907),//jalan mtsn2
                LatLng(-2.411019,115.247922),//jalan mtsn2
                LatLng(-2.411084,115.247823),//jalan mtsn2
                LatLng(-2.4119853,115.2469563),//jalan mtsn2
                opera).width(10f).color(Color.RED))

        mMap.addPolyline(PolylineOptions().add(man2,
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4115397,115.2473808),//jalan man2
                LatLng(-2.4119853,115.2469563),//jalan man2
                opera).width(10f).color(Color.YELLOW))

        mMap.addPolyline(PolylineOptions().add(man1,
                LatLng(-2.415420,115.249668),//jalan man1
                LatLng(-2.414703,115.250428),//jalan man1
                LatLng(-2.413104,115.248376),//jalan man1
                LatLng(-2.412918,115.248164),//jalan man1
                LatLng(-2.412735,115.247958),//jalan man1
                LatLng(-2.411832,115.247081),//jalan man1
                LatLng(-2.411807,115.247079),//jalan man1
                opera).width(10f).color(Color.YELLOW))

        mMap.addPolyline(PolylineOptions().add(sma1,
                LatLng(-2.4151457,115.2459568),//jalan sma1
                LatLng(-2.413257,115.245796),//jalan sma1
                LatLng(-2.413138,115.245820),//jalan sma1
                LatLng(-2.413063,115.245875),//jalan sma1
                opera).width(10f).color(Color.GREEN))

        mMap.addPolyline(PolylineOptions().add(smk1,
                LatLng(-2.416144,115.246090),//jalan smk1
                LatLng(-2.413257,115.245796),//jalan smk1
                LatLng(-2.413138,115.245820),//jalan smk1
                LatLng(-2.413063,115.245875),//jalan smk1
                opera).width(10f).color(Color.GREEN))

        mMap.addPolyline(PolylineOptions().add(smk3,
                LatLng(-2.414655,115.245933),//jalan smk3
                LatLng(-2.413257,115.245796),//jalan smk3
                LatLng(-2.413138,115.245820),//jalan smk3
                LatLng(-2.413063,115.245875),//jalan smk3
                opera).width(10f).color(Color.GREEN))

        mMap.addPolyline(PolylineOptions().add(smk2,
                LatLng(-2.412343,115.246607),//jalan smkn2
                opera).width(10f).color(Color.BLUE))

        mMap.addPolyline(PolylineOptions().add(smp4,
                LatLng(-2.413898,115.246468),//jalan smp4
                LatLng(-2.413597,115.246184),//jalan smp4
                LatLng(-2.413450,115.245946),//jalan smp4
                LatLng(-2.413442,115.245914),//jalan smp4
                LatLng(-2.413442,115.245810),//jalan smp4
                LatLng(-2.413257,115.245796),//jalan smp4
                LatLng(-2.413138,115.245820),//jalan smp4
                LatLng(-2.413063,115.245875),//jalan smp4
                opera).width(10f).color(Color.BLUE))

    }
}
