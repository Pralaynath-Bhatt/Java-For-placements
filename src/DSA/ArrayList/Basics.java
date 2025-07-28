package DSA.ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(10);
        arr.add(1,20);
        arr.add(30);
        arr.add(3,40);
        arr.add(50);
        arr.add(5,60);
        //if first time adding the value use add

        //on the first time initialization of value set will throw error
        //set will work fine if its use after the value of that index has been added once
        arr.set(1,200);//set is used to modify the value


        //old way of printing
        for(int i =0;i<6;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //fast way
        System.out.println(arr);
        System.out.println("Size of the array is: "+arr.size());
        arr.add(70);
        System.out.println(arr);
        System.out.println("Size of the array is: "+arr.size());
    }
}
