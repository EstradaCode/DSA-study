package Algorithms;

public class PalindromeNumber {
        public boolean isPalindrome(int x) {
            int original = x, nw=0,digit;
            if(x < 0) return false;
            while(x > 0){
                digit= x % 10;
                nw = nw*10 + digit;
                x/=10;
            }
            return (original==nw);
        }
}
