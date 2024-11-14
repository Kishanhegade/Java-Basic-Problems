package assignment6;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        char[] temp=new char[ch.length];
        int n=0;
        String rs = "";
        char[] emp = new char[ch.length];
        for(int i =0;i<s.length();i++)
        {
            int j=0;

            while(j<n){
                if (ch[i]==temp[j] ){
                    break;
                }
                j++;
            }
            if(j==n) {
                temp[n++] = ch[i];

            }
            else {
                if(rs.length()<n) {
                    rs="";
                    for (int k = 0; k < n; k++) {
                        rs = rs + temp[k];
                    }
                }
                temp=emp;
                i=i-1;
                n=0;
            }

        }

        return rs.length();
    }

    public static void main(String[] args) {
       int len = lengthOfLongestSubstring("pwwkew");
        System.out.println(len);

    }

}
