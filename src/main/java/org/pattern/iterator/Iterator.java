package org.pattern.iterator;

/*
 * According to GoF definition, an iterator pattern provides a way to access the elements of an aggregate object
 * sequentially without exposing its underlying representation. It is behavioral design pattern.
 *
 * As name implies, iterator helps in traversing the collection of objects in a defined manner which is useful
 * the client applications. During iteration, client programs can perform various other operations on the elements
 * as per requirements.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/iterator-design-pattern/">Iterator pattern</a>
 * */
public interface Iterator<E> {
    void reset();   // reset to the first element

    E next();   // To get the next element

    E currentItem();    // To retrieve the current element

    boolean hasNext();  // To check whether there is any next element or not.
}
