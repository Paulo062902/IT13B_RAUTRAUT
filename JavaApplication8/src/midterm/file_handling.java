/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class file_handling {
    public static void main(String[] args) throws IOException {
            String encryptedMessage;
            try (FileWriter myWriter = new FileWriter("C:\Users\Administrator\Documents\rautraut\file handling\file handling.txt)) {
                int key = 10;
                String message = "I Love You!\gwapo kaau ko!\buotan si maam.";
                encryptedMessage = encryptMessage(message, key);
                myWriter.write(encryptedMessage);
                
            }
            System.out.println("Succesfully wrote to the file.");
            System.out.println(encryptedMessage);
        }

        public static String encryptMessage(String message, int key) {
            char[] chars = message.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != '\n') {
                    chars[i] += key;
                }

            }
            return new String(chars);
        }
}

