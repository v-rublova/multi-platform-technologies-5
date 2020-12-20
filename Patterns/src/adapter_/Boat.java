/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_;

/**
 *
 * @author v.rublova
 */
public class Boat implements WaterVehicle {

    @Override
    public void WaterMove() {
      System.out.println("Traversing the tides. (boat)");
    }
    
}
