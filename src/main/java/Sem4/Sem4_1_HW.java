package Sem4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sem4_1_HW {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> mainList = new ArrayList<>();
        while(true){
            ArrayList<String> myList = enterData();
            if(myList == null){
                break;
            }else{
                mainList.add(myList);
            }
        }
        printList(mainList);
        sortList(mainList);
        printList(mainList);
    }
    public static ArrayList<String> enterData(){
        ArrayList<String> data = new ArrayList<>();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if(name.equals("q")){
            return null;
        }else {
            data.add(name);
        }
        System.out.println("Enter your age: ");
        String age = scanner.nextLine();
        if(age.equals("q")){
            return null;
        }else {
            data.add(age);
        }
        System.out.println("Enter your sex: ");
        String sex = scanner.nextLine();
        if(sex.equals("q")){
            return null;
        }else {
            data.add(sex);
        }
        return data;
    }
    public static void printList(ArrayList<ArrayList<String>> lst){
        for (ArrayList<String> i: lst) {
            System.out.println(i.get(0) + " " + i.get(1) + " " + i.get(2));
        }
    }
    public static void sortList(ArrayList<ArrayList<String>> lst) {
        System.out.println("Wanna sort? If Yes, press 'S'");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equalsIgnoreCase("S")) {
            lst.sort(new Comparator<>() {
                @Override
                public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                    return Integer.parseInt(o1.get(1)) - Integer.parseInt(o2.get(1));
                }
            });
        }
    }
}