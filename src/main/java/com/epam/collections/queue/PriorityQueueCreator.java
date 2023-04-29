package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new MyComparator());
        if (!firstList.isEmpty()) {
            priorityQueue.addAll(firstList);
        }
        if (!secondList.isEmpty()) {
            priorityQueue.addAll(secondList);
        }
        return priorityQueue;

    }

    class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int value = o1.compareTo(o2);
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            }
            return 0;
        }
    }
}
