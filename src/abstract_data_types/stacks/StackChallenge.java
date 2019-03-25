package abstract_data_types.stacks;

import java.util.ListIterator;

public class StackChallenge {

//    1. "I did, did I?" is a palindrome
//2. "Racecar" is a palindrome
//3. "hello" is not a palindrome
    public boolean isPanlindrom(String input) {
        input = input.trim().toLowerCase();

        char[] charArr = input.toCharArray();
        String inputWithoutSpecialChar = "";
        ChallengeStack stack = new ChallengeStack();
        for (char c : charArr) {
            if (c > 'z' || c < 'a') {
                continue;
            }
            inputWithoutSpecialChar += c;
            stack.push(c);
        }

        System.out.println("inputWithoutSpecialChar : " + inputWithoutSpecialChar);

        String popedString = "";

        while (!stack.isEmpty()) {
            char c = stack.pop();
//            System.out.println("c : " + c);
            popedString += c;
        }

        System.out.println("popedString : " + popedString);

        return inputWithoutSpecialChar.equals(popedString);
    }
}
