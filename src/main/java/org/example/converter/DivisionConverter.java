package org.example.converter;

import org.example.api.Converter;
import org.example.model.Division;

public class DivisionConverter implements Converter<Division> {

    @Override
    public Division from(String info, String separator) {
        return new Division(info);
    }
}
