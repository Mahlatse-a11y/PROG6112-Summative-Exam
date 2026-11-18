/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.apiAssertions.*;
/**
 *
 * @author Mahlatse
 */
public class ProductTest {
    int[][] testSales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    // Unit Test 1 - Total
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(testSales);
        assertEquals(153, product.GetTotalProductsSold());
    }

    // Unit Test 2 - Average
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(testSales);
        assertEquals(17.0, product.GetAverageProductSold(), 0.01);
    }
}
    
}
