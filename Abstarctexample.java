abstract class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
    abstract void pay();
    void receipt(){
        System.out.println("Receipt Generated");
        System.out.println("mount paid:"+amount);
          }
   void showpaymentstatus(){
        System.out.println("Payment successfull");
     }
   }
   class upipayment extends payment{
       private String upiId;
       upipayment(double amount,String upiId){
       super(amount);
       this.upiId=upiId;
   }
   void pay(){
        System.out.println("processing UPI payment");
         System.out.println("UPI Id:"+upiId);
   }
   }
   class cardpayment extends payment{
       private String cardNumber;
       cardpayment(double amount,String cardNumber){
           super(amount);
           this.cardNumber=cardNumber;
       }
        @Override
   void pay(){
        System.out.println("processing card payment........");
         System.out.println("cardNumber:**** **** ****"+cardNumber.substring(cardNumber.length()-4));
        }
   }
       public class Main{
           public static void main(String[]args){
               payment p1=new upipayment(550.75,"Asmitha@oksbi");
               payment p2=new cardpayment(1250.50,"1234567812345678");
               p1.pay();
               p1.receipt();
               p1.showpaymentstatus();
               System.out.println();
               p2.pay();
               p2.receipt();
               p2.showpaymentstatus();
       }
   }
