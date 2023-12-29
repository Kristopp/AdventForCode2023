package com.aoc.aoc.dayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* As they're making the final adjustments, they discover that their calibration document (your puzzle input) has been amended by a very young Elf who was apparently just excited to show off her art skills. Consequently, the Elves are having trouble reading the values on the document.

The newly-improved calibration document consists of lines of text; each line originally contained a specific calibration value that the Elves now need to recover. On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number.

For example:

1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet
In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.

Consider your entire calibration document. What is the sum of all of the calibration values? */

// Create a algorithm that will find first and the last number of each line and add them together example 1abc2 = 1 + 2 = 12
// 1. what is best way to find the first and last number of each line

// Store the result of each line in a variable and add them together

public class DayOne {
    public static void main(String[] args) {
        DayOne dayOne = new DayOne();
        try {
            System.out.println(dayOne.processFile("aoc/src/main/java/com/aoc/aoc/dayOne/input.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int processFile(String filePath) throws IOException {
        int currentSum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int sum = findFirstAndLastNumber(line);
                currentSum += sum;
            }
        }
        return currentSum;
    }

    public int findFirstAndLastNumber(String line) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(line);
        List<String> numbers = new ArrayList<>();
        int sum = 0;

        while (matcher.find()) {
            numbers.add(matcher.group());
        }

        if (!numbers.isEmpty()) {
            String firstNumber = numbers.get(0);
            String lastNumber = numbers.get(numbers.size() - 1);

            sum = Integer.parseInt(firstNumber + lastNumber);
            System.out.println(sum);
        }
        return sum;
    }
}
