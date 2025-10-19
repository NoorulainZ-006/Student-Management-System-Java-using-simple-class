
import java.util.Scanner;

class Students {
    String name;
    int id;
    Double grade;

    Students() {
        name = null;
        id = 0;
        grade = 0.0;
    }

    public void addStudent(String nam, int ide, double grad) {
        name = nam;
        id = ide;
        grade = grad;
        System.out.println("Student added successfully!");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }

    public void viewStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }

    public void removeStudent() {
        System.out.println("Student : " + name + "\n ID : " + id + "\n removed successfully!\n");
        name = null;
        id = 0;
        grade = 0.0;
        
    }

}

public class studentSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Students std1 = new Students();
        Students std2 = new Students();
        Students std3 = new Students();
        std1.name = "Zahra";
        std1.id = 1;
        std1.grade = 92.5;
        int searchID, removeID;

        int choice;
        do {
            System.out.println("---------------------------------");
            System.out.println("=== Student Management System ===");
            System.out.println("---------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Show all Students");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            String name1;
            int id1;
            double grade1;
            switch (choice) {
                case 1:
                    System.out.println("\n-----------------------------");
                    System.out.println("You can add 2 students");

                    input.nextLine(); 

                    System.out.print("Enter the name: ");
                    name1 = input.nextLine();

                    System.out.print("Enter the id: ");
                    id1 = input.nextInt();

                    System.out.print("Enter the grades: ");
                    grade1 = input.nextDouble();

                    std2.addStudent(name1, id1, grade1);

                    input.nextLine(); 

                    System.out.println("------------------------");
                    System.out.print("Enter the name: ");
                    name1 = input.nextLine();

                    System.out.print("Enter the id: ");
                    id1 = input.nextInt();

                    System.out.print("Enter the grades: ");
                    grade1 = input.nextDouble();

                    std3.addStudent(name1, id1, grade1);
                    System.out.println("\n-----------------------------");
                    break;

                case 2:
                    System.out.println("\n-----------------------------");
                    System.out.print("\nEnter the id of student to search: ");
                    searchID = input.nextInt();
                    if (searchID == std1.id) {
                        std1.viewStudent();
                    } else if (searchID == std2.id) {
                        std2.viewStudent();
                    } else if (searchID == std3.id) {
                        std3.viewStudent();
                    } else {
                        System.out.println("ID not found");
                    }
                    System.out.println("\n-----------------------------");
                    break;
                case 3:
                    System.out.println("\n-----------------------------");
                    System.out.print("\nEnter the id of student to search: ");
                    removeID = input.nextInt();
                    if (removeID == std1.id) {
                        std1.removeStudent();
                    } else if (removeID == std2.id) {
                        std2.removeStudent();
                    } else if (removeID == std3.id) {
                        std3.removeStudent();
                    } else {
                        System.out.println("ID not found");
                    }
                    System.out.println("\n-----------------------------");
                    break;
                case 4:
                    System.out.println("\n-----------------------------");
                    if(std1.id!=0){std1.viewStudent();}
                    if(std2.id!=0){std2.viewStudent();}
                    if(std3.id!=0){std3.viewStudent();}
                    System.out.println("\n-----------------------------");
                    break;
                case 5:
                    System.out.println("\n-----------------------------");
                    System.out.println("Exiting the program");
                    System.out.println("\n-----------------------------");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        input.close();
    }
}
