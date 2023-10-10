class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(String token : tokens){
            try{ // Push numbers onto the stack
                stack.push(Integer.parseInt(token));
            }
            catch(Exception e){ // Catch operators and do math
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                int result;
                if(token.equals("+")){
                    result = firstNum + secondNum;
                }
                else if(token.equals("-")){
                    result = firstNum - secondNum;
                }
                else if(token.equals("*")){
                    result = firstNum * secondNum;
                }
                else{
                    result = firstNum / secondNum;
                }
                stack.push(result);
            }
        }
        
        return stack.pop();
        
    }
}

// Did by myself