package _1offer2.$52_字符流中第一个不重复的字符;

public class Solution {
    StringBuilder sb = new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int len = sb.length();
        boolean[] flag = new boolean[len];
        for (int i=0;i<len;i++){
            if(!flag[i]){
                char c = sb.charAt(i);
                int index = sb.lastIndexOf(c+"");
                if(index==i) return c;
                else {
                    flag[i] = true;
                    flag[index] = true;
                }
            }
        }
        return '#';
    }
}