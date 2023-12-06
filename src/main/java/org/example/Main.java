package org.example;

import org.example.api.Reader;
import org.example.model.People;
import org.example.reader.CSVReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader<People> reader = new CSVReader();
        List<People> peoples = reader.read("foreign_names.csv");
        System.out.println(Arrays.toString(peoples.toArray()));
    }
}