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
public class SubmittedState extends State {

    SubmittedState(Paper paper) {
        super(paper);
    }

    @Override
    public String Fail() {
        return "It is not yet verified to fail.";
    }

    @Override
    public String Success() {
        paper.changeState(new VerifiedState(paper));
        return "Your paper is verified. Await further decision.";
    }
}
