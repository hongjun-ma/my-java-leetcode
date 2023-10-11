//优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            lists.length, (p1, p2) -> (p1.val - p2.val));
