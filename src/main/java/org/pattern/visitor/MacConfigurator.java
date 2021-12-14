package org.pattern.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacConfigurator implements RouterVisitor {

    @Override
    public void visit(AlcatelRouter router) {
        log.info("AlcatelRouter configuration for Mac complete !!!");
    }

    @Override
    public void visit(CiscoRouter router) {
        log.info("CiscoRouter configuration for Mac complete !!!");
    }

    @Override
    public void visit(EnterasysRouter router) {
        log.info("EnterasysRouter configuration for Mac complete !!!");
    }
}
