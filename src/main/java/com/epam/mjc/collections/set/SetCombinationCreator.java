package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        for (String first : firstSet) {
            if (secondSet.contains(first) && !thirdSet.contains(first)) {
                resultSet.add(first);
            }
        }
        for (String third: thirdSet) {
            if (!secondSet.contains(third) && !firstSet.contains(third)) {
                resultSet.add(third);
            }
        }
        return resultSet;
    }
}
