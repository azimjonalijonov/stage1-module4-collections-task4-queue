package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(firstQueue.poll());
        result.add(firstQueue.poll());
        result.add(secondQueue.poll());
        result.add(secondQueue.poll());
        boolean turn = true;
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            if (turn) {
                firstQueue.offer(result.pollFirst());
                result.offerLast(firstQueue.remove());
                result.offerLast(firstQueue.remove());
                turn = false;
            } else {
                secondQueue.offer(result.pollFirst());
                result.offerLast(secondQueue.poll());
                result.offerLast(secondQueue.poll());
                turn = true;
            }
        }
        return result;
    }
}
