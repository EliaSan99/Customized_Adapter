package com.example.actv4customizedadapter;

public class Info
{
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;

    public Info() {}

    public Info(String nombre, String apellidop, String apellidom)
    {
        this.nombre = nombre;
        ApellidoP = apellidop;
        ApellidoM = apellidom;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidoP() {return ApellidoP;}

    public void setApellidoP(String apellidoP) {ApellidoP = apellidoP;}

    public String getApellidoM() {return ApellidoM;}

    public void setApellidoM(String apellidoM) {ApellidoM = apellidoM;}

    @Override
    public String toString(){
        return nombre+"  "+ApellidoP+"  "+ApellidoM;
    }
}
