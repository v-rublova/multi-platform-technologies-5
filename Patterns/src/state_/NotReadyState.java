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
public class NotReadyState extends State {

    NotReadyState(Paper paper) {
        super(paper);
    }

    @Override
    public String Fail() {
        return "Your paper is a total failure.";
    }

    @Override
    public String Success() {
        paper.changeState(new ReadyState(paper));
        return "Your paper is ready for submission.";
    }
}
