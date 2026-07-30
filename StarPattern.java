public class Main{
    public static void main(String[]args){
        int n=4;
        
        for(int i=1;i<=n;i++)
        {
            if(i>=3){
            for(int j=1;j<=3;j++)
            {
                System.out.print(" ");
            }
            }
            for(int k=1;k<=2;k++){
                System.out.print("*");
                if(k<3){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
