import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<Character> st=new Stack<>();
	    String s="silent";
	    int n=s.length();
	    for (int i=0;i<n;i++){
	        char ch =s.charAt(i);
	        st.push(ch);
	    }
	    for (int i=0;i<n;i++){
	        char del=st.pop();
	        System.out.print(del+ " ");
	    }
	        
	}
}
