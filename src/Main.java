import java.io.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
//        String filename = date.getDate() + "_" + date.getMonth() + "_" + calendar.get(Calendar.YEAR) + "_"
//                    + date.getHours() + "_" + date.getMinutes() + "_" + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM") + ".txt";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-a");
        String filename = simpleDateFormat.format(date) + ".txt";

        System.out.println(filename);
        Scanner scan = new Scanner(System.in);



        System.out.println("enter the first name ");
        while (!scan.hasNext( "[A-Z][a-z]*")) {
            System.out.println("That's not a  proper First name!");
            scan.next();
        }
        String  firstName = scan.next();

        System.out.println("Enter the last name ");
        while (!scan.hasNext( "[A-Z][a-z]*")) {
            System.out.println("That's not a  proper Last name!");
            scan.next();
        }
        String lastName = scan.next();

        System.out.println("Please enter  Phone number!");
        while (!scan.hasNext("\\d{10}")) {
            System.out.println("That's not a  proper Phone number!");
            scan.next();
        }
          int phoneNumber=scan.nextInt();

        System.out.println("Please enter a email!");
        while (!scan.hasNext( "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")) {
            System.out.println("That's not a  proper email!");
            scan.next();
        }
        String  email = scan.next();

        try {
            FileWriter file = new FileWriter(filename);
            BufferedWriter output = new BufferedWriter(file);
            output.write(firstName +"\n");
            output.write(lastName+"\n");
            output.write(email+"\n");
            output.write(phoneNumber+"\n");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something gone wrong");
        }

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the fucking thing");
            File myObj = new File(sc.nextLine());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

    }
    }



