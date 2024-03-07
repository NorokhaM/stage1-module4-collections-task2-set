package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>(sourceList);
        for (Integer integer : sourceList) {
            if (integer%2==0){
                while(integer%2==0) {
                    hashSet.add(integer);
                    integer /= 2;
                    hashSet.add(integer);
                }
            }
            else {
                hashSet.add(integer);
                integer *= 2;
                hashSet.add(integer);
            }
        }
        return hashSet;
    }
}
