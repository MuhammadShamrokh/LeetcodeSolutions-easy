package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> differentDomain = new HashSet<>();

        for(String email : emails){
            differentDomain.add(getBaseEmailAddress(email));
        }

        return differentDomain.size();
    }

    private String getBaseEmailAddress(String email) {
        StringBuilder sb = new StringBuilder();
        int scanner = 0;

        while(scanner < email.length()){
            char c = email.charAt(scanner);
            switch(c){
                case '.': // we just ignore the points
                    scanner++;
                    break;
                case '@': // reached the domain, we append it to sb
                    sb.append(email.substring(scanner));
                    scanner = email.length();
                    break;

                case '+': // we ignore all the chars till the @domain
                    while(email.charAt(scanner) != '@')
                        scanner++;
                    break;
                default:
                    sb.append(c);
                    scanner++;

            }
        }

        return sb.toString();
    }
}