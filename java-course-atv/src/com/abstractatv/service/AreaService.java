package com.abstractatv.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.abstractatv.entities.Circle;
import com.abstractatv.entities.Rectangle;
import com.abstractatv.entities.abstracts.Shape;
import com.abstractatv.entities.enums.Color;

public class AreaService {
    
    static final Scanner scanner = new Scanner(System.in);
    public void getArea() {
        System.out.println("Enter the number of shapes: ");
        Integer quantity = Integer.parseInt(scanner.nextLine());
        List<Shape> shapes = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            System.out.println("Shape #"+i+" data:");
            System.out.println("Rectangle or circle? (r/c)");
            Character choosenChar = scanner.nextLine().charAt(0);

            if(choosenChar == 'r') {
                System.out.println("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(scanner.nextLine());
                System.out.println("Width: ");
                Double width = Double.parseDouble(scanner.nextLine());
                System.out.println("Height: ");
                Double height = Double.parseDouble(scanner.nextLine());
                Rectangle rectangle = new Rectangle(color, height, width);
                shapes.add(rectangle);
            } else if(choosenChar == 'c') {
                System.out.println("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(scanner.nextLine());
                System.out.println("Radius: ");
                Double radius = Double.parseDouble(scanner.nextLine());
                Circle circle = new Circle(color, radius);
                shapes.add(circle);
            }
        }
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
