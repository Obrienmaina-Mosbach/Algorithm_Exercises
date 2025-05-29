import java.util.ArrayList;
import java.util.Scanner;

public class PersonSort extends Person {

    public static void bubbleSort(ArrayList<Person> people){
        boolean swapped;

        for (int i = 0; i < people.size()-1; i++) {
            swapped = false;

            for (int j = 0; j < people.size()-1; j++) {
                if (people.get(j).getPersonAge() > people.get(j+1).getPersonAge()) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j+1));
                    people.set(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }


    public PersonSort(int personID, String firstName, String surName, int personAge) {
        super(personID, firstName, surName, personAge);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();


        System.out.println("How many people would you like to sort? ");
        int peopleNumber = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < peopleNumber; i++) {
            System.out.println("Enter the details of person: " + (i + 1));

            System.out.println("ID Number: ");
            int personID = scanner.nextInt();
            scanner.nextLine();

            System.out.println("First Name: ");
            String firstName = scanner.nextLine();

            System.out.println("Second Name: ");
            String surName = scanner.nextLine();

            System.out.println("Age: ");
            int personAge = scanner.nextInt();

            people.add(new Person(personID, firstName, surName, personAge));
        }

        for (Person person : people) {
            System.out.println(person);

        }

        bubbleSort(people);
        for (Person person : people) {
            System.out.println(person);

        }

    }
}
