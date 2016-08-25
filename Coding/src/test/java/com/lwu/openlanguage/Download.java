package com.lwu.openlanguage;

public class Download {

    public static void main(String[] args) {
        for(int i=0; i<A1Beginner.names.length; i++) {
            System.out.println("wget -O " + A1Beginner.names[i] + " https://openlanguage.com/lessons/" + A1Beginner.numbers[i] + "/download-lesson-file\\?type\\=1\\&pass\\=d3baef85fcb82497cb6bb98b685f1b52");
        }
    }


}
