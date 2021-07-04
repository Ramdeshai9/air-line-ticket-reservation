import java.util.*;
import java.io.*;
class project implements Serializable
{

    String name,password,email,address,age,phone;
   
Scanner s=new Scanner(System.in);
     
    public void register()
   {
        try
  {
    FileWriter fw=new FileWriter("abcd.txt");
      PrintWriter pw= new PrintWriter(fw);
     System.out.println("enter ur details for register");
       System.out.println("enter name");
        name = s.next();
           pw.println(name); 
        System.out.println("enter password");
            password=s.next();
            pw.println(password);
       System.out.println("enter emailid");
           email=s.next();
            pw.println(email);
     System.out.println("enter address");
           address=s.next();
             pw.println(address);
           System.out.println("enter age");
              age= s.next();
                pw.println(age);
             System.out.println("enter phone");
                   phone=s.next();
                pw.println(phone);
       System.out.println("registered succefully");
        System.out.println("thank you");
            pw.flush();
            pw.close();
        
}
catch(Exception e){}
    }
  

    public void login()
   {
     try
  {
      FileReader fr= new FileReader("abcd.txt");
       BufferedReader br= new BufferedReader(fr);
           String name1= br.readLine();
                
             String password1=br.readLine();
                 
       System.out.println("enter username");
        String username=s.next();
        System.out.println("enter password");
          String   userpassword=s.next();
           if(username.equals(name1) && userpassword.equals(password1))
             {
             System.out.println("1.Booking  \n 2.booking History");
              System.out.println("enter ur choice");
               booking b= new booking();
               int c1=s.nextInt();
                 switch(c1)
                   {
                      case 1: b.from();
                               b.to();
                               b.date();
                               b.flight();
                               b.confirmation();
                                break;
                        case 2: System.out.println("1.previous bookng   \n2.postphone  \n3.cancelticket ");
                                 System.out.println("enter ur choice");
                                  int c2= s.nextInt();
                                  switch(c2) 
                                   {
                                      case 1: b.previous();
                                                break;
                                       case 2: b.postpone();
                                                break;
                                        case 3: b.cancel();
                                                 break;
                                     }
                       }
              }
              else
        {
        System.out.println("username and password mismatch");
           }
}
catch(Exception e){}


     }
  
    

}
