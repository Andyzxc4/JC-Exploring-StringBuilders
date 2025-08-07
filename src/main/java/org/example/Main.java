package org.example;


public class Main {
    public static void main(String[] args) {

        /*
        1. Prediction:
            - In StringBuilder, when we use .append(), it act same as concatenating of Strings.
              So the prediction of the output based one below code will be "Hello, Cadets!".

        2. Observation:
            - Hello, Cadets!
         */

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", Cadets!");
        System.out.println(sb1);

        /*
        1. Prediction:
            - In StringBuilder, when we use .insert(), it acts same as append(), but it provides
              more flexibility by inserting a String based on the index/offset that we want to
              insert in our StringBuilder.

              So the prediction of the output based one below code will be "Java is really great!"

        2. Observation:
            - Java is really great!
         */
        System.out.println(" ");
        StringBuilder sb2 = new StringBuilder("Java is great!");
        sb2.insert(8, "really ");
        System.out.println(sb2);

        /*
        1. Prediction:
            - With delete(), we will specify the starting of index that we want to delete, in this case it will be
              index 8, it will start deleting at character 'a', since it is inclusive. The next/end index is 16, so at
              index 16, it will delete "a test s", take note that end index in delete() is exclusive, so technically it
              will delete the last index at 15 which is 's'. Output here will be "This is entence."

              And for deleteCharAt(), we only need to specify the index that we want to delete, since StringBuilder is
              mutable, this makes deleteCharAt(4) delete the character " " at our current "This is entence." for
              String Builder.

        2. Observation:
            - After delete(8, 16): This is entence.
              After deleteCharAt(4): Thisis entence.
         */
        StringBuilder sb3 = new StringBuilder("This is a test sentence.");
        sb3.delete(8, 16);
        System.out.println("\nAfter delete(8, 16): " + sb3);

        sb3.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb3);

        /*
        1. Prediction:
            - With replace(), it creates a StringBuilder with the text "I like programming in Python." Then it
              replaces the characters from index 24 to 30 with "Java"

        2. Observation:
            - I like programming in PyJava
         */
        StringBuilder sb4 = new StringBuilder("I like programming in Python.");
        sb4.replace(24, 30, "Java");
        System.out.println(" ");
        System.out.println(sb4);

       /*
        1. Prediction:
            - The code starts with the string "Start" and appends "..." to make it "Start...". Then, it inserts
            "Ready, Set, " at the beginning, resulting in "Ready, Set, Start...". Finally, it deletes the characters
            from index 12 to 15 (which corresponds to "Sta"), leaving the final output as "Ready, Set, rt...".

        2. Observation:
            - Ready, Set, rt...
         */
        StringBuilder sb5 = new StringBuilder("Start");
        System.out.println(" ");
        sb5.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        System.out.println(sb5);

        /*
        1. Prediction:
            - We extract a substring from index 16 to 19 of sb6 (String Builder), which gives "fox". Then, it finds the
            index of the word "fox" in the string, which is 16. Lastly, it searches for the word "cat",
            which doesn't exist in the string, so it returns -1.

        2. Observation:
            - Substring: fox
              Index of 'fox': 16
              Index of 'cat': -1
         */
        System.out.println(" ");
        StringBuilder sb6 = new StringBuilder("The quick brown fox jumps over the lazy dog.");

        String subStrSb6 = sb6.substring(16, 19);
        System.out.println("Substring: " + subStrSb6); // fox

        int indexOfFox = sb6.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox); // 16

        int indexOfCat = sb6.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat); // -1

        /*
        1. Prediction:
            - We declare a StringBuilder with the text "Status: " and appends "Pending", making it "Status: Pending".
              It then stores the current content as a separate String in finalStatus.
              After that, " - Approved" is appended to the StringBuilder, making it "Status: Pending - Approved".
              However, finalStatus remains unchanged as "Status: Pending" because it's a snapshot taken before the
              second append. The output shows the "Status: Pending - Approved" for sb7 and "Status: Pending" for finalStatus.

        2. Observation:
            - StringBuilder: Status: Pending - Approved
              Final String: Status: Pending
         */
        System.out.println(" ");
        StringBuilder sb7 = new StringBuilder("Status: ");
        sb7.append("Pending");

        String finalStatus = sb7.toString();

        sb7.append(" - Approved");

        System.out.println("StringBuilder: " + sb7);
        System.out.println("Final String: " + finalStatus);
    }
}