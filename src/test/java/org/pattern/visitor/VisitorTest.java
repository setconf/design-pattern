package org.pattern.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.pattern.visitor.*;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class VisitorTest {
    private MacConfigurator macConfigurator;
    private LinuxConfigurator linuxConfigurator;

    @BeforeEach
    public void setUp() {
        macConfigurator = Mockito.spy(MacConfigurator.class);
        linuxConfigurator = Mockito.spy(LinuxConfigurator.class);
    }

    @Test
    void testAlcatelRouter() {
        AlcatelRouter alcatelRouter = Mockito.spy(AlcatelRouter.class);

        alcatelRouter.accept(macConfigurator);
        verify(alcatelRouter).accept(macConfigurator);
        verifyNoMoreInteractions(alcatelRouter);
        verify(macConfigurator).visit(alcatelRouter);
        verifyNoMoreInteractions(macConfigurator);

        alcatelRouter.accept(linuxConfigurator);
        verify(alcatelRouter).accept(linuxConfigurator);
        verifyNoMoreInteractions(alcatelRouter);
        verify(linuxConfigurator).visit(alcatelRouter);
        verifyNoMoreInteractions(linuxConfigurator);
    }

    @Test
    void testCiscoRouter() {
        CiscoRouter ciscoRouter = Mockito.spy(CiscoRouter.class);

        ciscoRouter.accept(macConfigurator);
        verify(ciscoRouter).accept(macConfigurator);
        verifyNoMoreInteractions(ciscoRouter);
        verify(macConfigurator).visit(ciscoRouter);
        verifyNoMoreInteractions(macConfigurator);

        ciscoRouter.accept(linuxConfigurator);
        verify(ciscoRouter).accept(linuxConfigurator);
        verifyNoMoreInteractions(ciscoRouter);
        verify(linuxConfigurator).visit(ciscoRouter);
        verifyNoMoreInteractions(linuxConfigurator);
    }

    @Test
    void testEnterasysRouter() {
        EnterasysRouter enterasysRouter = Mockito.spy(EnterasysRouter.class);

        enterasysRouter.accept(macConfigurator);
        verify(enterasysRouter).accept(macConfigurator);
        verifyNoMoreInteractions(enterasysRouter);
        verify(macConfigurator).visit(enterasysRouter);
        verifyNoMoreInteractions(macConfigurator);

        enterasysRouter.accept(linuxConfigurator);
        verify(enterasysRouter).accept(linuxConfigurator);
        verifyNoMoreInteractions(enterasysRouter);
        verify(linuxConfigurator).visit(enterasysRouter);
        verifyNoMoreInteractions(linuxConfigurator);
    }
}

