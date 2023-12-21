import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {

        /*


A Very Big Sum
In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in
mind that some of those integers may be quite large.
Function Description
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
aVeryBigSum has the following parameter(s):
int ar[n]: an array of integers .
Return
long: the sum of all array elements
Input Format
The first line of the input consists of an integer .
The next line contains space-separated integers contained in the array.
Output Format
Return the integer sum of the elements in the array.
Constraints
Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005
Output
5000000015
Note:
The range of the 32-bit integer is .
When we add several integer values, the resulting sum might exceed the above range. You might need to
use long int C/C++/Java to store such sums.

         */



        //Test

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(1);


        List<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(5);
        b.add(5);

        List<Integer>result=compareTriplets(a,b);
        System.out.println(result);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int aliceScore=0;
        int bobScore=0;

        List<Integer> score=new ArrayList<>();
        for (int i=0; i<a.size(); i++ ) {



            if(a.get(i)>b.get(i)){
            aliceScore++;

            } else if (b.get(i)>a.get(i)) {
                bobScore++;
            }else {
                 continue;
            }



        }
        score.add(aliceScore);
        score.add(bobScore);
        return score;

    }

}
