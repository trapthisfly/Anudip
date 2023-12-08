// 2.Write a Java program that demonstrates method overriding 
// by creating a superclass called Animal and two subclasses 
// called Dog and Cat. 
// ● The Animal class should have a method 
// called makeSound(), which simply prints "The animal makes 
// a sound." 
// ● The Dog and Cat classes should override this 
// method to print "TheCat/The dog meows/barks" respectively. 
// ● The program should allow the user to create and display 
// objects of each class.

import java.util.Scanner;
public class Overriding {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which sound do you want: ");
    System.out.println("1. Animal");
    System.out.println("2. Cat");
    System.out.println("3. Dog");
    int ch = sc.nextInt();
    switch (ch) {
      case 1:
        Animal an = new Animal();
        an.makeSound();
        break;
      case 2:
        Cat c = new Cat();
        c.makeSound();
        break;
      case 3:
        Dog d = new Dog();
        d.makeSound();
        break;
      default:
        break;
    }
  }
}
public class Animal {
  void makeSound(){
    System.out.println("Animal makes a sound");
  }
}
public class Dog extends Animal {
  void makeSound(){
    System.out.println("The dog barks");
  }
}
public class Cat extends Animal {
  void makeSound(){
    System.out.println("The cat meows");
  }
}
