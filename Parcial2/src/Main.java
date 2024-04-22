
import AssemblyPlant.AssemblyPlant;

public class Main {
    
    public static void main(String[] args) {
        // Creation of assembly plant
        AssemblyPlant plant = new AssemblyPlant(20);
        
        // Data to build cars
        String[] providers = {
            "Renault", "Renault", "Renault", "Hyundai", "Renault", "Renault", 
            "Renault", "Renault", "Renault", "Hyundai", "Renault", "Hyundai", 
            "Hyundai", "Renault", "Hyundai", "Hyundai", "Renault", "Renault", 
            "Hyundai", "Renault", "Hyundai"
        };
        double[] radius = {
            0.56, 0.83, 0.03, 0.62, 0.25, 0.59, 0.27, 0.32, 0.55, 0.42, 0.71, 
            0.90, 0.59, 0.44, 0.37, 0.88, 0.34, 0.56, 0.13, 0.54, 0.22
        };
        String[] materials = {
            "Aluminium", "Steel", "Rubber", "Copper", "Steel", "Brass", 
            "Brass", "Aluminium", "Steel", "Rubber", "Rubber", "Brass", 
            "Aluminium", "Aluminium", "Rubber", "Rubber", "Brass", "Steel", 
            "Rubber", "Brass", "Steel"
        };
        double[] weights = {
            9.26, 3.07, 5.45, 3.76, 9.85, 1.44, 0.10, 5.12, 5.06, 2.89, 7.11, 
            2.53, 6.61, 8.20, 1.49, 6.76, 2.01, 5.80, 4.19, 1.73, 4.33
        };
        double[] costs = {
            1162.32, 3301.02, 1210.03, 6289.80, 2573.81, 2783.77, 1016.93, 
            9419.03, 1759.78, 3463.91, 3428.81, 4266.08, 4270.67, 306.48, 
            2268.44, 4545.44, 2005.93, 2083.33, 1162.79, 4711.99, 662.15
        };
        
        // Creation of cars
        for (int i = 0; i < providers.length; i++) {
            System.out.println("Car " + (i + 1) + " created");
            plant.addCar(new Car(providers[i], radius[i], materials[i], weights[i], costs[i]));
        }
        
        // Method execution
        plant.providerSummary();
        
        Car carBiggestWheel = plant.getCarBiggestWheel();
        System.out.println(carBiggestWheel + " wheel has the biggest radius with " + String.format("%.2f", carBiggestWheel.getWheel().getRadius()) + " meters");
    }
    
}

/*
------------- Resultados ------------- 

Assembly Plant started, waiting for Cars...

Car 1 created
RenaultWheel(0.56, Aluminium) created
RenaultEngine(9.26, 1162.32) created
Car 1 added to Assembly Plant

Car 2 created
RenaultWheel(0.83, Steel) created
RenaultEngine(3.07, 3301.02) created
Car 2 added to Assembly Plant

Car 3 created
RenaultWheel(0.03, Rubber) created
RenaultEngine(5.45, 1210.03) created
Car 3 added to Assembly Plant

Car 4 created
HyundaiWheel(0.62, Copper) created
HyundaiEngine(3.76, 6289.8) created
Car 4 added to Assembly Plant

Car 5 created
RenaultWheel(0.25, Steel) created
RenaultEngine(9.85, 2573.81) created
Car 5 added to Assembly Plant

Car 6 created
RenaultWheel(0.59, Brass) created
RenaultEngine(1.44, 2783.77) created
Car 6 added to Assembly Plant

Car 7 created
RenaultWheel(0.27, Brass) created
RenaultEngine(0.1, 1016.93) created
Car 7 added to Assembly Plant

Car 8 created
RenaultWheel(0.32, Aluminium) created
RenaultEngine(5.12, 9419.03) created
Car 8 added to Assembly Plant

Car 9 created
RenaultWheel(0.55, Steel) created
RenaultEngine(5.06, 1759.78) created
Car 9 added to Assembly Plant

Car 10 created
HyundaiWheel(0.42, Rubber) created
HyundaiEngine(2.89, 3463.91) created
Car 10 added to Assembly Plant

Car 11 created
RenaultWheel(0.71, Rubber) created
RenaultEngine(7.11, 3428.81) created
Car 11 added to Assembly Plant

Car 12 created
HyundaiWheel(0.9, Brass) created
HyundaiEngine(2.53, 4266.08) created
Car 12 added to Assembly Plant

Car 13 created
HyundaiWheel(0.59, Aluminium) created
HyundaiEngine(6.61, 4270.67) created
Car 13 added to Assembly Plant

Car 14 created
RenaultWheel(0.44, Aluminium) created
RenaultEngine(8.2, 306.48) created
Car 14 added to Assembly Plant

Car 15 created
HyundaiWheel(0.37, Rubber) created
HyundaiEngine(1.49, 2268.44) created
Car 15 added to Assembly Plant

Car 16 created
HyundaiWheel(0.88, Rubber) created
HyundaiEngine(6.76, 4545.44) created
Car 16 added to Assembly Plant

Car 17 created
RenaultWheel(0.34, Brass) created
RenaultEngine(2.01, 2005.93) created
Car 17 added to Assembly Plant

Car 18 created
RenaultWheel(0.56, Steel) created
RenaultEngine(5.8, 2083.33) created
Car 18 added to Assembly Plant

Car 19 created
HyundaiWheel(0.13, Rubber) created
HyundaiEngine(4.19, 1162.79) created
Car 19 added to Assembly Plant

Car 20 created
RenaultWheel(0.54, Brass) created
RenaultEngine(1.73, 4711.99) created
Car 20 added to Assembly Plant

Car 21 created
HyundaiWheel(0.22, Steel) created
HyundaiEngine(4.33, 662.15) created
Car limit reached, unable to add new Car

Providers Summary:

- Cars using Renault = 13
- Cars using Hyundai = 7

- Car 1 uses Renault Provider
- Car 2 uses Renault Provider
- Car 3 uses Renault Provider
- Car 4 uses Hyundai Provider
- Car 5 uses Renault Provider
- Car 6 uses Renault Provider
- Car 7 uses Renault Provider
- Car 8 uses Renault Provider
- Car 9 uses Renault Provider
- Car 10 uses Hyundai Provider
- Car 11 uses Renault Provider
- Car 12 uses Hyundai Provider
- Car 13 uses Hyundai Provider
- Car 14 uses Renault Provider
- Car 15 uses Hyundai Provider
- Car 16 uses Hyundai Provider
- Car 17 uses Renault Provider
- Car 18 uses Renault Provider
- Car 19 uses Hyundai Provider
- Car 20 uses Renault Provider

Car(Hyundai) wheel has the biggest radius with 0,90 meters
*/