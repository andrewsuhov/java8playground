/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author asuhov
 */
public class StreamTest
{
    
    public static void main(String[] args)
    {
        System.out.println("Using Java 7:");
        java7();
        
        System.out.println("----------------------------------");
        
        System.out.println("Using Java 8:");
        java8();
    }
    
    private static void java7()
    {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("List: " + strings);

        // Count empty strings and remove them, merge into comma separated string
        long count = 0;
        List<String> filteredList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings)
        {
            if (string.isEmpty())
            {
                count++;
            } else            
            {
                filteredList.add(string);
                stringBuilder.append(string);
                stringBuilder.append(", ");
            }
        }
        String mergedString = stringBuilder.toString();
        System.out.println("Empty strings: " + count);
        System.out.println("Filtered list: " + filteredList);
        System.out.println("Merged string: " + mergedString
                .substring(0, mergedString.length() - 2));

        // Count strings of lenght 3
        count = 0;
        for (String string : strings)
        {
            if (string.length() == 3)
            {
                count++;
            }
        }
        System.out.println("Strings with length = 3: " + count);
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        // List of square distinct numbers
        List<Integer> squares = new ArrayList<>();
        for (Integer number : numbers)
        {
            int square = number * number;
            if (!squares.contains(square))
            {
                squares.add(square);
            }
        }
        System.out.println("Distinctive squares list: " + squares);

        // Statistics
        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("List: " + integers);
        
        int max = integers.get(0);
        for (Integer integer : integers)
        {
            if (integer > max)
            {
                max = integer;
            }
        }
        System.out.println("Highest number in list : " + max);
        
        int min = integers.get(0);
        for (Integer integer : integers)
        {
            if (integer < min)
            {
                min = integer;
            }
        }
        System.out.println("Lowest number in list : " + min);
        
        int sum = 0;
        for (Integer integer : integers)
        {
            sum += integer;
        }
        System.out.println("Sum of all numbers : " + sum);
        System.out.println("Average of all numbers : " + sum / integers.size());

        // Print 10 random numbers
        System.out.println("10 random numbers:");
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(random.nextInt());
        }
        
        int linesOfCode = 123 - 35;
        System.out.println("Lines of code: " + linesOfCode);
    }
    
    private static void java8()
    {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("List: " + strings);

        // Count empty strings and remove them, merge into comma separated string
        System.out.println("Empty strings: " + strings.stream().filter(string -> string.isEmpty()).count());
        System.out.println("Filtered list: " + strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()));
        System.out.println("Merged string: " + strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", ")));

        // Count strings of lenght 3
        System.out.println("String with length = 3: " + strings.stream()
                .filter(string -> string.length() == 3).count());
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // List of square distinct numbers
        System.out.println("Distinctive squares list: " + numbers.stream()
                .map(number -> number * number).distinct().collect(Collectors.toList()));
        
        // Statistics
        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("List: " + integers);
        IntSummaryStatistics statistics = integers.stream().mapToInt(integer -> integer).summaryStatistics();
        System.out.println("Highest number in list : " + statistics.getMax());
        System.out.println("Lowest number in list : " + statistics.getMin());
        System.out.println("Sum of all numbers : " + statistics.getSum());
        System.out.println("Average of all numbers : " + new Double(statistics.getAverage()).intValue());
        System.out.println("10 random numbers:");
        new Random().ints().limit(10).forEach(System.out::println);
        
        int linesOfCode = 157 - 131;
        System.out.println("Lines of code: " + linesOfCode);
    }
}
