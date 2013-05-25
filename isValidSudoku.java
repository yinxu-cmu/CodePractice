public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* 1 check length */
        if( board == null || board[0].length != 9 || board.length != 9){
            return false;
        }
        /* test each row */
        for(int i = 0; i < 9; i++){
            boolean[] row = new boolean[9];
            for(int j = 0; j < 9; j++){
                int tmp = board[i][j];
                if(tmp == 46){
                    continue;
                }
                if( tmp < 49 || tmp > 57){
                    return false;
                }
                
                if( row[tmp - 49] ){
                    return false;
                }else{
                    row[ tmp - 49 ] = true;
                }
            }
        }
        /* test each column */
        for(int m = 0; m < 9 ; m++){
            boolean[] col = new boolean[9];
            for(int n = 0; n < 9; n++){
                int tmp1 = board[n][m];
                if(tmp1 == 46){
                    continue;
                }
                if( tmp1 < 49 || tmp1 > 57){
                    return false;
                }
                
                if( col[tmp1 - 49] ){
                    return false;
                }else{
                    col[ tmp1 - 49 ] = true;
                }
            }
        }
        /* test each 3X3 block */
        for( int z = 0; z < 9; z++){
            boolean[] block = new boolean[9];
            int x = 0;
            if( z < 3){
                x = 0;
            }else if(z < 6){
                x = 3;
            }else{
                x = 6;
            }
            for(int p = 0; p < 3; p++){
                for( int q = 0; q < 3; q++){
                    int tmp3 = board[x+p][(z % 3)*3 + q];
                    if(tmp3 == 46){
                        continue;
                    }
                    if( block[tmp3 - 49] ){
                        return false;
                    }else{
                        block[ tmp3 - 49 ] = true;
                    }
                } 
            } 
        }
        return true;
    }
}
