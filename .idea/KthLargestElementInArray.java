class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums)
        {
            pq.add(num);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

//Time complexity is O(nlogn)
//Space complexity is O(n)


//Max heap:
/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int result = Integer.MAX_VALUE;
        for(int num: nums)
        {
            pq.add(num);
            if(pq.size() > nums.length - k)
            {
              result = Math.min(result, pq.poll());
            }
        }
        return result;
    }
}
 */


//Time complexity is O(nlog(n-k))
//Space complexity is O(n)
