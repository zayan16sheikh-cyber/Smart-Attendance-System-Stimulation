
import java.util.Scanner;

class Student {
    int roll;
    String name;
    boolean present;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Ali";
        
        Student s2 = new Student();
        s2.roll = 102;
        s2.name = "Bob";
        
        Student s3 = new Student();
        s3.roll = 103;
        s3.name = "Cia";

        Student s4 = new Student();
        s4.roll = 104;
        s4.name = "Dan";

        Student s5 = new Student();
        s5.roll = 105;
        s5.name = "Eva";

        int choice;
        do {
            System.out.println("\n1.View 2.MarkAll 3.MarkOne 4.Summary 0.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(s1.roll + " | " + s1.name + " | " + s1.present);
                    System.out.println(s2.roll + " | " + s2.name + " | " + s2.present);
                    System.out.println(s3.roll + " | " + s3.name + " | " + s3.present);
                    System.out.println(s4.roll + " | " + s4.name + " | " + s4.present);
                    System.out.println(s5.roll + " | " + s5.name + " | " + s5.present);
                    break;
                case 2:
                    System.out.print(s1.name + " present? (1=Y, 0=N): ");
                    if (sc.nextInt() == 1) {
                        s1.present = true;
                    } else {
                        s1.present = false;
                    }
                    
                    System.out.print(s2.name + " present? (1=Y, 0=N): ");
                    if (sc.nextInt() == 1) {
                        s2.present = true;
                    } else {
                        s2.present = false;
                    }
                    
                    System.out.print(s3.name + " present? (1=Y, 0=N): ");
                    if (sc.nextInt() == 1) {
                        s3.present = true;
                    } else {
                        s3.present = false;
                    }

                    System.out.print(s4.name + " present? (1=Y, 0=N): ");
                    if (sc.nextInt() == 1) {
                        s4.present = true;
                    } else {
                        s4.present = false;
                    }

                    System.out.print(s5.name + " present? (1=Y, 0=N): ");
                    if (sc.nextInt() == 1) {
                        s5.present = true;
                    } else {
                        s5.present = false;
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No: ");
                    int id = sc.nextInt();
                    
                    if (id == s1.roll) {
                        s1.present = true;
                    } else if (id == s2.roll) {
                        s2.present = true;
                    } else if (id == s3.roll) {
                        s3.present = true;
                    } else if (id == s4.roll) {
                        s4.present = true;
                    } else if (id == s5.roll) {
                        s5.present = true;
                    }
                    break;
                case 4:
                    int p = 0;
                    if (s1.present == true) {
                        p++;
                    }
                    if (s2.present == true) {
                        p++;
                    }
                    if (s3.present == true) {
                        p++;
                    }
                    if (s4.present == true) {
                        p++;
                    }
                    if (s5.present == true) {
                        p++;
                    }
                    
                    int absent = 5 - p;
                    System.out.println("Total: 5 | Present: " + p + " | Absent: " + absent);
                    break;
            }
        } while (choice != 0);
        
        sc.close();
    }
}
