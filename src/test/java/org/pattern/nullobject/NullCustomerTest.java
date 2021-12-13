package org.pattern.nullobject;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.pattern.nullobject.NullCustomer.NULL_CUSTOMER_NAME;

class NullCustomerTest {

    @ParameterizedTest
    @ValueSource(strings = {"Rob", "Julie"})
    void canBeCustomerTest(String input) {
        AbstractCustomer customer = CustomerFactory.getCustomer(input);
        assertEquals(input, customer.getName());
        assertFalse(customer.isNil());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Bob", "Laura"})
    void canBeNullCustomerTest(String input) {
        AbstractCustomer customer = CustomerFactory.getCustomer(input);
        assertEquals(NULL_CUSTOMER_NAME, customer.getName());
        assertTrue(customer.isNil());
    }
}
