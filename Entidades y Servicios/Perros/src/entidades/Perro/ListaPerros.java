/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.Perro;

import java.util.ArrayList;

public class ListaPerros {
    private ArrayList<Perro> perros;

    public ListaPerros() {
        perros = new ArrayList<>();
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }
}
