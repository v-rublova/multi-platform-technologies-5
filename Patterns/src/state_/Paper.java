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
public class Paper {

    private State state;
    private boolean done = false;

    public Paper() {
        this.state = new IssuedState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void SetDone() {
        this.done = true;
    }
}
