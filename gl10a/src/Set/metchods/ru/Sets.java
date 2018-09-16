package Set.metchods.ru;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public Set<Integer> uniunSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<Integer>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public Set<Integer> insertSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<Integer>();
        set1.retainAll(set2);
        unionSet.addAll(set1);
        return unionSet;
    }
}
