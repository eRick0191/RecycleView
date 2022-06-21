package com.example.recycleview;

import java.util.ArrayList;


public class Alumno {
    private String carrera;
    private String nombre;
    private int img;
    private String matricula;


    public Alumno(String carrera, String nombre, int img, String matricula) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.img = img;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImg() {
        return img;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static  ArrayList<Alumno> llenarAlumno(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String carrera = "Ing. Tec. Informacion";
        alumnos.add(new Alumno(carrera, "GOMEZ CAMARENA JOSE RICARDO", R.drawable.a01,"2017030274"));
        alumnos.add(new Alumno(carrera, "PEÑA SOLIS DIEGO ARMANDO", R.drawable.a02,"2017030432"));
        alumnos.add(new Alumno(carrera, "GARCIA SILVA ADRIAN", R.drawable.a03,"2018030098"));
        alumnos.add(new Alumno(carrera, "GARCIA RODRIGUEZ JESUS EFRAIN", R.drawable.a04,"2018030099"));
        alumnos.add(new Alumno(carrera, "LIZARRAGA CAMACHO JESUS ARMANDO", R.drawable.a05,"2018030103"));
        alumnos.add(new Alumno(carrera, "GARCIA GOMEZ JUAN ANTONIO", R.drawable.a06,"2018030108"));
        alumnos.add(new Alumno(carrera, "LIZARRAGA LUNA JUAN FRANCISCO", R.drawable.a07,"2018030119"));
        alumnos.add(new Alumno(carrera, "OSUNA HIGUERA ALEJANDRO", R.drawable.a08,"2018030121"));
        alumnos.add(new Alumno(carrera, "MARIN GALINDO KIMBERLY VANESSA", R.drawable.a10,"2018030133"));
        alumnos.add(new Alumno(carrera, "PERAZA SAINZ ANGEL ADRIAN", R.drawable.a09,"2018030155"));
        return alumnos;
    }
}
