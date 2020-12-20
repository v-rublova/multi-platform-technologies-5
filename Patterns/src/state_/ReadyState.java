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
public class ReadyState extends State {

    ReadyState(Paper paper) {
        super(paper);
    }

    @Override
    public String Fail() {
        return "Your paper is done. No going back now.";
    }

    @Override
    public String Success() {
        paper.changeState(new SubmittedState(paper));
        return "Your paper is in teacher's hand.";
    }
}
