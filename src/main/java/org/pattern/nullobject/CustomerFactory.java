package org.pattern.nullobject;

public class CustomerFactory {

    private static final String[] names = {"Rob", "Joe", "Julie"};

    private CustomerFactory() {
    }

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
