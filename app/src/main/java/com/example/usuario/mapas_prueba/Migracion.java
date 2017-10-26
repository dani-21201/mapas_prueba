package com.example.usuario.mapas_prueba;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Migracion {

    @SerializedName("agencia")
    @Expose
    private String agencia;
    @SerializedName("altitud")
    @Expose
    private String altitud;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("fecha_instalacion")
    @Expose
    private String fechaInstalacion;
    @SerializedName("geologia")
    @Expose
    private String geologia;
    @SerializedName("id_estacion")
    @Expose
    private String idEstacion;
    @SerializedName("latitud")
    @Expose
    private Double latitud;
    @SerializedName("longitud")
    @Expose
    private Double longitud;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("nombre_estacion")
    @Expose
    private String nombreEstacion;
    @SerializedName("tipo_descarga")
    @Expose
    private String tipoDescarga;
    @SerializedName("tipo_estacion")
    @Expose
    private String tipoEstacion;
    @SerializedName("topografia")
    @Expose
    private String topografia;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public String getGeologia() {
        return geologia;
    }

    public void setGeologia(String geologia) {
        this.geologia = geologia;
    }

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getTipoDescarga() {
        return tipoDescarga;
    }

    public void setTipoDescarga(String tipoDescarga) {
        this.tipoDescarga = tipoDescarga;
    }

    public String getTipoEstacion() {
        return tipoEstacion;
    }

    public void setTipoEstacion(String tipoEstacion) {
        this.tipoEstacion = tipoEstacion;
    }

    public String getTopografia() {
        return topografia;
    }

    public void setTopografia(String topografia) {
        this.topografia = topografia;
    }

}