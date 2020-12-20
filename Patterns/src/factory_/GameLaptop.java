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
public class GameLaptop implements Laptop{

    
    GameLaptop(){
        Paint();
        Hardware();        
    }
    @Override
    public void Paint() {
        System.out.println("This laptop is painted red");
    }

    @Override
    public void Hardware() {
        System.out.println("The RAM cap is 8 GB");
    }
    
}
