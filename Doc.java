import java.util.*;
public class Doc {
    static Scanner sc = new Scanner(System.in);

    public Stack<String> addAppointment(){
        Stack<String> arr = new Stack<String>();
        System.out.print("Enter your name for the appointment: ");
        String name = sc.nextLine();
        arr.add(name);
        System.out.println("Appointment successfully added");
        return arr;
    }

    public Stack<String> urgentApp(Stack<String> app){
        System.out.print("On a band of 1 to 10 how serious is your condition is: ");
        int i = sc.nextInt();
        sc.nextLine();
        if(i>=5){
            System.out.print("Did the person get hurt on the head? yes or no : ");
            String yes = "yes";
            String s = sc.nextLine();
            if(yes.equals(s.toLowerCase())){
                System.out.print("Enter the name of the patient for the appointment : ");
                String n = sc.nextLine();
                app.insertElementAt(n, 0);
                System.out.println("Appointment successfully added");
            }
            else{
                System.out.print("is the person unconcious : ");
                String m = sc.nextLine();
                if(yes.equals(m.toLowerCase())){
                    System.out.print("Enter the name of the patient for the appointment : ");
                    String r = sc.nextLine();
                    app.insertElementAt(r, 2);
                    System.out.println("Appointment successfully added");
                }
            }
        }
        else{
            System.out.print("Is it possible for you to wait and come at normal schedule? yes or no : ");
            String sch = sc.nextLine();
            String yes = "yes";
            if(yes.equals(sch.toLowerCase())){
                System.out.println("It's good for you to wait if nothing serious");
                System.out.print("Enter the name of the patient for the appointment : ");
                String name = sc.nextLine();
                app.add(name);
                System.out.println("Syccessfully added");
            }
            else{
                System.out.print("Ok we get your urgency, Enter the name of the patient for the appointment : ");
                String name = sc.nextLine();
                app.insertElementAt(name, 4);
                System.out.println("Syccessfully added");
            }
        }
        return app;
    }

    public Stack<String> cancelApp(Stack<String> app){
        System.out.print("Do you want to cancel your appointment? yes or no : ");
        String s = sc.nextLine();
        String yes = "yes";
        if(yes.equals(s.toLowerCase())){
            System.out.print("Enter the name of the appointment you want to cancel : ");
            String cancel = sc.nextLine();
            int i = app.indexOf(cancel);
                app.remove(i);
                System.out.println("cancellation successfull");
        }
        else{
            System.out.println("Good to hear that, do make sure that you come at your scheduled time slot");
        }
        return app;
    }

    public Stack<String> laterApp(Stack<String> app){
        System.out.println("Do you want to reschedule your appointment to a later time? yes or no : ");
        String s = sc.nextLine();
        String yes = "yes";
        if(yes.equals(s.toLowerCase())){
            System.out.print("Enter your appointment name : ");
            String name = sc.nextLine();
            int i = app.indexOf(name);
            String remove = app.remove(i);
            app.add(remove);
            System.out.println("Successfully removed");
        }
        else{
            System.out.println("Good to hear that, do make sure that you come at your scheduled time slot");
        }
        return app;
    }

    public void printApp(Stack<String> app){
        int i =1;
        System.out.println("The appointment list : ");
        Iterator value = app.iterator();
        while(value.hasNext()){
            System.out.println(i+". "+value.next());
            i++;
        }
    }
}
