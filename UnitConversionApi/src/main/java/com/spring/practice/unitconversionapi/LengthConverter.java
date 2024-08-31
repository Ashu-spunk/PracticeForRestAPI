package com.spring.practice.unitconversionapi;

public class LengthConverter {

   static void kilometer2mile(ConversionDetails details){
        float km = details.getFromValue();
        float miles = km * 0.621371f;
        details.setToValue(miles);

    }

   static void mile2kilometer(ConversionDetails details){
        float miles = details.getFromValue();
        float km = miles * 1.60934f;
        details.setToValue(km);
    }
}
