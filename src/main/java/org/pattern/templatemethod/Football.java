package org.pattern.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Football implements Game {

    @Override
    public void endPlay() {
        log.info("Football Game Finished!");
    }

    @Override
    public void initializePlay() {
        log.info("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        log.info("Football Game Started. Enjoy the game!");
    }
}
