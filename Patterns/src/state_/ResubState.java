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
public class ResubState extends State {

    ResubState(Paper paper) {
        super(paper);
    }

    @Override
    public String Fail() {
        paper.changeState(new NotReadyState(paper));
        return "Your paper is not done.";
    }

    @Override
    public String Success() {
        paper.changeState(new ReadyState(paper));
        return "Your paper is not done.";
    }
}
