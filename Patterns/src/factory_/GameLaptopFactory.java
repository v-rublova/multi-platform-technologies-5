/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_;

/**
 *
 * @author v.rublova
 */
public class GameLaptopFactory extends LaptopFactory {

    @Override
    public Laptop createLaptop() {
        return new GameLaptop();
    }
    
}