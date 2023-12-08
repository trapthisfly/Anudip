// 1. Create one superclass HillStations and three subclasses Manali, 
// Mussoorie, Gulmarg. Subclasses extend the superclass and override its 
// location() and famousFor() method. i.call the location() and 
// famousFor() method by the Parent class’, i.e. Hillstations class. 
// As it refers to the base class object and the base class method 
// overrides the superclass method; the base class method is invoked 
// at runtime. ii.call the location() and famousFor() method by the 
// all subclass’,and print accordingly.
/**
 * Hills
 */
public class Hills {

  public static void main(String[] args) {
    HillStations hs = new HillStations();
    hs.location();
    hs.famousFor();
    Manali mn = new Manali();
    mn.location();
    mn.famousFor();
    Mussoorie ms = new Mussoorie();
    ms.location();
    ms.famousFor();
    Gulmarg g = new Gulmarg();
    g.location();
    g.famousFor();
  }
}
/**
 * HillStations
 */
public class HillStations {
  void location(){
    System.out.println("There are many HillStations in india, for example in Gujrat, we have Wilson Hills, in Shimla, we have Kufri etc.");
  }
  void famousFor(){
    System.out.println("Every HillStation has their own unique features and scenery you can enjoy.");
  }
}
/**
 * Manali
 */
public class Manali extends HillStations {
  void location(){
    System.out.println("Manali is located in Himachal Pradesh.");
  }
  void famousFor(){
    System.out.println("Manali is known for its unlimited adventure opportunities, the famous Hadimba Temple, the scenic Rohtang Pass, the snow-laden Solang Valley and its delightful culinary scene");
  }
}
/**
 * Mussoorie
 */
public class Mussoorie extends HillStations {

  void location(){
    System.out.println("Mussoorie is located in Uttarakhand.");
  }
  void famousFor(){
    System.out.println("Mussoorie, the queen of hill stations, is famous for its scenic beauty, good social life and entertainment.");
  }
}
/**
 * Gulmarg
 */
public class Gulmarg extends HillStations {

  void location(){
    System.out.println("Gulmarg is located in Jammu and Kashmir.");
  }
  void famousFor(){
    System.out.println("Gulmarg has attracted millions of tourists throughout its existence with the scenic beauty of the Himalayan Mountains in the back drop.");
  }
}
