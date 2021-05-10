/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursiveLinearSearch;

import static RecursiveLinearSearch.RecursiveLinearSearch.recursiveLinearSearch;

/**
 *
 * @author Ryan Kolbe
 */
public class RecursiveLinearSearchMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(recursiveLinearSearch(data, 0, data.length, 5));
    }
}