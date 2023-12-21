import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {

    public static void main(String[] args) {

        List<Long> ar= new ArrayList<>();
        ar.add(10000000000000001L);
        ar.add(20000000000000004L);
        ar.add(30000000000000003L);

        System.out.println(aVeryBigSum(ar));


    }
    public static long aVeryBigSum(List<Long> ar) {

        Long sum =0L;

    for(Long w : ar){
    sum=w+sum;
    }
    return sum;
    }

}
