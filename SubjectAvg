class Student{
	    int rollno;
	    String name;
	    String dept;
	    String sec;
	    int year;
	    Student(int rollno,String name,String dept,String sec,int year){
	        this.rollno=rollno;
	        this.name=name;
	        this.dept=dept;
	        this.sec=sec;
	        this.year=year;
	    }
       }
       class mark{
           int tamil,english,maths,science,social;
           mark(int tamil,int english,int maths,int science,int social){
               this.tamil=tamil;
	           this.english=english;
	           this.maths=maths;
	           this.science=science;
	           this.social=social;
           }
       int total(){
           return tamil+english+maths+science+social;
       }
       double average(){
           return total()/5.0;
         }
       }
       public class Main{
            public static void main(String[]args){
            Student[]Students=new Student[2];
            mark[]marks=new mark[2];
	        Students[0]=new Student(101,"Arun","CSE","A",3);
	        marks[0]=new mark(87,79,89,90,99);
	        Students[1]=new Student(102,"priya","IT","B",3);    
            marks[1]=new mark(77,78,98,88,70);
           for(int i=0;i<Students.length;i++){
	        System.out.println("rollno:"+Students[i].rollno);
	        System.out.println("name:"+Students[i].name);
	        System.out.println("dept:"+Students[i].dept);
	        System.out.println("sec:"+Students[i].sec);
	        System.out.println("year:"+Students[i].year);
	        System.out.println("tamil:"+marks[i].tamil);
	        System.out.println("english:"+marks[i].english);
	        System.out.println("maths:"+marks[i].maths);
	        System.out.println("science:"+marks[i].science);
	        System.out.println("social:"+marks[i].social);
	        System.out.println("total:"+marks[i].total());
	         System.out.println("average:"+marks[i].average());
	        System.out.println();
           }
            }
       }
	 
	 
	
	
