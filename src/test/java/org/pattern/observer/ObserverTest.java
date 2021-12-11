package org.pattern.observer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ObserverTest {

    @Test
    void observerPatternTest() {
        MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree subscriberThree = new MessageSubscriberThree();
        MessagePublisher publisher = new MessagePublisher();
        Message message1 = new Message("First Message");
        Message message2 = new Message("Second Message");

        publisher.attach(subscriberOne);
        publisher.attach(subscriberTwo);
        assertIterableEquals(List.of(subscriberOne, subscriberTwo), publisher.getObservers());

        publisher.notifyUpdate(message1);
        assertEquals(message1, subscriberOne.getMessage());
        assertEquals(message1, subscriberTwo.getMessage());

        publisher.detach(subscriberOne);
        publisher.attach(subscriberThree);
        assertIterableEquals(List.of(subscriberTwo, subscriberThree), publisher.getObservers());

        publisher.notifyUpdate(message2);
        assertEquals(message1, subscriberOne.getMessage());
        assertEquals(message2, subscriberTwo.getMessage());
        assertEquals(message2, subscriberThree.getMessage());
    }
}
