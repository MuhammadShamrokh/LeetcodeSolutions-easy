package shamrokh.muhammad.leetcode.solution;

class Solution{
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // if the start and end points are equal, then the total distance is 0;
        if(start == destination){
            return 0;
        }

        int startToEndLength = 0;
        int endToStartLength = 0;
        int distanceArrayLength = distance.length;
        int scanner = start;

        // calculating the distance clockwise
        while(scanner != destination){
            startToEndLength += distance[scanner];
            scanner = (scanner+1)%distanceArrayLength;
        }

        // calculating the distance counterclockwise
        while(scanner != start){
            endToStartLength += distance[scanner];
            scanner = (scanner+1)%distanceArrayLength;
        }

        // returning the min length
        return Math.min(startToEndLength, endToStartLength);
    }
}