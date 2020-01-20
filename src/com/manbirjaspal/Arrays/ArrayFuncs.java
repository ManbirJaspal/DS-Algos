package com.manbirjaspal.Arrays;

public class ArrayFuncs {

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;

        for(int i = 0; i < arr.length - 1; i++){
            System.out.println(arr[i]);
        }

        Student[] arrS;
        arrS = new Student[5];

        arrS[0] = new Student(1, "nancy");
        arrS[1] = new Student(2, "Zane");
        arrS[2] = new Student(3, "sahib");
        arrS[3] = new Student(4, "manny");
        arrS[4] = new Student(5, "guru");

        for (int i = 0; i < arrS.length; i++) {
            System.out.println("Element at " + i + " : " + arrS[i].roll_no + " " + arrS[i].name);
        }

        int arrmul[][] = { {1,2,3},{4,5,6},{7,8,9} };

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arrmul[i][j] + " ");
                System.out.println();

            }
        }

        int[] arrRet = retarr();
        for (int i: arrRet
             ) {
            System.out.println(i);

        }
    }

    public static int[] retarr() {
        return new int[]{1,2,3};
    }

}

class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}




