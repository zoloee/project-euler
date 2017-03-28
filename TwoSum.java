
import java.util.HashMap;

public class TwoSum {
//    dupla forloop > O(N^2)  -  a hashmappel gyorsabb (O(N))
    public static int[] findTwoSum(int[] list, int sum) {
        int i;
        int pairToFind;
        HashMap<Integer, Integer> map = new HashMap();
        for (i = 0; i < (list.length-1); i++){
            map.put(list[i],i);
        }
        for ( i = 0; i < (list.length-1); i++){
            pairToFind = sum - list[i];
            if (map.get(pairToFind) != null) {
                return new int[]{i, map.get(pairToFind)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}