//Convert list of words to list of characters
package Assignments.Other;

import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<String> words = List.of("Suman", "Kumar", "Dey");

        List<Character> characters = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
        System.out.println(characters);
    }
}
