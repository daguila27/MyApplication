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
            new Foto(R.drawable.Chrysanthemum, "Chrysanthemun"),
            new Foto(R.drawable.Desert, "Desert"),
            new Foto(R.drawable.Hydrangeas, "Hydrangeas"),
            new Foto(R.drawable.Jellyfish, "Jellyfish"),
            new Foto(R.drawable.Koala, "Koala"),
            new Foto(R.drawable.Penguins, "Penguins")
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
