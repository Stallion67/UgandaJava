//CSC 1214 OBJECT-ORIENTED PROGRAMMING
//TAKE-HOME TEST 2019/20
//Student No.1900717762
//Reg No. 19/U/17762/EVE
//Name	Ben OKELLO MWAKA

import java.util.ArrayList;
public class iteration {

    public static void main(String args[]) {
        int i, j=0, k=0 ;
        ArrayList<Integer> MyList =new  ArrayList<Integer>();
        for (i=0;i<4; i++) {
            do {
                for (i=0;i<4; i++) {
                    MyList.add(k);
                    System.out.println(k+ " ");
                    k++;
                }
                j++;
            } while (j<5);

        }
    }

}
