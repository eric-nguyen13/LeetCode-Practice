class Solution {
    public boolean isPalindrome(String s) {
        // Initialize Variables
        int startPointer = 0;
        int middleBound;
        int endPointer;
        
        // Remove non-alphanumeric characters
        String formattedString = "";
        String lowerCaseString = s.toLowerCase();
        for(int i = 0; i < lowerCaseString.length(); i++){
            if(Character.isDigit(lowerCaseString.charAt(i)) || 
               Character.isLetter(lowerCaseString.charAt(i))){
                formattedString += lowerCaseString.charAt(i);
            }
        }
        middleBound = formattedString.length() / 2;
        endPointer = formattedString.length() - 1;
        
        if(formattedString.equals("")) return true;
        
        
        // Traverse string
        for(int i = 0; i <= middleBound; i++){
            if(formattedString.charAt(startPointer) != formattedString.charAt(endPointer)){
                return false;
            }
            startPointer++;
            endPointer--;
        }
        
        // Return true if everything matches - is a palindrome
        return true;
        
    }
}