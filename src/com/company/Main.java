package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        Scanner Keyboard = new Scanner(System.in);

        //create a new person

        String person;
        Person newPerson = new Person();
        newPerson.getFirstName();
        System.out.print("Enter person's first name:");

        //Get details from the user
        newPerson.setFirstName(Keyboard.nextLine());

        newPerson.getLastName();
       //Output user's input
       System.out.print("You entered :"+newPerson.getFirstName() +" as the person's first name");
       newPerson.setLastName(Keyboard.nextLine());
       newPerson.getLastName();

       //System.out.println("Enter person's lastName:"+newPerson.getLastName());
        newPerson.setLastName(Keyboard.nextLine());

        ArrayList <Person> thePersonList = new ArrayList<Person>();
        thePersonList.add(newPerson);

        //System.out.println("This is the name entered for the first person:"+thePersonList.get(0).getFirstName());
        System.out.print("Enter person's lastname:"+newPerson.getLastName());
     //   Doctor drPerson = new Doctor();


     //   System.out.print("You entered " + newPerson.getFirstName() + " as the person's first name");

//add 5 people

    //thePersonList.add(newPerson);
   // thePersonList.add(newPerson2);
   // thePersonList.add(newPerson3);
   // thePersonList.add(newPerson4);
   // thePersonList.add(newPerson5);

//for(int i=o; i<5; i++)

//Person newperson = new person();
//System.out.println("Enter person's first name");

for(Person eachPerson: thePersonList)
    {

        eachPerson.getFirstName();
    }


}

    public static void testArrayLists()

    {
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("First String");
        arrayList.add("Second String");
        arrayList.add("Third String");
        arrayList.add("Fourth String");
        arrayList.add("Fifth String");
        System.out.println("This arraylist has "+arrayList.size()+" items");
        for(int counter=0; counter<arrayList.size(); counter++)
        {
            System.out.println(arrayList.get(counter));
        }

        System.out.println(" ");

        for(String eachItem: arrayList )
        {

            System.out.println(eachItem);
        }


    }
}


