/* Created by Jenny Trac
Created on Oct 23 2017
Program prints all letters of the alphabet using unicode
found how to use unicode on: 
https://stackoverflow.com/questions/16616162/how-to-write-unicode-cross-symbol-in-java */

public class UnicodeAlphabet {

    public static void main(String[] args)
    {
    
    // Upper case
    char upper_case_start = 'A';
    char upper_case_end = 'Z';
        for (int ascii = (int) upper_case_start; (int) upper_case_start <= (int) upper_case_end; upper_case_start++)
            {
            char next_letter = (char) ascii++;            
            System.out.println(next_letter);
            }
    
    // Lower case
    char lower_case_start = 'a';
    char lower_case_end = 'z';
        for (int ascii = (int) lower_case_start; (int) lower_case_start <= (int) lower_case_end; lower_case_start++)
            {
            char next_letter = (char) ascii++;            
            System.out.println(next_letter);
            }
    
    }

}
