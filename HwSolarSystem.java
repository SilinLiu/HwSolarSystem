


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

