package comparator_comparable.comparator;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        try{
            Comparator<Integer> comparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer val1, Integer val2) {
                    if(val1 % 10 >= val2 % 10){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            };

            List<Integer> list = new ArrayList<>();
            list.add(90);
            list.add(91);
            list.add(89);
            list.add(29);
            list.add(18);
            // Expected result : [90, 91, 19, 89, 29]
            list.sort(comparator);
            System.out.println(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
