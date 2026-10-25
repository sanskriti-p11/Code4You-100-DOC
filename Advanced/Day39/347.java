class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Add unique numbers to the heap
        for (int num : map.keySet()) {
            maxHeap.offer(num);
        }

        // Extract the k most frequent elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
        
    }
}