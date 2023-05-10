public class PatikaProje {

	public static void main(String[] args) {
		int[][] matrix = {
				{2, 3, 4},
				{5, 6, 4}
		};
		int[][] transpozeMatrix = new int[matrix[0].length][matrix.length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				transpozeMatrix[j][i] = matrix[i][j]; 
			}
		}
		
		System.out.println("Matris : ");
		for (int[] x : matrix) {
			for (int y : x) {
				System.out.print(y + "    ");
			}
			System.out.println();
		}
		
		System.out.println("Transpoze : ");
		for (int[] x : transpozeMatrix) {
			for (int y : x) {
				System.out.print(y + "    ");
			}
			System.out.println();
		}
	}

}
