package com.bytebank.modelo;

public abstract class Funcionario {

    private String nombre;
    private String documento;
    private double salario;

    public abstract double getBonificacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documento;
    }

    public void setDocumento(String documentoIdentidad) {
        this.documento = documentoIdentidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}