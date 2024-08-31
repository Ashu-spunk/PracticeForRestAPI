package com.spring.practice.unitconversionapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unit-conversion")
public class UnitConversionApi {

    @PostMapping
    public ConversionDetails convert(@RequestBody ConversionDetails details) throws UnitConverterException {
        UnitConverter.convert(details);

        return details;
    }

}
