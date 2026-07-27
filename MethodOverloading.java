class Main{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    public static void main(String args[]){
        Main c=new Main();
        System.out.println(c.add (5,10));
        System.out.println(c.add (5.5,4.5));
    }
}
