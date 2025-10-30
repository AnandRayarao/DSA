import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static  void  main(String[] args){

        int target = 9;
        int []  source = {33,7,8,2};
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<source.length;i++){
            int complement = target- source[i];
            if(hm.containsKey(complement)){
              System.out.println( hm.get(complement)+ " " + i);
            }
         hm.put(source[i],i);
        }

    }
}
