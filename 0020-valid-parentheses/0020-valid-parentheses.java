class Solution {
    public boolean isValid(String s) {
    Stack<Character> left = new Stack<>();
    for(char c: s.toCharArray())
    {
        if(c=='(' || c=='{' || c=='['){
            left.push(c);
        }
        else if(c==')' && !left.isEmpty() && left.peek()=='('){
            left.pop();
           
        }
        else if(c==']' && !left.isEmpty() && left.peek()=='['){
            left.pop();
            
        }
        else if(c=='}' && !left.isEmpty() && left.peek()=='{'){
            left.pop();
           
        }
        else
        {
            return false;
        }
    }
        return left.isEmpty();
    }
}