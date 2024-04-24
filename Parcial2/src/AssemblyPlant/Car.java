/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssemblyPlant;

import Provider.Hyundai;
import Provider.Provider;
import Provider.Renault;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Car {
    
    private Provider provider;
    private Wheel wheel;
    private Engine engine;
    private AssemblyPlant plant;

    public Car(String provider1, double radius, String material, double weight, double cost) {
        provider = null;
        if (provider1.equals("Renault")) {
            provider = new Renault();
            this.wheel = provider.makeWheel(radius, material);
            this.engine = provider.makeEngine(weight, cost);
        } else if (provider1.equals("Hyundai")) {
            provider = new Hyundai();
            this.wheel = provider.makeWheel(radius, material);
            this.engine = provider.makeEngine(weight, cost);
        }
        
    }
    
    public Car(String provider1, double radius, String material, double weight, double cost, AssemblyPlant plant) {
        this.plant = plant;
        
        provider = null;
        if (provider1.equals("Renault")) {
            provider = new Renault();
            this.wheel = provider.makeWheel(radius, material);
            this.engine = provider.makeEngine(weight, cost);
        } else if (provider1.equals("Hyundai")) {
            provider = new Hyundai();
            this.wheel = provider.makeWheel(radius, material);
            this.engine = provider.makeEngine(weight, cost);
        }
        
    }
    
    public String getProvider() {
        if (this.provider instanceof Hyundai) 
            return "Hyundai";
        else if(this.provider instanceof Renault)
            return "Renault";
        else
            return "None";
        
    }    

    public Wheel getWheel() {
        return this.wheel;
    }
}
