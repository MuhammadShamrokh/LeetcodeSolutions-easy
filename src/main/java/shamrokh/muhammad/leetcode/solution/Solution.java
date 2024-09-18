package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.*;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = -1, rookCol = -1;

        // Step 1: Find the position of the rook
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
            if (rookRow != -1) break; // We found the rook, no need to continue
        }

        // Step 2: Count pawns attacked by rook
        int pawnCount = 0;

        // Check upwards
        for (int i = rookRow - 1; i >= 0; i--) {
            if (board[i][rookCol] == 'B') break; // Blocked by a bishop
            if (board[i][rookCol] == 'p') {
                pawnCount++;
                break; // Stop after capturing a pawn
            }
        }

        // Check downwards
        for (int i = rookRow + 1; i < 8; i++) {
            if (board[i][rookCol] == 'B') break; // Blocked by a bishop
            if (board[i][rookCol] == 'p') {
                pawnCount++;
                break; // Stop after capturing a pawn
            }
        }

        // Check leftwards
        for (int j = rookCol - 1; j >= 0; j--) {
            if (board[rookRow][j] == 'B') break; // Blocked by a bishop
            if (board[rookRow][j] == 'p') {
                pawnCount++;
                break; // Stop after capturing a pawn
            }
        }

        // Check rightwards
        for (int j = rookCol + 1; j < 8; j++) {
            if (board[rookRow][j] == 'B') break; // Blocked by a bishop
            if (board[rookRow][j] == 'p') {
                pawnCount++;
                break; // Stop after capturing a pawn
            }
        }

        return pawnCount; // Return total number of pawns that can be captured
    }
}