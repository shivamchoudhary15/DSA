class Solution {
    public int miceAndCheese(int[] r1, int[] r2, int k) {
          int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i <r1.length; i++) {
            sum += r2[i];
            pq.offer(r1[i] - r2[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}