//
//	Name:	 	Chen, Harrison
//	Homework:	5
//	Due:		Friday April 26, 2019
//	Course:		cs-1400-03-sp19
//
//	Description:
//			A class that can be used to manipulate an nxn 2-dimensional array (matrix) of int.
//
public class SquareMatrix
{
	private int[][] matrix;

	public SquareMatrix(int n){
		matrix = new int[n][n];
	}

	public void set(int row, int col, int value){
		matrix[row][col] = value;
	}

	public int get(int row, int col){
		return matrix[row][col];
	}

	public void setIdentity(){
		int size = matrix.length;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				matrix[i][j] = i == j ? 1 : 0;
			}
		}
	}

	public SquareMatrix multiply(SquareMatrix rhs){
		if(matrix.length != rhs.matrix.length){
			return null;
		}else{
			int size = matrix.length;
			SquareMatrix product = new SquareMatrix(size);
			for(int row = 0; row < size; row++){
				for(int col = 0; col < size; col++){
					int value = 0;
					for(int i = 0; i < size; i++){
						value += this.get(row, i) * rhs.get(i, col); 
					}
					product.set(row, col, value);
				}
			}
			return product;
		}
	}

	public void print(){
		int size = matrix.length;
		for(int row = 0; row < size; row++){
			for(int col = 0; col < size; col++){
				System.out.printf("%d\t", matrix[row][col]);
			}
			System.out.print("\n");
		}
	}

	public boolean equals(SquareMatrix rhs){
		boolean equal = true;
		int size = matrix.length;
		for(int row = 0; row < size; row++){
                        for(int col = 0; col < size; col++){
                                if(this.get(row, col) != rhs.get(row, col)){
					equal = false;
				}
                        }
                }
		return equal;
	}

	@Override
	public String toString(){
		int size = matrix.length;
		String line = "{ ";
		for(int row = 0; row < size; row++){
			line += "{ ";
			for(int col = 0; col < size; col++){
				line += this.get(row,col);
				if(col != size - 1){
					line += ", ";
				}
			}
			line += " }";
			if(row != size - 1){
				line += ", ";
			}
		}
		line += " }";
		return line;
	}

	public int[] toArray(){
		int size = matrix.length;
		int[] array = new int[size * size];
		int arrayIndex = 0;
		for(int row = 0; row < size; row++){
			for(int col = 0; col < size; col++){
				array[arrayIndex] = this.get(row,col);
				arrayIndex++;
			}
		}
		return array;
	}
}

