package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = reader.nextLine();

        while(true){
            System.out.println(name + "'s to-do list manager");
            System.out.println("Press 1 to add a task to the list");
            System.out.println("Press 2 to remove a task from the list");
            System.out.println("Press 3 to display the list");
            System.out.println("Press 4 to quit");
            int choice = Integer.parseInt(reader.nextLine());
            System.out.println("");
            if(choice == 1){
                System.out.println("Type what task you wish to add to the list");
                String task = reader.nextLine();

                list.add(task);
            }

            else if(choice == 2){
                if(list.size() == 0){
                    System.out.println("The list is empty!");
                }
                else{
                    System.out.println("Which task number do you wish to remove from the list");
                    for(int i = 0; i < list.size(); i++){
                        System.out.println((i + 1 + ". ") + list.get(i));
                    }
                    int number = Integer.parseInt(reader.nextLine());
                    if(number < 0 || number > list.size()){
                        System.out.println("Not a valid number");
                    }
                    else{
                        list.remove(number - 1);
                    }

                }

            }

            else if(choice == 3){
                for(int i = 0; i < list.size(); i++){
                    System.out.println((i + 1 + ". ") + list.get(i));
                }
            }

            else if(choice == 4){
                break;
            }

            else{
                System.out.println("Please enter a valid selection.");
            }
            System.out.println("");

        }



    }


}
