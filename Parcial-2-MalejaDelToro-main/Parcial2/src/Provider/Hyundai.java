/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

import AssemblyPlant.Engine;
import AssemblyPlant.HyundaiEngine;
import AssemblyPlant.HyundaiWheel;
import AssemblyPlant.Wheel;

/**
 *
 * @author HP
 */
public class Hyundai implements Provider {

    @Override
    public Wheel makeWheel(double radius, String material) {
        System.out.println("HyundaiWheel("+radius+", "+material+") created");
        return new HyundaiWheel(radius, material);
    }

    @Override
    public Engine makeEngine(double weight, double cost) {
        System.out.println("HyundaiEngine("+weight+", "+cost+") created");
        return new HyundaiEngine(weight, cost);
    }
}
