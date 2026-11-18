/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Mahlatse
 */
public class Product  implements IProduct {
// Single-dimensional array for product names
    private String[] products = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    // Two-dimensional array for sales: [product][month]
    // Example: sales[0][0] = 25 = Cozy, Month 1
    private int[][] sales;

    // Constructor - receives the 2D sales array
    public Product(int[][] sales) {
        this.sales = sales;
    }

    // Total of all products sold
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    // Average = total / 9 (3 products x 3 months)
    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / 9;
    }

    // Most popular = product with highest single-month sale
    // Returns e.g. "Cozy Nights Monarch(25)" to match screenshot
    @Override
    public String GetMostPopularProduct() {
        int highest = sales[0][0];
        int index = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > highest) {
                    highest = sales[i][j];
                    index = i;
                }
            }
        }
        return products[index] + "(" + highest + ")";
    }
}
