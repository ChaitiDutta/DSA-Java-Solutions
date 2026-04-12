// 8. Set Matrix Zeroes
// Given an m x n matrix, if an element is 0, set its entire row and column to 0.
// Example:                            
// Input:                           
// [
// [1,1,1],
// [1,0,1],
// [1,1,1]
// ]

    // Output:
// [
// [1,0,1],
// [0,0,0],
// [1,0,1]
// ]


public class set_matrix_zero {
    // public static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> A) {

    // }
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,1,1},
                        {1,0,1},
                        {1,1,1}
                        };
        // Print the original 2D array.
        System.out.println("old matrix : ");
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        //  int[][] result = setZero(matrix);
        // for (int[][] t : result) {
        //     System.out.println(t);
        // }
        Boolean firstRowZero = false;
        Boolean firstColZero = false;

         for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
            }
         }
         for(int j = 0; j<matrix.length; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
            }
         }
         for(int i = 1; i< matrix.length; i++){
            for(int j = 1; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
         }
         for(int i = 1; i< matrix.length; i++){
            for(int j = 1; j< matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
         }
         if(firstRowZero){
            for(int j = 0; j<matrix.length; j++){
                matrix[0][j] = 0;
            }
         }
         if(firstColZero){
            for(int i = 0; i<matrix[0].length; i++){
                matrix[i][0] = 0;
            }
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
