package My_album;

public class Student {
    
    private int id;
    private String name;
    private  String address;
    private String status;
    public Student(){}

    public Student(int id, String name, String address, String status) {
        this.id=id;this.name=name;this.address=address;this.status=status;
    }
    public void set_id(int id) {
        this.id=id;
    }
    public void set_name(String name) {
        this.name=name;
    }
    public void set_address(String address) {
        this.address=address;
    }
    public void set_status(String status) {
        this.status=status;
        // if (status=="yes") {
        //     this.status=true; 
        // }else{
        //     this.status=false;

        // }
    }
    public int get_id() {
        return id;
    }
    public String get_name() {
        return name;
    }
    public String get_address() {
        return address;
    }
    public String get_status() {
        return status;
    }

    public String toString(){
        return "Student {ID_Student:"+ id +" Name:"+name + "Address:" + address+"Status:" + status+"}";
    }

    public void show(){
        System.out.printf("%-5d %-20s %-15s %-15s \n", id, name, address, status);
    }

}
