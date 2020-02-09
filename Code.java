static int countingValleys(int n, String s) {
    
        int Down = 0;
        int valleys = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'U'){
                Down -= 1;
                if(Down == 0)
                valleys++;
           }
            else if(s.charAt(i) == 'D')
                Down += 1;
        }

        return valleys;
    }
