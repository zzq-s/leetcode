import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//https://leetcode.com/problems/valid-parentheses/

class Solution{
    public boolean isValid(String s){
        int n = s.length();
        if(n % 2 == 1){
            return false;
        }

        Map<Character, Character> hashtable = new HashMap<Character, Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};

        Deque<Character> stack = new LinkedList<Character>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(hashtable.containsKey(ch)){
                if(stack.isEmpty() || stack.peek() != hashtable.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}