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
public class VerifiedState extends State {

    VerifiedState(Paper paper) {
        super(paper);
    }

    @Override
    public String Fail() {
        paper.changeState(new ResubState(paper));
        return "This paper needs resubmission.";
    }

    @Override
    public String Success() {
        paper.SetDone();
        return "Your paper is done. Congrats.";
    }
}
