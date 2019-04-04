/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		//testPositive();
		//testNegative();
		testMixed();
		//testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
    }

    public void testNegative(){

        /** Test data contains negative values only **/
    }

    public void testMixed(){
			int[] arr = new int[5];
      arr[0] = -8;
      arr[1] = 9;
      arr[2] = 0;
      arr[3] = -10;
      arr[4] = 2;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -10;
      Sortedarr[1] = -8;
      Sortedarr[2] = 0;
      Sortedarr[3] = 2;
      Sortedarr[4] = 9;

			SelectionSort sortObj = new SelectionSort();

			arr = sortObj.basicSelectionSort(arr);

			// Want to know where it failed
			for (int index = 0; index < 5; index++)
			{
				assertEquals("Array failed at index " + Integer.toString(index), Sortedarr[index], arr[index]);
			}
    }

    public void testDuplicates(){
			int[] arr = new int[6];
			arr[0] = -8;
			arr[1] = 9;
			arr[2] = 0;
			arr[3] = -8;
			arr[4] = 9;
			arr[5] = 0;

			int[] Sortedarr = new int[6];
			Sortedarr[0] = -8;
			Sortedarr[1] = -8;
			Sortedarr[2] = 0;
			Sortedarr[3] = 0;
			Sortedarr[4] = 9;
			Sortedarr[5] = 9;

			SelectionSort sortObj = new SelectionSort();

			arr = sortObj.basicSelectionSort(arr);

			// Want to know where it failed
			for (int index = 0; index < 6; index++)
			{
				assertEquals("Array failed at index " + Integer.toString(index), Sortedarr[index], arr[index]);
			}
    }


}
