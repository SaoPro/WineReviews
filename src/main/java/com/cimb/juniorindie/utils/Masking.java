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
        String strLength = null;
        if(strPOB.length() > 5) {
            strLength = strPOB.substring(0,5);
        }
        return strLength;
    }

    public static String maskString(String strText, int start, int end, char maskChar) throws Exception {
        if(strText == null || strText.equals(""))
            return "";

        if(start < 0)
            start = 0;

        if( end > strText.length() )
            end = strText.length();

        if(start > end)
            throw new Exception("Start index cannot be greater than end index");

        int maskLength = end - start;

        if(maskLength == 0)
            return strText;

        StringBuilder sbMaskString = new StringBuilder(maskLength);

        for(int i = 0; i < maskLength; i++){
            sbMaskString.append(maskChar);
        }

        return strText.substring(0, start)
                + sbMaskString.toString()
                + strText.substring(start + maskLength);
    }
}
