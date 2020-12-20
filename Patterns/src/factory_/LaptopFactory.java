/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_;

/**
 *
 * @author v.rublova
 * Main laptop factory
 */
public abstract class LaptopFactory {
    
    public void ManufactureLaptop(){
        Laptop laptop = createLaptop();
    }
    public abstract Laptop createLaptop();
}
