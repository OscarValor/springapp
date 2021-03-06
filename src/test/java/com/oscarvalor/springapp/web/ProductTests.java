package com.oscarvalor.springapp.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.oscarvalor.springapp.domain.Product;

public class ProductTests {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
    }

    @Test
    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescripcion());
        product.setDescripcion(testDescription);
        assertEquals(testDescription, product.getDescripcion());
    }

    @Test
    public void testSetAndGetPrice() {
        double testPrecio = 100.00;
        assertEquals(0, 0, 0);    
        product.setPrecio(testPrecio);
        assertEquals(testPrecio, product.getPrecio(), 0);
    }

}