
public class Main
{
	public static void main(String[] args) {
	    String s="leetcode";
	    int[] freq=new int[26];
	    int n=s.length();
	    int max=freq[0];
	    int n1=0;
	    
	    
	    for (int i=0;i<n;i++){
	        char ch =s.charAt(i);
	        freq[ch-'a']++;
	    }
	    for(int i=0;i<freq.length;i++){
	        
	        if (freq[i]>max){
	            max=freq[i];
	            n1=i;
	        }
	    }
	    System.out.println((char)('a'+n1));
	    
	}
}
