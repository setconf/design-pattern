package org.pattern.visitor;

/*
 * If you have been in working on a application which manage plenty of products, then you can easily relate with this
 * problem: “You need to add a new method to a hierarchy of classes, but the act of adding it might be painful or
 * damaging to the design.”
 *
 * So clearly, you want a hierarchy of objects to modify their behavior but without modifying their source code.
 * How to do that? To solve this problem, visitor pattern comes into picture.
 *
 * In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class.
 * By this way, execution algorithm of element can vary as and when visitor varies.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/visitor-design-pattern-example-tutorial/">Visitor pattern</a>
 * */
public interface RouterVisitor {
    void visit(AlcatelRouter router);

    void visit(CiscoRouter router);

    void visit(EnterasysRouter router);
}
