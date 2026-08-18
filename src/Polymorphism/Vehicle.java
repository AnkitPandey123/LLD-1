package Polymorphism;

public class Vehicle {
     String name = "Vehicle";
     private int counter;
     private final int vid = 0;


     public void pr()
     {
          System.out.println(name);
     }

     @Override
     public boolean equals(Object o)
     {
          return this.counter - o.counter;
     }

}
