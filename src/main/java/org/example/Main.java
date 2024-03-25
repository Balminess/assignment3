package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MyString myString = new MyString();
        int startIndex = myString.indexOfString("software", "ware", 0);
        System.out.println("the starting index of 'ware' of 'software' is "+ startIndex);
        String replacedString = myString.replace("software", "soft", "hard");
        System.out.println("the 'soft' of 'software' replaced by 'hard' is "+ replacedString);

        }
    }
