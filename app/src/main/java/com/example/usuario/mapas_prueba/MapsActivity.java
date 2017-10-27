package com.example.usuario.mapas_prueba;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.usuario.mapas_prueba.datos.DatosApi;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Retrofit retrofit;
    public final static String  TAG="DATOS COLOMBIA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        retrofit = new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/").addConverterFactory(GsonConverterFactory.create()).build();

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
    public static BitmapDescriptor defaultMarker ;
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        DatosApi service=retrofit.create(DatosApi.class);
        Call<List<Migracion>> municipioCall=service.obtenerListaMunicipios();
        municipioCall.enqueue(new Callback<List<Migracion>>() {
            @Override
            public void onResponse(Call<List<Migracion>> call, Response<List<Migracion>> response) {
                {

                    if(response.isSuccessful())
                    {
                        List miLista=response.body();

                        for (int i = 0; i < miLista.size(); i++) {
                            Migracion m =(Migracion)miLista.get(i);

                            LatLng sydney = new LatLng(m.getLatitud(),m.getLongitud());
                            mMap.addMarker(new MarkerOptions().position(sydney).title(m.getNombreEstacion()).icon(BitmapDescriptorFactory.fromResource(R.drawable.aa)));
                            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,1));
                            mMap.getUiSettings().setZoomControlsEnabled(true);
                            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                            mMap.getUiSettings().setMapToolbarEnabled(true);
                           mMap.getUiSettings().setMyLocationButtonEnabled(true);



                        }
                        }
                    else
                    {
                        Log.e(TAG,"OnResponse" + response.errorBody());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Migracion>> call, Throwable t) {
                Log.e(TAG,"OnFailure" + t.getMessage());
            }



        });


        // Add a marker in Sydney and move the camera

    }
}
