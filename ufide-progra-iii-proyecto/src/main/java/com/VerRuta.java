package com;


import dao.Ruta;
import dao.RutaRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "verRuta")
@RequestScoped
public class VerRuta extends Ruta {
    private List<Ruta> listaRutas = new ArrayList<Ruta>();

    public List<Ruta> getListaRuta() {
        return listaRutas;
    }

    public VerRuta() {
    }

    @PostConstruct //esteroides a un metodo
    public void init() { //este es para ver todos
        RutaRepositorio rutaRepositorio = new RutaRepositorio();
        this.listaRutas = rutaRepositorio.leerRuta();
    }

}
