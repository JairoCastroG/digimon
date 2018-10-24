/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonapp;

/**
 *
 * @author alumno
 */
public class Pokemonapp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        pokemon p = new pokemon();
        p.setNivel(100);
        p.setNombre("raikuaza");
        pokebola d = new pokebola();
        d.setTipo("electrico");
        System.out.println(p.getNivel()+ p.getNombre());
        System.out.println(d.getTipo());
    }
    
}
