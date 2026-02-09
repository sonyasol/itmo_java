package org.itmo.lab5;

public class Main {
    public static void main(String[] args) {
        longestWord();
        System.out.println(isPalindrome("заКАз"));
        censoredWord();
        System.out.println(substring("музыка мужчина корова Му", "му"));
        invert("This is a test string");
    }

    public static void longestWord() {
        String text = "Научитесь видеть красоту в картинах, скульптурах, архитектуре и перформансах и понимать их смыслы. Этот курс — для тех, кто хочет понять искусство, но не хочет заучивать даты и сложные термины и разбираться в хронологии. Вместо этого мы сконцентрируемся на ключевых вопросах, которые возникают у посетителей галерей и музеев.";

        if (text != null && !text.isEmpty()) {
            String[] textArray = text.split(" ");
            int maxLength = 0;
            String longestWord = null;
            for (int i = 0; i < textArray.length; i++) {
                if (textArray[i].length() > maxLength) {
                    maxLength = textArray[i].length();
                    longestWord = textArray[i];
                }
            }
            System.out.println(longestWord);
        } else {
            System.out.println("Нет текста!");
        }
    }

    public static boolean isPalindrome(String word) {
        StringBuilder reverseWord = new StringBuilder(word.toLowerCase());
        reverseWord.reverse();

        if (word.toLowerCase().equals(reverseWord.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void censoredWord() {
        String text = "Ах, многие считают,\n" +
                "Что Бука — это Бяка,\n" +
                "А это совершенно\n" +
                "Неправильно, однако!\n" +
                "Да, нас нетрудно спутать,\n" +
                "Но в том-то вся и штука,\n" +
                "Что Бяка — это Бяка,\n" +
                "А Бука — это Бука.";

        String text2 = text.replaceAll("[бБ][яЯ][кК][аА]", "[вырезано цензурой]");

        System.out.println(text2);
    }

    public static int substring(String string, String substring) {
        int counter = 0;
        int i = 0;

        string = string.toLowerCase();
        substring = substring.toLowerCase();

        while ((i = string.indexOf(substring, i)) != -1) {
            counter++;
            i += substring.length();
        }

        return counter;
    }

    public static void invert(String string) {
        StringBuilder invertString = new StringBuilder();
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder s = new StringBuilder(stringArray[i]);
            invertString.append(s.reverse().append(" "));
        }

        System.out.println(invertString);

    }

}

