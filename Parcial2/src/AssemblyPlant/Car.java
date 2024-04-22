/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssemblyPlant;

import Provider.Provider;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Car {
    
    private Provider provider;
    private Wheel wheel;
    private Engine engine;

    public String getProvider() {
        if (this.provider instanceof Hyundai) 
            return "Hyundai";
        else if(this.provider instanceof Renault)
            return "Renault";
        else
            return "None";
        
    }    
}
