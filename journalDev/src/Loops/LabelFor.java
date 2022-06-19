package Loops;

import java.util.Arrays;

public class LabelFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

int[][] intArr = { { 1, -2, 3,4 }, { 0, 3 }, { 1, 2, 5 }, { 9, 2, 5 } };

process: for (int i = 0; i < intArr.length; i++) {
	boolean allPositive = true;
	for (int j = 0; j < intArr[i].length; j++) {
		System.out.println(intArr[i][j]);
		if (intArr[i][j] < 0) {
			allPositive = false;
			continue process;
		}
	}
	if (allPositive) {
		// process the arrayif 1 elemenet is less than 0 then not processinmg that array
		System.out.println("Processing " + Arrays.toString(intArr[i]));
	}
//	allPositive = true;
}


	}

}
