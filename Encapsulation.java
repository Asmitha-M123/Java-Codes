class Student{
private int id;
private String name;
public void SetId(int id){
    this.id=id;
}
public void SetName(String name){
    this.name=name;
}
public int getId(){
    return id;
}
public String getname(){
    return name;
}
}
public class Main{
    public static void main(String[]args){
        Student s=new Student();
        s.SetId(101);
        s.SetName("Asmitha");
        System.out.println("id:"+s.getId());
        System.out.println("Name:"+s.getname());
    }
}
