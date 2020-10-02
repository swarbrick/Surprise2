package com.example.service;

public class CipherService {

	public static String encrypt(String S, int k) {
		String n;
        char[] array;
        char[] newArray;

        array = S.toCharArray();
        // System.out.println(array);
        newArray = array;
        // System.out.println(newArray);

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < k; j++) {
                newArray[i] = transform(newArray[i]);
                // System.out.println(newArray);
            }
        }
        // System.out.println(newArray);


        n = new String(newArray);
        // System.out.println(n);


        return n;
	}
	
	public static String decrypt(String S, int k) {
		return encrypt(S, 104 - k);
	}
	
	public static char transform (char a) {
        char output;

        if (a == 'a') 
            output = 'b';
        else if (a == 'b')
            output = 'c';
        else if (a == 'c')
            output = 'd';
        else if (a == 'd')
            output = 'e';
        else if (a == 'e')
            output = 'f';
        else if (a == 'f')
            output = 'g';
        else if (a == 'g')
            output = 'h';
        else if (a == 'h')
            output = 'i';
        else if (a == 'i')
            output = 'j';
        else if (a == 'j')
            output = 'k';
        else if (a == 'k')
            output = 'l';
        else if (a == 'l')
            output = 'm';
        else if (a == 'm')
            output = 'n';
        else if (a == 'n')
            output = 'o';
        else if (a == 'o')
            output = 'p';
        else if (a == 'p')
            output = 'q';
        else if (a == 'q')
            output = 'r';
        else if (a == 'r')
            output = 's';
        else if (a == 's')
            output = 't';
        else if (a == 't')
            output = 'u';
        else if (a == 'u')
            output = 'v';
        else if (a == 'v')
            output = 'w';
        else if (a == 'w')
            output = 'x';
        else if (a == 'x')
            output = 'y';
        else if (a == 'y')
            output = 'z';
        else if (a == 'z')
            output = 'a';
        else if (a == 'A')
            output = 'B';
        else if (a == 'B')
            output = 'C';
        else if (a == 'C')
            output = 'D';
        else if (a == 'D')
            output = 'E';
        else if (a == 'E')
            output = 'F';
        else if (a == 'F')
            output = 'G';
        else if (a == 'G')
            output = 'H';
        else if (a == 'H')
            output = 'I';
        else if (a == 'I')
            output = 'J';
        else if (a == 'J')
            output = 'K';
        else if (a == 'K')
            output = 'L';
        else if (a == 'L')
            output = 'M';
        else if (a == 'M')
            output = 'N';
        else if (a == 'N')
            output = 'O';
        else if (a == 'O')
            output = 'P';
        else if (a == 'P')
            output = 'Q';
        else if (a == 'Q')
            output = 'R';
        else if (a == 'R')
            output = 'S';
        else if (a == 'S')
            output = 'T';
        else if (a == 'T')
            output = 'U';
        else if (a == 'U')
            output = 'V';
        else if (a == 'V')
            output = 'W';
        else if (a == 'W')
            output = 'X';
        else if (a == 'X')
            output = 'Y';
        else if (a == 'Y')
            output = 'Z';
        else if (a == 'Z')
            output = 'A';
        else 
            output = a;
        
        return output;
    }
}
