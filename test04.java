package com.lkbhua;

public class test04 {
    public static void main(String[] args) {
        /*  ���󣺰�һ�������е�Ԫ�ظ��Ƶ���һ����������ȥ
         * */
         // ������
         // ����һ������
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 2.����һ��������
        int[] newArr = new int[arr.length];

        // 3.�������飬�������е�Ԫ�����ηŵ���������
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 4.���������
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
