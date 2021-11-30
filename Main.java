import java.util.*;
class Main{
    public static void main(String[] args){
        Stack<String> appointment = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println();
            Doc obj = new Doc();
            System.out.println("Welcome to doctor appointment list");
            System.out.println("Select any one option");
            System.out.println("1. Take a normal appointment");
            System.out.println("2. Take an urgent appointment");
            System.out.println("3. Cancel your appointment");
            System.out.println("4. Schedule your current appointment to later time");
            System.out.println("5. Print the appointment list");
            System.out.println("6. Exit the appointment form");
            int k = sc.nextInt();
            
            switch(k){
                case 1:
                    appointment = obj.addAppointment();
                    break;
                case 2:
                    appointment = obj.urgentApp(appointment);
                    break;
                case 3:
                    appointment = obj.cancelApp(appointment);
                    break;
                case 4:
                    appointment = obj.laterApp(appointment);
                    break;
                case 5:
                    obj.printApp(appointment);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter correct options");
                    break;                
            }
        }
        sc.close();
    }
}