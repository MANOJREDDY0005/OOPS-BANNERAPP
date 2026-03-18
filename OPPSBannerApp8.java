// UC8.java
// Demonstrates modular design using utility static methods
// Prints character patterns for a given message

import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Method to initialize patterns for characters
    public static Map<Character, String[]> initCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('A', new String[]{
                " *** ",
                "*   *",
                "*****",
                "*   *",
                "*   *"
     
        patterns.put('B', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        });

        patterns.put('C', new String[]{
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
