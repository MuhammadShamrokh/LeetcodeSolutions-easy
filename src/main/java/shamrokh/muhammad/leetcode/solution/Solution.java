package shamrokh.muhammad.leetcode.solution;


import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> sStack = new ArrayDeque<>();
        Deque<Character> tStack = new ArrayDeque<>();

        handleStackContent(sStack,s);
        handleStackContent(tStack,t);

        return areStacksEquals(sStack,tStack);
    }

    private void handleStackContent(Deque<Character> stack, String string){
        for(int i=0;i<string.length();i++){
            // a backspace character, we delete last written character
            if(string.charAt(i) == '#') {
                if (!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(string.charAt(i));
        }
    }

    private boolean areStacksEquals(Deque<Character> s1, Deque<Character> s2){
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop() != s2.pop())
                return false;
        }

        return s1.isEmpty() && s2.isEmpty();
    }
}