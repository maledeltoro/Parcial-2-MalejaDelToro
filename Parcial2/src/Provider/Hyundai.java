/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

/**
 *
 * @author HP
 */
public class Hyundai implements Provider {
    
    public Engine makeEngine (float weight, float cost) {
        return HyundaiEngine(weight, cost);
    }

    public Wheel makeWheel (float radius, String material) {
        return HyundaiWheel(radius, material);
    }
}
