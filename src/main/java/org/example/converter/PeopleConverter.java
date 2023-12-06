package org.example.converter;

import org.example.api.Converter;
import org.example.model.Gender;
import org.example.model.People;

public class PeopleConverter implements Converter<People> {
    @Override
    public People from(String info, String separator) {
        People people = new People();
        String[] values = info.split(separator);

        people.setId(Long.parseLong(values[0]));
        people.setName(values[1]);
        people.setGender(values[2].equals("Male") ? Gender.MAN : Gender.FEMALE);
        people.setBirthdate(values[3]);
        people.setDivision(new DivisionConverter().from(values[4], ";"));
        people.setSalary(Long.parseLong(values[5]));

        return people;
    }
}
