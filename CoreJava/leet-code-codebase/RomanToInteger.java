class Solution {
    public int romanToInt(String s) {
          int n=0;
          int i=0;
          while(i<s.length())
          {
            if (s.charAt(i)=='M')
            {
                n=n+1000;
            }
            else if (s.charAt(i)=='D')
            {
                n=n+500;
            }
            else if(s.charAt(i)=='C'&& i+1<s.length()&&s.charAt(i+1)=='D')
            {
                n=n-100;
            }
            else if(s.charAt(i)=='C'&& i+1<s.length()&&s.charAt(i+1)=='M')
            {
                n=n-100;
            }
            else if (s.charAt(i)=='C')
            {
                n=n+100;
            }
            else if (s.charAt(i)=='L')
            {
                n=n+50;
            }
            else if(s.charAt(i)=='X'&& i+1<s.length()&&s.charAt(i+1)=='L')
            {
                n=n-10;
            }
            else if(s.charAt(i)=='X'&& i+1<s.length()&&s.charAt(i+1)=='C')
            {
                n=n-10;
            }
            else if (s.charAt(i)=='X')
            {
                n=n+10;
            }
            else if (s.charAt(i)=='V')
            {
                n=n+5;
            }
            else if(s.charAt(i)=='I'&& i+1<s.length()&&s.charAt(i+1)=='V')
            {
                n=n-1;
            }
            else if(s.charAt(i)=='I'&& i+1<s.length()&&s.charAt(i+1)=='X')
            {
                n=n-1;
            }
            else if (s.charAt(i)=='I')
            {
                n=n+1;
            }
            i++;
          }
          return n;
    }
}