public class Palindrome {
    public static void main(String[] args){
        String pal = "abcdecba";
        int i = 0 , j = pal.length() - 1;
        while(i<j){
            if(pal.charAt(i) != pal.charAt(j)){
                System.out.println("The string is not a palindrome");
                break;
            }
            i++;
            j--;
        }
        System.out.println("This string is a palindrome");
    }
}