package org.pattern.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.pattern.chainofresponsibility.LogLevel.*;

/*
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request.
 * This pattern comes under behavioral patterns.
 *
 * In this pattern, normally each receiver contains reference to another receiver.
 * If one object cannot handle the request then it passes the same to the next receiver and so on.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/chain-of-responsibility-design-pattern/">Chain Of Responsibility pattern</a>
 * */
class ChainOfResponsibilityTest {
    private AbstractLogger errorLogger;
    private AbstractLogger fileLogger;
    private AbstractLogger consoleLogger;

    @BeforeEach
    public void initEach() {
        errorLogger = Mockito.spy(new ErrorLogger(ERROR));
        fileLogger = Mockito.spy(new FileLogger(DEBUG));
        consoleLogger = Mockito.spy(new ConsoleLogger(INFO));
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
    }

    @Test
    void shouldLogInfoMessageTest() {
        String infoMessage = "This is an information.";
        errorLogger.logMessage(INFO, infoMessage);

        verify(errorLogger).logMessage(INFO, infoMessage);
        verify(errorLogger, never()).write(infoMessage);

        verify(fileLogger).logMessage(INFO, infoMessage);
        verify(fileLogger, never()).write(infoMessage);

        verify(consoleLogger).logMessage(INFO, infoMessage);
        verify(consoleLogger).write(infoMessage);
    }

    @Test
    void shouldLogDebugMessageTest() {
        String debugMessage = "This is an debug level information.";
        errorLogger.logMessage(DEBUG, debugMessage);

        verify(errorLogger).logMessage(DEBUG, debugMessage);
        verify(errorLogger, never()).write(debugMessage);

        verify(fileLogger).logMessage(DEBUG, debugMessage);
        verify(fileLogger).write(debugMessage);

        verify(consoleLogger).logMessage(DEBUG, debugMessage);
        verify(consoleLogger).write(debugMessage);
    }

    @Test
    void shouldLogErrorMessageTest() {
        String errorMessage = "This is an error information.";
        errorLogger.logMessage(ERROR, errorMessage);

        verify(errorLogger).logMessage(ERROR, errorMessage);
        verify(errorLogger).write(errorMessage);

        verify(fileLogger).logMessage(ERROR, errorMessage);
        verify(fileLogger).write(errorMessage);

        verify(consoleLogger).logMessage(ERROR, errorMessage);
        verify(consoleLogger).write(errorMessage);
    }
}
