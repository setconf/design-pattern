package org.pattern.iterator;

public class TopicIterator implements Iterator<Topic> {

    private final Topic[] topics;
    private int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        position = 0;
    }

    public void reset() {
        position = 0;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    public Topic currentItem() {
        return topics[position == 0 ? 0 : position - 1];
    }

    @Override
    public boolean hasNext() {
        return position < topics.length;
    }
}