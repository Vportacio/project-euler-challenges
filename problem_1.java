import java.util.ArrayList;

/** 
 * 
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 ***/

 // Solution -> % Operator


class problem_1 {
    public static void main(String[] args){
        Integer i = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(i = 0; i<=1000; i++){ if(i % 3 == 0 || i % 5 == 0 ){ arr.add(i); } }        

        System.out.println(arr);
    }

}