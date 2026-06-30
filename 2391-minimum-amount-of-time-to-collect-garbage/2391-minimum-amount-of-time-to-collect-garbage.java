class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {

        int gans = 0;
        int pans = 0;
        int mans = 0;

        boolean gya = false;
        boolean pya = false;
        boolean mya = false;

        int lastG = -1;
        int lastP = -1;
        int lastM = -1;

        for (int i = 0; i < garbage.length; i++) {
            if (garbage[i].contains("G")) lastG = i;
            if (garbage[i].contains("P")) lastP = i;
            if (garbage[i].contains("M")) lastM = i;
        }
        
        for(int i = 0; i < garbage.length; i++) {

            String s = garbage[i];

            int g = 0;
            int p = 0;
            int m = 0;

            for(int i1 = 0; i1 < s.length(); i1++) {

                if(s.charAt(i1) == 'G') g++;
                else if(s.charAt(i1) == 'P') p++;
                else if(s.charAt(i1) == 'M') m++;

            }

            if(g > 0) gya = true;
            if(p > 0) pya = true;
            if(m > 0) mya = true;

            if (i < lastG) gans += travel[i];
            if (i < lastP) pans += travel[i];
            if (i < lastM) mans += travel[i];
           
            gans += g;
            pans += p;
            mans += m;

        }

        int ans = 0;

        if(gya) ans += gans;
        if(pya) ans += pans;
        if(mya) ans += mans;

        return ans;
    }
}