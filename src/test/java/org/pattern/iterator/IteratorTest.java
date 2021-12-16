package org.pattern.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    void IteratorPatternTest() {
        int index = 0;
        Topic[] topics = new Topic[5];
        topics[0] = new Topic("topic1");
        topics[1] = new Topic("topic2");
        topics[2] = new Topic("topic3");
        topics[3] = new Topic("topic4");
        topics[4] = new Topic("topic5");
        List<Topic> list = new TopicList(topics);
        Iterator<Topic> iterator = list.iterator();

        while (iterator.hasNext()) {
            assertEquals(topics[index], iterator.next());
            assertEquals(topics[index], iterator.currentItem());
            index++;
        }
        assertFalse(iterator.hasNext());

        iterator.reset();
        assertTrue(iterator.hasNext());
        assertEquals(topics[0], iterator.currentItem());
    }
}
