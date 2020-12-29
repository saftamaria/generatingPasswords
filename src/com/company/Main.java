package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

    private static char[] generatePassword(int length){
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "¬@~$";
        String numbers = "1234567890";
        String combinatedChars = capitalCaseLetters + lowerCaseLetters + numbers;

        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        for(int i = 4; i < length; i++){
            password[i] = combinatedChars.charAt(random.nextInt(combinatedChars.length()));
        }
        return password;
    }

}
