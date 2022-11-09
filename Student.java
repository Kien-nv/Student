package Student;

public class Student {
    
    private int id;
    private String name;
    private  String address;
    public Student(){}
    public Student(int id){
        this.id=id;
    }
    private String status;
    private int score;

    public Student(int id, String name, String address, String status, int score){ 
        {
        this.id=id;this.name=name;this.address=address;this.status=status;this.score=score;
    }}
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
    }
    public void set_score(int score) {
        this.score=score;

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
    public int get_score(){
        return score;
    }

    public String toString(){
        return "Student {ID_Student:"+ id +" Name:"+name + "Score:" +score+ "Address:" + address+"Status:" + status+"}";
    }

    public void show(){
        System.out.printf("%-5d %-20s %-5d %-15s %-15s  \n", id, name, score, address, status);
    }

}
