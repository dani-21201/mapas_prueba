package com.example.usuario.mapas_prueba.datos;



import com.example.usuario.mapas_prueba.Migracion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by usuario on 23/10/2017.
 */

public interface DatosApi
{
    @GET("krh6-ay3a.json")
    Call<List<Migracion>> obtenerListaMunicipios();
}
