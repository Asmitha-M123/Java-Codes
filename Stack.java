import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Stack Size:");
        int size=Sc.nextInt();
        int[] Stack=new int[size];
        int top=-1;
        int choice;
        do{
            System.out.println(" 1.push");
            System.out.println(" 2.pop");
            System.out.println("3.peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice:");
            choice=Sc.nextInt();
            switch(choice){
            case 1:
                if(top==size-1){
                    System.out.println("Stack overflow");
                }
                else{
                    System.out.print("Enter value");
                    int value=Sc.nextInt();
                    top++;
                    Stack[top]=value;
                    System.out.println(value+"inserted");
                }
                break;
                case 2:
                    if(top==-1){
                        System.out.println("Stack underflow");
                    }
                    else{
                        System.out.println(Stack[top]+"removed");
                        top--;
                    }
                    break;
                    case 3:
                        if(top==-1){
                            System.out.println("Stack is empty");
                        }
                        else{
                            System.out.println("top element="+Stack[top]);
                        }
                        break;
                        case 4:
                            if(top==-1){
                                System.out.println("stack is empty");
                            }
                            else{
                                System.out.println("Stack Elements:");
                                for(int i=top;i>=0;i--){
                                    System.out.println(Stack[i]);
                                }
                            }
                            break;
                            case 5:
                                System.out.println("program ended");
                                break;
                                default:
                                System.out.println("invalid choice");
                        }
                    }
                    while(choice!=5);
                    Sc.close();
                    }
                    
                }
