package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] mas = new int[7][4];
        int max = 0;
        for(int i=0; i<mas.length; i++){
            for(int j=0; j<mas[i].length; j++) {
                mas[i][j] = (int)(Math.random()*-100+100);
                System.out.print(mas[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<mas.length; i++) {
            for(int j=0; j<mas[i].length; j++) {
                if(max < mas[i][j]) {
                    max = mas[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
