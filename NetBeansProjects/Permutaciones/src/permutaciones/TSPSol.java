/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package permutaciones;

import java.util.List;


public class TSPSol {
    
    private List<Ciudad> ciudades;
    private int id;

    public TSPSol(int id, List<Ciudad> ciudades) {
        this.ciudades = ciudades;
        this.id = id;
    }

    @Override
    public String toString() {
        return "TspSol {" + id + " " + ciudades + "} = " + this.getFitness();
        
    }
    
    public double getFitness(){
        double salida =0.0;
        
        for (int i=0; i < ciudades.size()-1; i++){
            salida += ciudades.get(i).distancia(ciudades.get(i+1));
        }
        salida += ciudades.get(0).distancia(ciudades.get(ciudades.size()-1));
        
        return salida;
    }
}
    
