package com.company.diff;

public class DiffCount {
    public static void main(String[] args) {
        String string = "stop 123 all of them";
        System.out.println("кол-вщ цифр " + countDigits(string));
        System.out.println("кол-во букв " + countLetters(string));
        System.out.println("кол-во пробелов " + countSpaces(string));
    }
        public static int countDigits(String string) {
            long countDigits = string.chars().filter(Character::isDigit).count();
            return (int) countDigits;
        }

    public static int countLetters(String string) {
        long countLetters = string.chars().filter(Character::isLetter).count();
        return (int) countLetters;
    }

    public static int countSpaces(String string) {
        long countSpaces = string.chars().filter(Character::isSpaceChar).count();
        return (int) countSpaces;
    }

}



