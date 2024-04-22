/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssemblyPlant;

import java.util.ArrayList;

import Provider.Hyundai;
import Provider.Renault;

/**
 *
 * @author HP
 */
public class AssemblyPlant {

    private int maxCars;
    private ArrayList<Car> cars;

    public void providerSummary() {
        int renault_count = 0;
        int hyundai_count = 0;

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getProvider().equals("Hyundai")) {
                hyundai_count++;
            } else if (cars.get(i).getProvider().equals("Renault")) {
                renault_count++;
            }
        }

        System.out.println("Providers Summary:");
        System.out.println("");
        System.out.println("- Cars using Renault = " + renault_count);
        System.out.println("- Cars using Hyundai = " + hyundai_count);
        System.out.println("");

        for (int i = 0; i < cars.size(); i++)
            System.out.println("- Car " + i + " uses " + cars.get(i).getProvider() + " Provider");
    }

}
