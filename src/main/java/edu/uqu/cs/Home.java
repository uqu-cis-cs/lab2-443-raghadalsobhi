package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Home{
	public static void main(String [] args){

		// Create an object of type Garage 
                //HERE
                Garage G=new Garage();


	        // Add "Toyota Corolla Cross" in the garage. Hint: use method addCar () of class Garage
                //HERE
                G.addCar("Toyota Corolla Cross");

                //List all the cars in the garage. Hint: use method listCars () of class Garage
                //HERE
                G.listCars();

                // Place "Ford Fusion" in the garage. Hint: use method addCar () of class Garage
                //HERE
                G.addCar("Ford Fusion");

 	        // List all the cars in the garage once again. Hint: use method listCars () of class Garage
                //HERE
                G.listCars();


               // Move out "Ford Fusion" from the garage. Hint: use method moveOut () of class Garage
               //HERE
               G.moveOut("Ford Fusion");


               // List all the cars in the garage. Hint: use method listCars () of class Garage
               //HERE
               G.listCars();

        }

}