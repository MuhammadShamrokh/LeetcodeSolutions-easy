package shamrokh.muhammad.leetcode.utility_objects;

import java.util.Comparator;

public class Cell implements Comparable<Cell> {
    int row;
    int col;
    int dist;

    public Cell(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    @Override
    public int compareTo(Cell o) {
        return Integer.compare(this.dist, o.dist);
    }
}
