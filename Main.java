package My_album;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Student> list_st = new ArrayList<Student>();
    static Student st=new Student();
    static int counter =1;
    

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("1. Add them sinh vien \n"+"2. Xem danh sach sv"+"0.Thoát");
            n= sc.nextInt();
            if (n==1) {
                add();
            }else if (n==2) {show_screen();}
            else if (n==0) {break;}
        } while (n!=0);

        
    }
    

    public static void input(Student st){

        System.out.print("Input ID_Student "+counter+":");
        st.set_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Input name "+counter+":");
        st.set_name(sc.nextLine());
        System.out.print("Input Address "+counter+":");
        st.set_address(sc.nextLine());
        System.out.print("Input Status Study "+counter+":");
        st.set_status(sc.nextLine());
        counter++;
    }
    public static void show_screen(){
        System.out.printf("%-5s %5s %20s %15s \n", "ID", "Name", "Address", "Status");
        
        for (Student iStudent : list_st) {
            iStudent= new Student();
            iStudent.show();
        }
        
    }
    public static void add(){
        // st= new Student();
        input(st);
        list_st.add(st);
    }

}