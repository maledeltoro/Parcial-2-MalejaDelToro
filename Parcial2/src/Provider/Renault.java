/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

import AssemblyPlant.Engine;
import AssemblyPlant.RenaultEngine;
import AssemblyPlant.RenaultWheel;
import AssemblyPlant.Wheel;

/**
 *
 * @author HP
 */
public class Renault implements Provider {

    @Override
    public Wheel makeWheel(double radius, String material) {
        System.out.println("RenaultWheel("+radius+", "+material+") created");
        return new RenaultWheel(radius, material);
    }

    @Override
    public Engine makeEngine(double weight, double cost) {
        System.out.println("RenaultEngine("+weight+", "+cost+") created");
        return new RenaultEngine(weight, cost);
    }
    
}

