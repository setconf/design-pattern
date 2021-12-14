package org.pattern.visitor;

public class AlcatelRouter implements Router {

    @Override
    public void sendData(char[] data) {
        //implementation
    }

    @Override
    public void acceptData(char[] data) {
        //implementation
    }

    @Override
    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
