package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] oddNumbers(int n){

        int[] array;
        int index = 0;

        //array = new int[(n+1) / 2];

        if(n % 2 == 0){
            array = new int[n /2];
        }else{
            array = new int[n / 2 + 1];
        }

        for(int i = 0; i <= n ; i++ ){
            if(i % 2 != 0) {
                array[index] = i;
                index++;
            }
        }

        return array;
    }


    public static boolean forbidenWords(String sentence){

        boolean result = false;

        String[] sentenceArray = sentence.split(" ");

        String[] keyWordsArray = {"abstract", "assert", "boolean", "break", "byte", "case","catch", "char","class", "continue","default", "do","double",
                "else","enum", "extends","final", "finally","float", "for","if", "implements","import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try","void", "volatile","while"};



        for(String s : sentenceArray){
            for(String j : keyWordsArray){
                if(s.equals(j)) result = true;
            }
        }


        return result;
    }


}