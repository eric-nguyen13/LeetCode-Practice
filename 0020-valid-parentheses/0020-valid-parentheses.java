class Solution {
    public boolean isValid(String s) {
        // Initialize Variables
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        // Traverse String
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size() > 0 && map.get(stack.peek()) == s.charAt(i) ){
                    Character top = stack.peek();
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        // return
        return stack.size() == 0;
    }
}