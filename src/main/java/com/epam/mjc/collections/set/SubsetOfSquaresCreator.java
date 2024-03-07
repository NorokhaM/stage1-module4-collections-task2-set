package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer integer : sourceList) {
                treeSet.add(integer * integer);
        }
        return treeSet.subSet(lowerBound, upperBound+1);
    }
}
