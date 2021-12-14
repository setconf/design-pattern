package org.pattern.templatemethod;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.verifyNoMoreInteractions;

class TemplateMethodTest {


    @ParameterizedTest
    @ValueSource(classes = {Cricket.class, Football.class})
    void templateMethodPatternTest(Class<Game> clazz) {
        Game game = Mockito.spy(clazz);
        game.play();
        InOrder orderVerifier = Mockito.inOrder(game);
        orderVerifier.verify(game).play();
        orderVerifier.verify(game).initializePlay();
        orderVerifier.verify(game).startPlay();
        orderVerifier.verify(game).endPlay();
        verifyNoMoreInteractions(game);
    }
}
