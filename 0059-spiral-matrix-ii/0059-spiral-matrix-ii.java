class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr= new int [n][n];

        int minRow=0;
        int maxRow =n-1;
        int minCol =0;
        int maxCol= n-1;
        int count =1;

        while(count <=n*n){
            //minRow fixed
            for(int c=minCol; c<=maxCol; c++){
                arr[minRow][c] = count;
                count++;
            }
            //maxCol fixed
            for(int r=minRow+1; r<=maxRow; r++ ){
                arr[r][maxCol]= count;
                count++;
            }
            //maxRow fixed
            for(int c=maxCol-1; c>=minCol ;c--){
                arr[maxRow][c]= count;
                count++;
            }

            //minCol fixed 
            for(int r=maxRow-1; r>=minRow+1; r--){
                arr[r][minCol]=count;
                count++;
            }
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }

        return arr;
    }
}