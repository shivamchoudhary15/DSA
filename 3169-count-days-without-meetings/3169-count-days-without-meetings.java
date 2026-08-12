class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int ans=0;
        int s=meetings[0][0];
        int e=meetings[0][1];
        for (int i = 1; i<meetings.length; i++){
            if (meetings[i][0] <= e+ 1) {
                e = Math.max(e, meetings[i][1]);
            } 
            else {
                ans += e-s+1;
                s=meetings[i][0];
                e=meetings[i][1];
            }
        }
        ans += e-s+1;

        return days - ans;
    }
}