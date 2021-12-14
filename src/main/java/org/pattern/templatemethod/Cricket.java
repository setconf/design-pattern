package org.pattern.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cricket implements Game {

    @Override
    public void endPlay() {
        log.info("Cricket Game Finished!");
    }

    @Override
    public void initializePlay() {
        log.info("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        log.info("Cricket Game Started. Enjoy the game!");
    }
}