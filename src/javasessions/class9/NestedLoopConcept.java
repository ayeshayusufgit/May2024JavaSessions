package javasessions.class9;

public class NestedLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for--outer loop
		// for--inner loop

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55

		// i->0 to 5
		// j->0 to 5
		//6*6->m*n
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
				break;

			}
			System.out.println();
			break;
		}

		//Usage of nested loops:
		//reading data from the excel sheet can be done using 2-d array
		
		
		// 000 001 002 003 004 005
		// 010 011 012 013 014 015
		// 020 021 022 023 024 025
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55

		for (

				int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				for (int k = 0; k <= 5; k++) {
					System.out.print(i + "" + j + k + " ");
				}
				System.out.println();
			}
			
		}

	}

}
