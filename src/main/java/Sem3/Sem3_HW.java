package main.java.Sem3;

import java.util.ArrayList;
import java.util.Random;

public class Sem3_HW {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        fillArray(myList, 10);
        System.out.println(myList);
        ArrayList<Integer> newList = removeEvenValues(myList);
        System.out.println(newList);
        int mini = mini(myList);
        System.out.println(mini);
        int maxi = maxi(myList);
        System.out.println(maxi);
        System.out.println(aver(myList));

    }
    public static void fillArray(ArrayList<Integer> myList, int length) {
        for (int i = 0; i < length; i++) {
            myList.add(new Random().nextInt(15));
        }
    }

    public static ArrayList<Integer> removeEvenValues(ArrayList<Integer> myList){
        ArrayList<Integer> newList = new ArrayList<>(myList.size());
        for (int i: myList) {
            if (i % 2 != 0){
                newList.add(i);
            }
        }
        return newList;
    }

    public static int mini(ArrayList<Integer> myList){
        int mini = Integer.MAX_VALUE;
        for (int i: myList) {
            if (i < mini){
                mini = i;
            }
        }
        return mini;
    }

    public static int maxi(ArrayList<Integer> myList){
        int maxi = 0;
        for (int i: myList) {
            if (i > maxi){
                maxi = i;
            }
        }
        return maxi;
    }

    public static float aver(ArrayList<Integer> myList){
        int summa = 0;
        int count = 0;
        float aver;
        for (int i: myList) {
            summa += i;
            count += 1;
        }
        aver = (float) summa /count;
        return aver;
    }
}
