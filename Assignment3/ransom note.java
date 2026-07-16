class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1=magazine.length();
        int n2=ransomNote.length();
        int[] freq=new int[26];
        
        for (int i =0;i<n1;i++){
            char ch1=magazine.charAt(i);
            freq[ch1-'a']++;

        }
        for(int j=0;j<n2;j++){
            char ch2=ransomNote.charAt(j);
            freq[ch2-'a']--;

        }
        for (int i=0;i<freq.length;i++){
            if (freq[i]<=-1){
                return false;
            }
        }
        return true;
        
    }
}
