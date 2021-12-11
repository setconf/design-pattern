package org.pattern.observer;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MessageSubscriberThree implements Observer {
    private Message message;

    @Override
    public void update(Message message) {
        this.message = message;
        log.info("MessageSubscriberThree :: {}", message.getMessageContent());
    }
}
