package com.example.demo.controller;

public class Test {

    public int[] getValues(int nums[], int targer) {

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                num = nums[i] + nums[j];
                if (targer == num) {
//                    for (int k = 0; k < nums.length; k++) {
                    System.out.print("\t" + nums[i] + "," + nums[j]);
//                    }
                }
            }
//            System.out.println(nums[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.getValues(new int[]{
                2, 3, 4, 5, 6, 7, 8
        }, 12);

    }
}
