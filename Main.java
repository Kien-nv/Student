package Student;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Student> list_st = new ArrayList<Student>();
    static int counter=0;
    

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("1. Add them sinh vien \n"+"2. Xem danh sach sv\n"+"0.Thoát \n"+"3. Searching student \n"
            +"4. Xoa sinh vien \n"
            +"5. Sua thong tin sv\n");
            n= sc.nextInt();
            switch(n) {
            case 1:
                add();
                break;
            case 2:
            show_screen();
            break;
            case 0:
             break;
             case 3:
             search();
         } 
        }while (n!=0);        
    }
    

    public static void input(Student st){

        System.out.print("Input ID_Student "+counter+":");
        st.set_id(sc.nextInt());
        System.out.print("Input Score "+counter+":");
        st.set_score(sc.nextInt());
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
        if (list_st.size()<1)  {
            System.out.println("List empty, Please choice 1 to input !");
            
        } else {
            System.out.printf("%-5s %5s %20s %15s %5s \n", "ID", "Name", "Score", "Address", "Status");
        
        for (Student iStudent : list_st) {
            iStudent.show();
        }
            
        }
        
    }
    public static void add(){
        Student st = new Student();
        input(st);
        list_st.add(st);// Chỗ này mình add st vào trong arraylist rồi sao lúc in ra vẫn là null hết bạn ạ 
    }
    public static void sort(){
    }
    public static void search(){
        int ID;
        System.out.println("Nhap ma sinh vien vao:");
        ID=sc.nextInt();

        for (Student student : list_st) {
            if(student.get_id()==ID){
                student.show();
            }else{
                System.out.println(" Don't have this student !");
            }
            
        }

    }
    public static void edit(){}
    public static void delete(){}





}
