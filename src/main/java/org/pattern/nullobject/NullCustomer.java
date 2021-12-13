package org.pattern.nullobject;

/*
 * In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting if check for
 * a null value, Null Object reflects a do nothing relationship. Such Null object can also be used to provide default
 * behaviour in case data is not available.
 *
 * In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes
 * extending this class and a null object class providing do nothing implementation of this class and will be used
 * seamlessly where we need to check null value.
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm">Null Object pattern</a>
 * */
public class NullCustomer extends AbstractCustomer {
    static final String NULL_CUSTOMER_NAME = "Not Available in Customer Database";

    @Override
    public String getName() {
        return NULL_CUSTOMER_NAME;
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
