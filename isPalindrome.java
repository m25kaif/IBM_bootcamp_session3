//WAP to check whether the string is palindrome or not in JAVA

public class Main
{   
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        String revS="";
		for (int i=s.length()-1; i>=0;i--){
		    revS=revS+s.charAt(i);
		}
		return (s.equals(revS));
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("Malayalam"));
	}
}
