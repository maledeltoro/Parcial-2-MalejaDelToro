/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

/**
 *
 * @author HP
 */
public class Renault implements Provider{
    public Engine makeEngine (float weight, float cost) {
        return RenaultEngine(weight, cost);
    }

    public Wheel makeWheel (float radius, String material) {
        return RenaultWheel(radius, material);
    }
}

