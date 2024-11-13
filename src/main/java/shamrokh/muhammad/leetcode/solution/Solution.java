package shamrokh.muhammad.leetcode.solution;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> locationsSet = new HashSet<>();
        int currentX = 0;
        int currentY = 0;

        //adding current location "(0,0)" to set
        locationsSet.add(String.format("%d,%d", currentX, currentY));

        // iterating over directions in path
        for(int d=0;d<path.length();d++){
            //calculating new location
            switch (path.charAt(d)) {
                case 'N' -> currentY += 1;
                case 'S' -> currentY -= 1;
                case 'W' -> currentX -= 1;
                case 'E' -> currentX += 1;
            }

            String currentLocation = String.format("%d,%d", currentX, currentY);

            // Checking if we were at current location before
            if(locationsSet.contains(currentLocation))
                return true;

            // Set doesnt include current location
            locationsSet.add(currentLocation);
        }

        // we have not been in the same location twice
        return false;
    }
}