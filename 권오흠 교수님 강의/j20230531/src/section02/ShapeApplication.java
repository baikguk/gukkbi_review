package section02;

import java.util.Scanner;

public class ShapeApplication {
    public int capacity = 10;
    private Shape[] shapes=new Shape[capacity];
    private int n =0;
    private Scanner sc = new Scanner(System.in);

    private void processCommand() {
        while (true) {
            System.out.print("$ ");
            String command = sc.next();
            if (command.equals("add")) {
                handleAdd();
            } else if (command.equals("show") || command.equals("showdetail"))
                handleShow(command.equals("showdetail"));
            else if (command.equals("sort")) {
                handleSort(shapes,n);
            } else if (command.equals("exit")) {
                break;
            }

        }
        sc.close();
    }

    private void handleAdd() {
        String type = sc.next();
        switch (type) {
            case "R":
                addShape(new Rectangle(sc.nextInt(), sc.nextInt()));
                break;
            case "C":
                addShape(new Circle(sc.nextInt()));
                break;
            case "T":
                addShape(new RtTriangle(sc.nextInt(), sc.nextInt()));
                break;
        }
    }

    //    private void handleSort() {
//        //bubble sort
//        for (int i = n-1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (shapes[j].computeArea() > shapes[j + 1].computeArea()) {
//                    Shape tmp = shapes[j];
//                    shapes[j] = shapes[j + 1];
//                    shapes[j + 1] = tmp;
//                    }
//                }
//            }
//        }

    // Comparable 인터페이스를 사용한 비교
    private void handleSort(MyComparable[] data, int n) {
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j].compareTo(data[j + 1])>0) {
                    MyComparable tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    }
                }
            }
    }

    private void handleShow(boolean detailed) {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1)+". " + shapes[i].toString());
            if (detailed) {
                System.out.println("        The area is " + shapes[i].computeArea());
                System.out.println("        The perimeter is " + shapes[i].computePerimeter());
            }
        }
    }


        private void addShape(Shape shape) {
        if(n>=capacity){
            reallocate();
        }
        shapes[n++] = shape;
    }

    private void reallocate() {// Shape 배열 다찼을때 크기 늘려주기
        capacity*=2;
        Shape[] tmp = new Shape[capacity];
        System.arraycopy(shapes,0,tmp,0, shapes.length);
        shapes = tmp;
    }


    public static void main(String[] args) {
    ShapeApplication app = new ShapeApplication();
    app.processCommand();
    }
}
