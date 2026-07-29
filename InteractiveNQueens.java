import java.util.*;

public class InteractiveNQueens {

    static int n;
    static int[] queens; // queens[row] = column (1..n), 0 = empty. Index 1..n used.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the board (n): ");
        n = sc.nextInt();

        queens = new int[n + 1]; // rows 1..n

        int currentRow = 1;

        while (currentRow <= n) {
            List<Integer> safeCols = getSafeColumns(currentRow);

            System.out.println("\n--- Row " + currentRow + " ---");
            printBoard();

            if (safeCols.isEmpty()) {
                System.out.println("No safe position available in row " + currentRow + ". You must backtrack.");
                currentRow = askBacktrack(sc, currentRow);
                continue;
            }

            System.out.println("Safe column(s) for row " + currentRow + ": " + safeCols);
            System.out.println("Enter a column number to place the queen, or type 'b' to backtrack voluntarily.");
            System.out.print("Your choice: ");

            String input = sc.next();

            if (input.equalsIgnoreCase("b")) {
                currentRow = askBacktrack(sc, currentRow);
                continue;
            }

            int col;
            try {
                col = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            if (col < 1 || col > n || !safeCols.contains(col)) {
                System.out.println("That column is not a valid safe position. Try again.");
                continue;
            }

            queens[currentRow] = col;
            currentRow++;
        }

        System.out.println("\nAll " + n + " queens placed successfully!");
        printBoard();
    }

    // Returns list of safe columns (1..n) for the given row, based on rows above it.
    static List<Integer> getSafeColumns(int row) {
        List<Integer> safe = new ArrayList<>();
        for (int col = 1; col <= n; col++) {
            if (isSafe(row, col)) {
                safe.add(col);
            }
        }
        return safe;
    }

    static boolean isSafe(int row, int col) {
        for (int r = 1; r < row; r++) {
            int c = queens[r];
            if (c == 0) continue;
            if (c == col) return false;                     // same column
            if (Math.abs(c - col) == Math.abs(r - row)) return false; // same diagonal
        }
        return true;
    }

    // Asks the user which row to backtrack to, clears queens from that row onward, returns new current row.
    static int askBacktrack(Scanner sc, int stuckRow) {
        int maxBacktrackRow = stuckRow - 1;
        if (maxBacktrackRow < 1) {
            System.out.println("Cannot backtrack further. No solution possible from row 1. Exiting.");
            System.exit(0);
        }

        int target;
        while (true) {
            System.out.print("Backtrack to which row? (1 to " + maxBacktrackRow + "): ");
            target = sc.nextInt();
            if (target >= 1 && target <= maxBacktrackRow) break;
            System.out.println("Invalid row. Pick between 1 and " + maxBacktrackRow + ".");
        }

        // Clear queens from target row up to current stuck row.
        for (int r = target; r <= stuckRow; r++) {
            queens[r] = 0;
        }

        System.out.println("Backtracked to row " + target + ". Its previous queen has been removed; place a new one.");
        return target;
    }

    static void printBoard() {
        for (int r = 1; r <= n; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 1; c <= n; c++) {
                sb.append(queens[r] == c ? " Q " : " . ");
            }
            System.out.println(sb);
        }
    }
}