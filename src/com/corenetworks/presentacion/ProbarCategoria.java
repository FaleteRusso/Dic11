package com.corenetworks.presentacion;

import com.corenetworks.modelo.Categoria;

import java.util.ArrayList;

public class ProbarCategoria {
    public static void main(String[] args) {
        ArrayList<Categoria>cat = new ArrayList<>();
        cat.add(new Categoria(12,"Droguitas","manteca"));
        cat.add(new Categoria(16,"aviones","gps"));
        cat.add(new Categoria(21,"Where","llegó a su destino"));
        System.out.println(cat);
    }
}
