package abstract_data_types.stacks;

import java.util.LinkedList;

public class StackChallengeMain {

    public static void main(String[] args) {

        /* My answer
        StackChallenge stackChallenge = new StackChallenge();
        System.out.println(stackChallenge.isPanlindrom("Racecar"));
        System.out.println(stackChallenge.isPanlindrom("hello"));
        System.out.println(stackChallenge.isPanlindrom("I did, did I?"));

        System.out.println(stackChallenge.isPanlindrom("abccba"));
        System.out.println(stackChallenge.isPanlindrom("Was it a car or a cat I saw?"));
        System.out.println(stackChallenge.isPanlindrom("I did, did I?"));
        System.out.println(stackChallenge.isPanlindrom("hello"));
        System.out.println(stackChallenge.isPanlindrom("Don't nod"));
        */

        /* Amswer from the lecture */
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));


    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPuncutaion = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPuncutaion.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPuncutaion.toString());
    }
}
