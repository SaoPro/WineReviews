package com.cimb.juniorindie.utils;

import java.util.Date;

public class Masking {

    public static void main(String[] args) throws Exception {

        String strNIK = "1234567812345678";
        String strPOB = "Cirebon";

        System.out.println( maskString(strNIK, 0, 12, '*') );

        System.out.println( maskString(convertToFiveLength(strPOB), 3, strPOB.length(), '*') );
    }

    public static String convertToFiveLength(String strPOB){
        Strin