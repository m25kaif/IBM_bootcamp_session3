//WAP to remove a character from the string


public class Main
{   
    public static String removeChar(String S, char c){
		String newS="";
		for (int i=0;i<S.length();i++){
		    if (S.charAt(i)==c){
		        continue;
		    }
		    else{
		        newS+=S.charAt(i);
		    }
		}
		return (newS);
    }
	public static void main(String[] args) {
		System.out.println(removeChar("Kaif",'f'));
	}
}
