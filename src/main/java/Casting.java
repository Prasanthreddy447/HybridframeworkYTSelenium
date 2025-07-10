
public class Casting {

	public static void main(String[] args) {
		
		/*
		 Upcasting
		 -----------
		 child class created object given to parent class reference variable
		 
		  parent p = new child();
		  
		 */
		
		/*
		 Downcasting
		 ------------
		 type casting the parent class object to child class refernce varaible
		 
		 
		 example:
		 ---------
							class Animal 
							{
					          public void makeSound() {
					           System.out.println("Animal makes a sound");
					              }
					         }
					
					class Dog extends Animal {
					    public void makeSound() {
					        System.out.println("Dog barks");
					     }
					}
					
					class Cat extends Animal {
					    public void makeSound() {
					        System.out.println("Cat meows");
					    }
					}
					
					public class Main {
					    public static void main(String[] args) {
					        Animal animal = new Dog();
					        
					        Dog d = (Dog)animal; --> down casting
					        
					        Cat cat = (Cat) animal; // ClassCastException here
					        
					        cat.makeSound(); // This line won't be reached due to the exception
					    }
					}
		 */
		
		/*
		 classcasteexceptionm
		 --------------------
		 jvm unable to resolve one type of object to another type of object at run time
		 
		 */

	}

}
