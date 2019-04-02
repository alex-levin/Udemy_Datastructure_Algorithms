package abstract_data_types.queues;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueChallenge {




//    1. "I did, did I?" is a palindrome
//    2. "Racecar" is a palindrome
//    3. "hello" is not a palindrome
    public static void main(String[] args) {
        System.out.println(isPalindrom("I did, did I?"));
        System.out.println(isPalindrom("Racecar"));
        System.out.println(isPalindrom("hello"));
        System.out.println(isPalindrom(""));
        System.out.println(isPalindrom("u"));
        System.out.println(isPalindrom("abccba"));
        System.out.println(isPalindrom("Was it a car or a cat I saw?"));
        System.out.println(isPalindrom("Dont' nod"));

        System.out.println("===================");

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Dont' nod"));

        System.out.println("===================");

        System.out.println(isPalindromV2("I did, did I?"));
        System.out.println(isPalindromV2("Racecar"));
        System.out.println(isPalindromV2("hello"));
        System.out.println(isPalindromV2(""));
        System.out.println(isPalindromV2("u"));
        System.out.println(isPalindromV2("abccba"));
        System.out.println(isPalindromV2("Was it a car or a cat I saw?"));
        System.out.println(isPalindromV2("Dont' nod"));

    }


    // My answer
    public static boolean isPalindrom(String inputStr) {

        // Filtering
        inputStr = inputStr.trim().toLowerCase();
        if (inputStr.isEmpty() || inputStr.length() < 2) {
            return false;
        }

        // Transform to Character array
        char[] charArr = inputStr.toCharArray();

        // Store into queue & stack
        ChallengeQueue queue = new ChallengeQueue();
        ChallengeStack stack = new ChallengeStack();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] < 'a' || charArr[i] > 'z') {
                continue;
            }
            queue.add(charArr[i]);
            stack.push(charArr[i]);
        }

        StringBuilder fromQueueStrBld = new StringBuilder();
        while (queue.getSize() > 0) {
            fromQueueStrBld.append(queue.remove());
        }

        StringBuilder fromStackStrBld = new StringBuilder();
        while (stack.getSize() > 0) {
            fromStackStrBld.append(stack.pop());
        }

//        System.out.println("fromQueueStrBld : " + fromQueueStrBld);
//        System.out.println("fromStackStrBld : " + fromStackStrBld);

        return fromQueueStrBld.toString().equals(fromStackStrBld.toString());

    }

    // My answer version-2
    public static boolean isPalindromV2(String inputStr) {
        inputStr = inputStr.trim().toLowerCase();

        if (inputStr.isEmpty() || inputStr.length() < 2) {
            return false;
        }

        char[] charArr = inputStr.toCharArray();

        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= 'a' && charArr[i] <= 'z') {
                queue.add(charArr[i]);
                stack.push(charArr[i]);
            }
        }

        if (queue.size() != stack.size()) {
            return false;
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }


    // Answer from the lecture
    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;

    }

}
