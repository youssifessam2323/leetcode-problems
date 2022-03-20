package EasyProblems.day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidSudoku {
    /**
     *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
     *  STATUS: Not Accepted
     *  HELP ? YES
     *  NUM OF SUBMISSIONS ? 2
     *
     */

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> values = new HashSet<>();

        for(int i = 0; i< 9; i++){
            for(int j = 0; j < 9; j++){

                char current = board[i][j];
                if(current != '.'){
                    if(!values.add(current + " found in row " + i) ||
                            ! values.add(current + " found in col " + j) ||
                            ! values.add(current + " found in sub " + i/3+ "-" + j/3))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] arr = { {'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(arr));
    }
}
