package shamrokh.muhammad.leetcode.solution;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Solution {
    private final int AXIS_X = 0;
    private final int AXIS_Y = 1;

    class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public boolean isBoomerang(int[][] points) {
        double gradiant = 0;
        Set<Point> pointsSet = new HashSet<>();
        Point firstPoint = new Point(points[0][AXIS_X],points[0][AXIS_Y]);
        boolean differentGradiantPoint = false;

        // calculating gradiant of first 2 points
        if(points[0][AXIS_X] != points[1][AXIS_X]){
            gradiant = (double)(points[1][AXIS_Y] - firstPoint.y) / (points[1][AXIS_X] - firstPoint.x);
        } else{
            gradiant = Integer.MAX_VALUE;
        }

        //inserting first point to set
        pointsSet.add(firstPoint);

        for(int p=1;p<points.length;p++){
            Point currentPoint = new Point(points[p][AXIS_X], points[p][AXIS_Y]);
            // checking if we met this point before
            if(pointsSet.contains(currentPoint))
                return false;
            else
                pointsSet.add(currentPoint);

            if(currentPoint.x != firstPoint.x){
                if((double)(currentPoint.y - firstPoint.y) / (currentPoint.x - firstPoint.x) != gradiant)
                    differentGradiantPoint = true;
            } else{
                if(gradiant != Integer.MAX_VALUE)
                    differentGradiantPoint = true;
            }
        }

        return differentGradiantPoint;
    }
}