package com.example.casa.myapplication;

/**
 * Created by CASA on 14/05/2017.
 */

public class Foto {
    private int id_drawable;
    private String nombre_foto;

    public Foto(int idDrawable, String nombre){
        id_drawable = idDrawable;
        nombre_foto = nombre;
    }

    public int getIddrawable(){
        return this.id_drawable;
    }

    public String getNombre(){
        return this.nombre_foto;
    }

    public int getId() {
        return this.nombre_foto.hashCode();
    }

    public static Foto ITEMS[] = {
            new Foto(R.drawable.crisantemo, "Chrysanthemun"),
            new Foto(R.drawable.desierto, "Desert"),
            new Foto(R.drawable.hortensias, "Hydrangeas"),
            new Foto(R.drawable.medusa, "Jellyfish"),
            new Foto(R.drawable.pinguinos, "Penguins"),
            new Foto(R.drawable.faro, "Faro")
    };
    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static Foto getItem(int id) {
        for (Foto item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
