package com.assignment.traffic;

public class Test {

    public static void main(String[] args) {
        int[] arrays = {2, 3, 4, 5, 6, 7, 9, 8};
        int target = 6;
        int j = 1;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > target || arrays[j] > target) {
                i++;
                j++;
            }
            if (arrays[i] < target && arrays[j] < target) {
                if (arrays[i] + arrays[j] == target) {
                    System.out.println(i + "" + j);
                } else {
                    i++;
                    j++;
                }
            }
        }



    }

    public boolean findElement(){
        int[] array = {7,8,9,2,4,6};
        int[] arrayw = {7,8,9,2,4,6};
        int target= 8;  //o(logn)
        int left = 0;
        int right= array.length-1;
        int mid =(left+ right)/2;




        //merge()



        return true;
    }


}

