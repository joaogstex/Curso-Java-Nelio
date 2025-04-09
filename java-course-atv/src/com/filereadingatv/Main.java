package com.filereadingatv;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        File file = new File("C:\\Downloads\\Atividades\\Curso-Java-Nelio\\java-course-atv\\src\\com\\filereadingatv\\texto.txt");
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            } 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }   
}
