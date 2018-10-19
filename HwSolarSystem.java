/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwsolarsystem;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;



/**
 *
 * @author silinliu
 */
//public class HwSolarSystem {
 
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    
//    private ArrayList<Planet> planets;
//    
//    public static void main(String[] args) throws Exception  {
//     new HwSolarSystem("solarsystem.dat");
//    }   

        // TODO code application logic here
//    class Planet(String name; String mass; String orbit; String distance){    
//    
//        public Planet(String name; String mass; String orbit; String distance) {
//            
//                public String Name;
//                public String orbit;
//                double Mass;
//                
//                double distance;   
//          
//            System.out.println(s.findInLine(planetName));
//            System.out.println(s.nextLine());
//                
//        }  
//
//       
//    }
//       
//        public HwSolarSystem(String file)  throws Exception {
//            String Sun = null;
//            String Earth = null;
//            String Moon = null;
//            String  Venus = null;
//                
//            FileReader fr = new FileReader(file);
//            Scanner s = new Scanner(new BufferedReader(fr));
//            System.out.println(s.nextLine());//prtint parameter's name
//               
//            Planet sun = new Planet(Sun);
//            Planet venus = new Planet(Venus);
//            Planet earth = new Planet(Earth);
//            Planet moon = new Planet(Moon);
//
//
//            planets.add(sun);
//            planets.add(venus);
//            planets.add(earth);
//            planets.add(moon);
//
//            
//        }
//        
//         
//    public class HwSolarSystem {
//    private ArrayList<Planet> planets;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
//    public static void main(String[] args) throws Exception  {
//        HwSolarSystem hwSolarSystem = new HwSolarSystem();        
//        hwSolarSystem.createSolarSystem("solarsystem.dat");
//        
//    }
//    
//        
//    public ArrayList<Planet> createSolarSystem(String file) throws Exception {
//        FileReader fr = new FileReader(file);
//        System.out.println("123");
//        Scanner s = new Scanner(new BufferedReader(fr));
//        System.out.println("123");
//        // Remove titles
//        s.nextLine();
//        System.out.println(s.nextLine());
//        while (s.hasNext()) {
//            String planetString = s.nextLine().replaceAll("\\s+", " ");
//            System.out.println(planetString.toString());
//            String[] planetData = planetString.split(" ");
//            System.out.println(planetData[9]);
//            Planet planet = new Planet(planetData[0], planetData[1], planetData[2], planetData[3], 
//                                    planetData[4], planetData[5], 
//            planets.add(planet);
//        }
//        
//        System.out.println("123");
//        return this.planets;
//        
//    }
//
//    public class Planet{   
//        public String name;
//        public String orbits;
//        public String mass;
//        public String diam;
//        public String perihelion;
//        public String aphelion;
//       
//        public Planet(String name, String orbits, String mass, 
//                    String diam, String perihelion, String aphelion) {
//            this.name = name;
//            this.orbits = orbits;
//            this.mass = mass;
//            this.diam = diam;
//            this.perihelion = perihelion;
//            this.aphelion = aphelion;
//            
//        }
//    }
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




///**
// *
// * @author silinliu
// */
//    public class HwSolarSystem {
//    public ArrayList<Planet> planets;
//    
//    /**
//     * @param args the command line arguments
//     * @throws java.lang.Exception
//     */
//    public static void main(String[] args) throws Exception  {
//        HwSolarSystem hwSolarSystem = new HwSolarSystem();
//        hwSolarSystem.createSolarSystem("./solarsystem.dat");
//
//
//    }
//    
        
