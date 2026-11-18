/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssales;
import java.util.Scanner;
/**
 *
 * @author Mahlatse
 */
public class MattressSales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Single Dimentional Array
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };
        
        //2 Dimentional Array 
        int[][] sales = new int[3][3];
        
        for(int i = 0; i < products.length; i++){
             for (int month = 0; month < 3; month++){
                 System.out.print("Enter number of sales for month"+ (month +1) + "for" + products[i] + "mattress:");
                 sales[i][month] = scanner.nextInt();
             }
                 System.out.println();
        }
        int totalSales = 0;
        int totalEntries = products.length*3;
        
        int highestSingleSale = -1;
        String mostPopularProduct = "";
        
        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales [i][j]; j++){
            int currentSale = sales[i][j];
            totalSales += currentSale;
            if(currentSale > highestSingleSale){
            highestSingleSale = currentSale;
            mostPopularProduct = products[i];}
        }
      }
        int averageSales = totalSales / totalEntries;
        
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*****************************************");
        System.out.println("TOTAL PRODUCT SALES:" + totalSales);
        System.out.println("AVERAGE PRODUCT SALES:" + averageSales);
        System.out.println("MOST POPULAR PRODUCT:" + mostPopularProduct);
        
        scanner.close();
    }
}
