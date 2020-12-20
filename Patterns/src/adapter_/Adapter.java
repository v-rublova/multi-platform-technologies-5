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
public class Adapter implements GroundVehicle {
    WaterVehicle boat;
    public Adapter(Boat b){
        boat = b;
    }
    @Override
    public void GroudMove() {
        boat.WaterMove();
    }
}
