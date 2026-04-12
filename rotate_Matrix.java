// Rotate Matrix
// You are given an n x n 2D matrix. Rotate the image by 90 degrees clockwise.
// Example:
// Input:
// [
// [1,2,3],
// [4,5,6],
// [7,8,9]
// ]

// Output:
// [
// [7,4,1],
// [8,5,2],
// [9,6,3]
// ]
public class rotate_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
        // Print the original 2D array.
        System.out.println("old matrix : ");
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j = i; j< matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i< matrix.length; i++){
            // for(int j = i; j< matrix[i].length; j++){
                int left =  0; int right = matrix.length -1;
                while(left<right){
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            // }
        }
         System.out.println("new matrix : ");
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
