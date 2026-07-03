package LeetCode;
import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String temp = "";
        for (int i=0; i<s.length(); i++){
            if ((Character.isLetter(s.charAt(i))) || Character.isDigit(s.charAt(i))){ 
                temp+= s.charAt(i);
            }
        }
        System.out.println(temp);
        for (int i=0;i<(temp.length()/2);i++){
            if (temp.charAt(i) != temp.charAt(temp.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        String temp = "";
        for (int i=0; i<s.length(); i++){
            if ((Character.isLetter(s.charAt(i))) || Character.isDigit(s.charAt(i))){ 
                temp+= s.charAt(i);
            }
        }
        System.out.println(temp);
        for (int i=0;i<(temp.length()/2);i++){
            if (temp.charAt(i) != temp.charAt(temp.length()-1-i)) {
                System.out.println("Not a palindrome");
            }
        }
    }
        
}