//    public ArrayList<Planet> createSolarSystem(String file) throws Exception{
//        FileReader fr = new FileReader(file);
//        ArrayList<Planet> planets = new ArrayList<>();
//        Scanner s = new Scanner(new BufferedReader(fr));
//
//        // Remove titles
//        s.nextLine();
//        
//        while (s.hasNext()) {
//            String planetString = s.nextLine().replaceAll("\\s+", " ");
//            String[] planetData = planetString.split(" ");
//            Planet planet = new Planet(planetData[0], planetData[2], planetData[3], planetData[1], 
//                                    String.valueOf(Double.valueOf(planetData[4])) + Double.valueOf(planetData[5]));
//            this.planets.add(planet);
////               System.out.println(planetString);
//                System.out.println(planetData[0] + " " + planetData[2] + " " + planetData[3] + " " + planetData[1] + " " + planetData[4] + " " + planetData[5]);
//        }
//        return this.planets;
//    }
//
//    public class Planet{   
//        public String name;
//        public String mass;
//        public String diameter;
//        public String orbits;
//        public String meanDistanceToOrbits;
//        
//        public Planet(String name, String mass, String diameter, 
//                    String orbits, String meanDistanceToOrbits) {
//            System.out.println(name);
//            this.name = name;
//            this.orbits = orbits;
//            this.mass = mass;
//            this.diameter = diameter;
//            this.meanDistanceToOrbits = meanDistanceToOrbits;
//            System.out.println(name);
//            System.out.println(orbits);
//            System.out.println(mass);
//            System.out.println(diameter);
//            System.out.println(meanDistanceToOrbits);
//
//
//
//        }
//    }
//}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
//import javax.swing.*;
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.ArrayList;
//
///**
// *
// * @author silinliu
// */
//public class HwSolarSystem { 
//    private ArrayList<Planet> planets = new ArrayList<>();
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
//    public static void main(String[] args) throws Exception {
//        HwSolarSystem hwSolarSystem = new HwSolarSystem();
//        hwSolarSystem.createSolarSystem("./solarsystem.dat");
//    }
//        
//    public ArrayList<Planet> createSolarSystem(String file) throws Exception {
//        FileReader fr = new FileReader(file);
//        
//        Scanner s = new Scanner(new BufferedReader(fr));
//
//        // Remove titles
//        s.nextLine();
//        
//        while (s.hasNext()) {
//            String planetString = s.nextLine().replaceAll("\\s+", " ");
//            String[] planetData = planetString.split(" ");
//            System.out.println(planetData[0] + " " + planetData[2] + " " + planetData[3] + " " + planetData[1] + " " + planetData[4] + " " + planetData[5]);
//            Planet planet = new Planet(planetData[0], planetData[2], planetData[3], planetData[1], 
//              String.valueOf(Double.valueOf(planetData[4]) + Double.valueOf(planetData[5])));
//            this.planets.add(planet);
//        }
//        return this.planets;
//    }
//
//    public class Planet{   
//        public String name;
//        public String mass;
//        public String diameter;
//        public String orbits;
//        public String meanDistanceToOrbits;
//        
//        public Planet(String name, String mass, String diameter, 
//                    String orbits, String meanDistanceToOrbits) {
//            this.name = name;
//            this.orbits = orbits;
//            this.mass = mass;
//            this.diameter = diameter;
//            this.meanDistanceToOrbits = meanDistanceToOrbits;
//            
//            
//        }
//    }
//}


import java.io.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author silinliu
 */
public class HwSolarSystem { 
    private ArrayList<Planet> planets = new ArrayList<>();
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        HwSolarSystem hwSolarSystem = new HwSolarSystem();
        hwSolarSystem.createSolarSystem("./solarsystem.dat");
        System.out.println(hwSolarSystem.toString());
    }
        
    public ArrayList<Planet> createSolarSystem(String file) throws Exception {
        FileReader fr = new FileReader(file);
        Scanner s = new Scanner(new BufferedReader(fr));

        // Remove titles
        s.nextLine();
        
        while (s.hasNext()) {
            String planetString = s.nextLine().replaceAll("\\s+", " ");
            String[] planetData = planetString.split(" ");
            Planet planet = new Planet(planetData[0], planetData[2], planetData[3], planetData[1], 
              String.valueOf(Double.valueOf(planetData[4]) + Double.valueOf(planetData[5])));
            this.planets.add(planet);
        }
        return this.planets;
    }

    @Override
    public String toString() {
        return "{\"planets\":"+planets.toString()+"\"}";
    }

    public class Planet{   
        public String name;
        public String mass;
        public String diameter;
        public String orbits;
        public String meanDistanceToOrbits;
        
        public Planet(String name, String mass, String diameter, 
                    String orbits, String meanDistanceToOrbits) {
            this.name = name;
            this.orbits = orbits;
            this.mass = mass;
            this.diameter = diameter;
            this.meanDistanceToOrbits = meanDistanceToOrbits;
        }

        @Override
        public String toString() {
            return "{\"name\":"+name+", \"orbits\":\""+orbits+"\", \"mass\":"+mass+", \"diameter\":\""+diameter+"\", \"meanDistanceToOrbits\":"+meanDistanceToOrbits+"\"}";
        }
    }
}

