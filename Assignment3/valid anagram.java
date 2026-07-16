class Solution {
    public boolean isAnagram(String s, String t) {

    int n1=s.length();
    int n2=t.length();

    int[] freq=new int[26];
    
    if (n1!=n2){
        return false;
    }


    for (int i=0;i<n1;i++){
        char ch1=s.charAt(i);
        freq[ch1-'a']++;
    }
    for (int j=0;j<n2;j++){
        char ch2=t.charAt(j);
        freq[ch2-'a']--;

    }
    for (int i=0;i<freq.length;i++){
        if (freq[i]!=0){
            return false;
        }
    }
    return true;


    }
}
