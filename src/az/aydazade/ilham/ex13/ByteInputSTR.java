package az.aydazade.ilham.ex13;

import java.io.*;
import java.util.*;

public class ByteInputSTR {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Byte
        System.out.println("");
        System.out.println("Byte");

        byte[] arrayOfBytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        String pieceOfText = "This is a piece of text";
        byte[] arrayOfBytes2 = pieceOfText.getBytes();

        ByteArrayInputStream byteStream = new ByteArrayInputStream(arrayOfBytes);
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(arrayOfBytes2);

        int idx1, idx2;

        while ((idx1 = byteStream.read()) != -1) {
            System.out.print(idx1 + " ");
        }
        while ((idx2 = byteStream2.read()) != -1) {
            System.out.print(idx2 + " ");
        }
    }

}
