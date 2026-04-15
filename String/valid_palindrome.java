package String;

public class valid_palindrome {
    public static boolean palindrome(String s){
        // OPTIMAL SOLUTION
        int left = 0;int right = s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left)) ){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(left)) !=(Character.toUpperCase(s.charAt(right)))){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
        // PROCESS 1 tAKES TIME COMPLEXITY O(N)//
        // StringBuilder str = new StringBuilder();
        // for(int i = 0; i< s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(Character.isLetterOrDigit(ch)){
        //         str.append(Character.toLowerCase(ch));
        //     }
        // }
        // StringBuilder res= new StringBuilder(str);
        // if(res.reverse().toString().equals(str.toString())){
        //     return true;
        // }
        // return false;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }
}
