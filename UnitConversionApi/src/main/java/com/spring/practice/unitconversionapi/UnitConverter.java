package com.spring.practice.unitconversionapi;

public class UnitConverter {

    static void convert(ConversionDetails details) throws UnitConverterException {
        String fromUnit = details.getFromUnit();
        String toUnit = details.getToUnit();

        if(fromUnit.equals("km")&& toUnit.equals("mile")){
            LengthConverter.kilometer2mile(details);
        }else if(fromUnit.equals("mile")&& toUnit.equals("km")){
            LengthConverter.mile2kilometer(details);
        }else{
            throw new UnitConverterException("Invalid from and to unit: " + fromUnit);
        }
    }
}
