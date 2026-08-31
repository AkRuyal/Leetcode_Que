class Solution {
    public boolean isPalindrome(String s) {
        boolean x = true;

        int left = 0;
        int right = s.length()-1;
        String ns = s.toLowerCase();

        while(left<right){
            // asked google for this function Character.isLetterOrDigit(...)
            if(!Character.isLetterOrDigit(ns.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(ns.charAt(right)))
            {
                right--;
            }
            else{
                if(ns.charAt(left) == ns.charAt(right)){
                    x = true;
                    left++;
                    right--;
                }
                else{
                    x = false;
                    break;
                }
            }
        }
        return x;
    }
}