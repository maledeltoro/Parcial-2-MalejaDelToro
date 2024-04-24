/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

import AssemblyPlant.Engine;
import AssemblyPlant.Wheel;

/**
 *
 * @author HP
 */
public interface Provider {
    public Wheel makeWheel (double radius, String material);

    public Engine makeEngine (double weight, double cost); 
}
