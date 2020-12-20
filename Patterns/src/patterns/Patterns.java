/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import adapter_.Adapter;
import adapter_.Auto;
import adapter_.Boat;
import adapter_.Wanderer;
import factory_.GameLaptopFactory;
import factory_.LaptopFactory;
import factory_.OfficeLaptopFactory;
import java.util.Scanner;
import state_.Paper;

/**
 *
 * @author v.rublova
 */
public class Patterns {

    private static LaptopFactory laptop_factory;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Factory();        
        //Adapter();
        State();
    }

    static void Factory() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input factory type:");
        if ("office".equals(input.nextLine())) {
            laptop_factory = new OfficeLaptopFactory();
        } else {
            laptop_factory = new GameLaptopFactory();
        }
        laptop_factory.ManufactureLaptop();
    }

    static void Adapter() {

        Wanderer wanderer = new Wanderer();
        Auto auto = new Auto();
        System.out.println("Embarking on a journey!");
        wanderer.Wander(auto);
        System.out.println("Water ahead!");
        Boat boat = new Boat();
        Adapter adapter = new Adapter(boat);
        wanderer.Wander(adapter);
    }

    static void State() {
        Paper student_paper = new Paper();
        System.out.println(student_paper.getState().Success());
        System.out.println(student_paper.getState().Success());
        System.out.println(student_paper.getState().Fail());
        System.out.println(student_paper.getState().Success());
        System.out.println(student_paper.getState().Success());
    }
}
