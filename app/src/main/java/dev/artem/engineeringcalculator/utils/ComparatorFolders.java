package dev.artem.engineeringcalculator.utils;

import java.util.Comparator;

public class ComparatorFolders implements Comparator<String> {

    @Override
    public int compare(String current, String next) {
        double numberOfCurrent;
        double numberOfNext;
        int result = 0;
        if (current.contains("$") || next.contains("$")) {
            current = current.replaceFirst("\\$", "");
            next = next.replaceFirst("\\$", "");
        }

        if (current.contains("~") && next.contains("~")) {
            String[] splitCurrent = current.split("~");
            String[] splitNext = next.split("~");
            numberOfCurrent = Double.parseDouble(splitCurrent[0]);
            numberOfNext = Double.parseDouble(splitNext[0]);
            double minus = numberOfCurrent - numberOfNext;

            if (minus > 0) {
                result = 1;
            } else if (minus < 0) {
                result = -1;
            }
            else {
                result = 0;
            }
        }
        return result;
    }}
