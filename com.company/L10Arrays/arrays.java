import java.util.*;

public class arrays{
    public static void main(String[] args){
// Creating an Array (method 1) - with new keyword
        // int[] marks = new int[3];
        int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);

        System.out.println(marks[2]);



        // Another method of same questions
        for(int i =0; i<3; i++){
            System.out.println(marks[i]);
        }


        // marks[3] = 99;

        // int[] totalMarks = marks[0] + marks[1] + marks[2] + marks[3];
        // System.out.println(totalMarks);

// Creating an Array (method 2)
    int[] marks = {98, 97, 95};
    for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }

    }
}
