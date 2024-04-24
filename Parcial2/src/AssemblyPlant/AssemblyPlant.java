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
    private ArrayList<Car> cars = new ArrayList<Car>();
    
    public AssemblyPlant (int maxCars) {
        this.maxCars = maxCars;
    }

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

    public Car getCarBiggestWheel() {
        Car car = this.cars.get(0);
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getWheel().getRadius() > car.getWheel().getRadius()) {
                car = this.cars.get(i);
            }
        }
        
        return car;
    }

    public void addCar(Car car) {
        
        if (this.cars.size() == this.maxCars) {
            System.out.println("Car limit reached, unable to add new Car");
            System.out.println("");
            return;
        }
        
        this.cars.add(car);
        System.out.println("Car "+this.cars.size()+" added to Assembly Plant");
        System.out.println("");
    }

}
