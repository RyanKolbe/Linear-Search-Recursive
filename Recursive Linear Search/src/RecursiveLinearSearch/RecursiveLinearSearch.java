/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursiveLinearSearch;

/**
 *
 * @author Ryan Kolbe
 */
public class RecursiveLinearSearch {

    public static int recursiveLinearSearch(int[] data, int left, int right, int target) {
        if (left < right) {
            if (data[left] == target) {
                return left;
            } else {
                return recursiveLinearSearch(data, left + 1, right, target);
            }
        } else if (left == right) {
            if (data[left] == target) {
                return left;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
