
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Hi there! So, you are deciding where to take your new career. You want to leave your state, but don't know where you will make the most? We've created this app to help you plan your future finances. \n");
        enterName();
        enterState();
        while(true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Would you like to learn about a different state? ");
            String newState = reader.nextLine();
            if (newState.contains("Yes")) {
                enterState();
            } else {
                System.out.println("Thank you for using our app!");
                break;
            }
        }
    }

    public static void enterName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userAge = reader.nextInt();
        if (userAge < 18){
            throw new ArithmeticException("Access Denied -- You must be at least 18 years of age!");
        }
        else {
            assert true;
        }
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String userName =  reader2.nextLine();
        System.out.println("Welcome " + userName + ", today we will find the state that will lead to your financial freedom! \n");
    }

    public static void slowPrint(String message, long millisPerChar){
        for (int i = 0; i < message.length(); i++)
        {
            System.out.print(message.charAt(i));
            try
            {
                Thread.sleep(millisPerChar);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void enterState() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the state you wish to know more about: ");

        String userState = reader.nextLine();
        switch (userState){
            case "Alabama":
                System.out.println("In the state of Alabama, the average salary for a computer science graduate is $74,085.");
                break;
            case "Alaska":
                System.out.println("In the state of Alaska, the average salary for a computer science graduate is the national average, $82,062.");
                break;
            case "Arizona":
                System.out.println("In the state of Arizona, the average salary for a computer science graduate is $78,423.");
                break;
            case "Arkansas":
                System.out.println("In the state of Arkansas, the average salary for a computer science graduate is $73,794.");
                break;
            case "California":
                System.out.println("In the state of California, the average salary for a computer science graduate is $82,974.");
                break;
            case "Colorado":
                System.out.println("In the state of Colorado, the average salary for a computer science graduate is $77,722.");
                break;
            case "Connecticut":
                System.out.println("In the state of Connecticut, the average salary for a computer science graduate is $80,910.");
                break;
            case "Delaware":
                System.out.println("In the state of Delaware, the average salary for a computer science graduate is $78,795.");
                break;
            case "Florida":
                System.out.println("In the state of Florida, the average salary for a computer science graduate is $67,885.");
                break;
            case "Georgia":
                System.out.println("In the state of Georgia, the average salary for a computer science graduate is $73,456.");
                break;
            case "Hawaii":
                System.out.println("In the state of Hawaii, the average salary for a computer science graduate is $82,590.");
                break;
            case "Idaho":
                System.out.println("In the state of Idaho, the average salary for a computer science graduate is $82,062.");
                break;
            case "Illinois":
                System.out.println("In the state of Illinois, the average salary for a computer science graduate is $71,877.");
                break;
            case "Indiana":
                System.out.println("In the state of Indiana, the average salary for a computer science graduate is $76,051.");
                break;
            case "Iowa":
                System.out.println("In the state of Iowa, the average salary for a computer science graduate is $75,827.");
                break;
            case "Kansas":
                System.out.println("In the state of Kansas, the average salary for a computer science graduate is $76,308.");
                break;
            case "Kentucky":
                System.out.println("In the state of Kentucky, the average salary for a computer science graduate is $76,346.");
                break;
            case "Louisiana":
                System.out.println("In the state of Louisiana, the average salary for a computer science graduate is $76,476.");
                break;
            case "Maine":
                System.out.println("In the state of Maine, the average salary for a computer science graduate is $72,591.");
                break;
            case "Maryland":
                System.out.println("In the state of Maryland, the average salary for a computer science graduate is $84,203.");
                break;
            case "Massachusetts":
                System.out.println("In the state of Massachusetts, the average salary for a computer science graduate is $89,152.");
                break;
            case "Michigan":
                System.out.println("In the state of Michigan, the average salary for a computer science graduate is $71,109.");
                break;
            case "Minnesota":
                System.out.println("In the state of Minnesota, the average salary for a computer science graduate is $78,495.");
                break;
            case "Mississippi":
                System.out.println("In the state of Mississippi, the average salary for a computer science graduate is $71,233.");
                break;
            case "Missouri":
                System.out.println("In the state of Missouri, the average salary for a computer science graduate is $71,186.");
                break;
            case "Montana":
                System.out.println("In the state of Montana, the average salary for a computer science graduate is $82,062.");
                break;
            case "Nebraska":
                System.out.println("In the state of Nebraska, the average salary for a computer science graduate is $80,863.");
                break;
            case "Nevada":
                System.out.println("In the state of Nevada, the average salary for a computer science graduate is $82,062.");
                break;
            case "New Hampshire":
                System.out.println("In the state of New Hampshire, the average salary for a computer science graduate is $78,946.");
                break;
            case "New Jersey":
                System.out.println("In the state of New Jersey, the average salary for a computer science graduate is $78,895.");
                break;
            case "New Mexico":
                System.out.println("In the state of New Mexico, the average salary for a computer science graduate is $73,139.");
                break;
            case "New York":
                System.out.println("In the state of New York, the average salary for a computer science graduate is $89,760.");
                break;
            case "North Carolina":
                System.out.println("In the state of North Carolina, the average salary for a computer science graduate is $63,832.");
                break;
            case "North Dakota":
                System.out.println("In the state of North Dakota, the average salary for a computer science graduate is $82,062.");
                break;
            case "Ohio":
                System.out.println("In the state of Ohio, the average salary for a computer science graduate is $76,158.");
                break;
            case "Oklahoma":
                System.out.println("In the state of Oklahoma, the average salary for a computer science graduate is $75,973.");
                break;
            case "Oregon":
                System.out.println("In the state of Oregon, the average salary for a computer science graduate is $77,466.");
                break;
            case "Pennsylvania":
                System.out.println("In the state of Pennsylvania, the average salary for a computer science graduate is $77,927.");
                break;
            case "Rhode Island":
                System.out.println("In the state of Rhode Island, the average salary for a computer science graduate is $77,582.");
                break;
            case "South Carolina":
                System.out.println("In the state of South Carolina, the average salary for a computer science graduate is $77,453.");
                break;
            case "South Dakota":
                System.out.println("In the state of South Dakota, the average salary for a computer science graduate is $77,423.");
                break;
            case "Tennessee":
                System.out.println("In the state of Tennessee, the average salary for a computer science graduate is $77,012.");
                break;
            case "Texas":
                System.out.println("In the state of Texas, the average salary for a computer science graduate is $74,358.");
                break;
            case "Utah":
                System.out.println("In the state of Utah, the average salary for a computer science graduate is $75,808.");
                break;
            case "Vermont":
                System.out.println("In the state of Vermont, the average salary for a computer science graduate is $82,387.");
                break;
            case "Virginia":
                System.out.println("In the state of Virginia, the average salary for a computer science graduate is $80,140.");
                break;
            case "Washington":
                System.out.println("In the state of Washington, the average salary for a computer science graduate is $82,165.");
                break;
            case "West Virginia":
                System.out.println("In the state of West Virginia, the average salary for a computer science graduate is $79,948.");
                break;
            case "Wisconsin":
                System.out.println("In the state of Wisconsin, the average salary for a computer science graduate is $75,212. \n");
                int salaryWI = 75212;
                int rentWI = 994;
                int foodWI = 300;
                int utilityWI = 250;
                int colWI = 12*(rentWI + foodWI + utilityWI);
                int extraWI = salaryWI - colWI;
                String message = "The average yearly cost of utilities, rent, and food is $" + colWI + ". The money you will have left over to spend/save is $" + extraWI + ". \n";
                slowPrint(message, 70);
                if (extraWI > 30000){
                    String message2 ="This is a very good state to save money and live comfortably! \n";
                    slowPrint(message2, 70);
                }
                else
                {
                    String message3 = userState + " is not a very cost-efficient state! We recommend moving somewhere else in order to maintain a comfortable lifestyle";
                    slowPrint(message3, 70);
                }
                break;
            case "Wyoming":
                System.out.println("In the state of Wyoming, the average salary for a computer science graduate is $82,062.");
                break;
            default:
                System.out.println("This is not a US State! Make sure to enter the full state name. :)");
                break;
        }

    }


}
