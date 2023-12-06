package org.example.reader;

import org.example.api.Reader;
import org.example.converter.PeopleConverter;
import org.example.model.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements Reader<People> {
    @Override
    public List<People> read(String filePath) throws IOException {
        List<People> records = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (!line.equals("id;name;gender;BirtDate;Division;Salary"))
                throw new IllegalArgumentException("CSV not valid");

            line = reader.readLine();
            PeopleConverter converter = new PeopleConverter();
            while (line != null) {
                records.add(converter.from(line, ";"));

                line = reader.readLine();
            }
            return records;
        }
    }
}
