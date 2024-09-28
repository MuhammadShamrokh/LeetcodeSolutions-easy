package shamrokh.muhammad.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

class Solution{
    private static final Map<String,String> months = new HashMap<>(){{
        put("Jan","01");
        put("Feb","02");
        put("Mar","03");
        put("Apr","04");
        put("May","05");
        put("Jun","06");
        put("Jul","07");
        put("Aug","08");
        put("Sep","09");
        put("Oct","10");
        put("Nov","11");
        put("Dec","12");
    }};


    public String reformatDate(String date) {
        String[] splitDate = date.split(" ");
        String day = convertDayFormat(splitDate[0]);
        String month = months.get(splitDate[1]);
        String year = splitDate[2];

        return String.format("%s-%s-%s", year, month, day);

    }

    private String convertDayFormat(String day){
        if(Character.isAlphabetic(day.charAt(1))){
            return "0"+day.charAt(0);
        }
        else{
            return day.substring(0, 2);
        }
    }
}