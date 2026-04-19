package com.sunbeam;
import java.util.PriorityQueue;

class Solution {
    public int Largest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }
}