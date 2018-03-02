package com.watson.collections;

import java.util.*;

public class runCollections {

    public static void main(String[] args) {
        //Define collections
        ArrayList<String> cars = new ArrayList<String>(); //List
        HashSet<String> setA = new HashSet<String>(); //Set
        HashMap<String, String> mapA = new HashMap<String, String>(); //Map
        Collection<String> vehicles = new HashSet<String>();

        //Car Collection
        collections carsObject = new collections();
        collections carsObject2 = new collections();
        collections carsObject3= new collections();
        collections carsObject4 = new collections();
        collections carsObject5 = new collections();
        carsObject.setVehicle("Nissan ", "Sedan", 2013);
        carsObject2.setVehicle("VW", "Jetta", 2012);
        carsObject3.setVehicle("Ford", "F-150", 2014);
        carsObject4.setVehicle("Porshe", "Cayenne GTS", 2015);
        carsObject5.setVehicle("Lamborghini", "Huracan", 2016);
        cars.add(carsObject.toString());
        cars.add(carsObject2.toString());
        cars.add(carsObject3.toString());
        cars.add(carsObject4.toString());
        cars.add(carsObject5.toString());

        //Motorcycle Collection
        collections bikeObject1 = new collections();
        collections bikeObject2 = new collections();
        collections bikeObject3 = new collections();
        collections bikeObject4 = new collections();
        bikeObject1.setVehicle("Honda", "Fireblade", 2015);
        bikeObject2.setVehicle("BMW", "S1000rr Hp4", 2014);
        bikeObject3.setVehicle("Yamaha", "Starbolt", 2014);
        bikeObject4.setVehicle("Kawasaki", "Ninja ZX-7R", 2015);
        setA.add(bikeObject1.toString());
        setA.add(bikeObject2.toString());
        setA.add(bikeObject3.toString());
        setA.add(bikeObject4.toString());

        //Map Collection
        mapA.put("1",bikeObject1.toString());
        mapA.put("2", carsObject.toString());
        mapA.put("3", bikeObject2.toString());
        mapA.put("4", carsObject5.toString());
        String[] mapElements = new String[4];
        mapElements[0] = (String) mapA.get("1");
        mapElements[1] = (String) mapA.get("2");
        mapElements[2] = (String) mapA.get("3");
        mapElements[3] = (String) mapA.get("4");

        //Generic Collection
        vehicles.add(carsObject2.toString());
        vehicles.add(bikeObject3.toString());
        vehicles.add(carsObject3.toString());
        vehicles.add(bikeObject4.toString());
        vehicles.add(carsObject4.toString());
        vehicles.toArray();
        System.out.println("This is an ArrayList collection");
        for( int w = 0; w < cars.size(); w++)
        {
            System.out.println(cars.get(w));
        }
        System.out.println("\n\nThis is a HashSet collection");
        for(int m = 0; m < setA.size(); m++)
        {
            System.out.println(setA);
        }
        System.out.println("\n\nThis is a Map collection");
        for(int s = 0; s < mapElements.length; s++)
        {
            System.out.println(mapElements[s]);
        }

        System.out.println("\n\nThis is a generic Collection");
        for(int s = 0; s < mapElements.length; s++)
        {
            System.out.println(vehicles);
        }
    }


}
