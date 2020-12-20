/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_;

/**
 *
 * @author v.rublova
 */
public abstract class State {

    Paper paper;

    State(Paper paper) {
        this.paper = paper;
    }

    public abstract String Fail();

    public abstract String Success();
}
