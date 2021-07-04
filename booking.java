import java.util.*;
import java.io.*;
class booking 
{
 
   Scanner s= new Scanner(System.in);
	public void from()
{
    try
{
    FileWriter fw=new FileWriter("abcde.txt");
      PrintWriter pw= new PrintWriter(fw);

   System.out.println("enter starting place");
    System.out.println(" 1. Hyderabad \n2.banglore  \n3.chennai \n4.dehli \n5.mumbai");
    System.out.println("enter ur choice");
               int c1=s.nextInt();
    switch(c1)
{
   case 1: pw.println( "Hyderabad");
             
             break;
     case 2: pw.println( "Banglore");
              
             break;
 case 3: pw.println( "Chennai");
              
             break;
 case 4: pw.println( "Delhi");
              
             break;
 case 5: pw.println( "Mumbai");
               
             break;
}
 pw.flush();
 pw.close();
}
catch(Exception e){}
}
 public void to()
{
try
{
    FileWriter fw=new FileWriter("abcde.txt",true);
      PrintWriter pw= new PrintWriter(fw);
  System.out.println("enter Destination place");
    System.out.println(" 1.Maldives \n2.London  \n3.Dubai \n4.Newyork \n5.Melbourne");
    System.out.println("enter ur choice");
          int c2=s.nextInt();
      switch(c2)
      {
  case 1: pw.println( "Maldives");
             break;
     case 2: pw.println( "London");
             break;
 case 3: pw.println( " Dubai");
             break;
 case 4: pw.println( "Newyork");
             break;
 case 5: pw.println( "Melbourne");
             break;
}
 pw.flush();
 pw.close();
}
catch(Exception e){}
  }
 public void date()
{
  try
{
    FileWriter fw=new FileWriter("abcde.txt",true);
      PrintWriter pw= new PrintWriter(fw);
       System.out.println("enter date of travelling");
        String date= s.next();
       pw.println(date);
     pw.flush();
      pw.close();
 }
 catch(Exception e){}
}
   
 public void flight()
{
 try
{
    FileWriter fw=new FileWriter("abcde.txt",true);
      PrintWriter pw= new PrintWriter(fw);
     System.out.println("choice ur reqiured flights");
     System.out.println(" 1.airindia  bording time : 6:30    depature time : 13:30 \n 2. Emirates  bording time : 8:30    depature time : 16:30   \n 3.Indigo Airlines   bording time : 10:30    depature time : 18:30 \n 4. Air Asia  bording time : 14:30    depature time : 22:45  \n  5. Spicejet bording time : 19:30    depature time : 03:30 ");
      System.out.println("enter ur choice");
          int c3=s.nextInt();
      switch(c3)
      {
  case 1: pw.println( "Airindia Airlines");
           pw.println( "bording time : 6:30 ");
           pw.println( "depature time : 13:30 ");
           pw.println( " 35000 ");
          
             break;
     case 2: pw.println( "Emirates Airlines   ");
           pw.println( "bording time : 8:30  ");
           pw.println( "depature time : 16:30 ");
           pw.println( " 45000 ");
             break;
 case 3:pw.println( "Indigo Airlines     ");
           pw.println( " bording time : 10:30  ");
           pw.println( "depature time : 18:30");
           pw.println( " 38000 ");
             break;
 case 4: pw.println( "Air Asia Airlines    ");
           pw.println( "bording time : 14:30 ");
           pw.println( " depature time : 22:45 ");
           pw.println( " 22000 ");
             break;
 case 5: pw.println( "Spicejet Airlines   ");
           pw.println( " bording time : 19:30 ");
           pw.println( "depature time : 03:30 ");
           pw.println( " 29000 ");
             break;
}
pw.flush();
 pw.close();
}
catch(Exception e){}
}
public void confirmation()
{
   try
{
 FileReader fr= new FileReader("abcd.txt");
       BufferedReader br= new BufferedReader(fr);
           String name1= br.readLine();
           String password1=br.readLine();
           String email=br.readLine();
            String address1= br.readLine();
            String age1=br.readLine();
            String  phone1=br.readLine();
     System.out.println(" name:"+name1 );
    System.out.println(" email id: "+ email  );
     System.out.println(" address :"+address1  );
     System.out.println(" age:"+age1);
     System.out.println(" phone no:"+phone1);
       br.close();
}
catch(Exception e){}

  try
{
  FileReader fr1= new FileReader("abcde.txt");
       BufferedReader br1= new BufferedReader(fr1);
           String form1= br1.readLine();
           String to1=br1.readLine();
           String date1= br1.readLine();
           String air1=br1.readLine();
           String board1= br1.readLine();
           String depart1=br1.readLine();
           String price1= br1.readLine();
       System.out.println(" starting from:"+form1 );
    System.out.println("  to distination :"+ to1  );
     System.out.println(" date of travelling:"+date1  );
     System.out.println(" airlines:"+ air1);
     System.out.println(board1);
      System.out.println(depart1);
     System.out.println("price of ticket"+price1);
    br1.close();
}
catch(Exception e){}

   System.out.println("check ur details \n if all details  correct enter : 1.yes \n if any details are wrong enter : 2.no ");
  System.out.println("enter ur choice");
    int  c4=s.nextInt();
    switch(c4)
     {
      case 1:   System.out.println("enter  payment details");
                 System.out.println(" 1.debit cards \n 2.credit cards \n 3.upi");
                  System.out.println("enter ur payments option");
                  int c5=s.nextInt();
                   switch(c5)
                    {
                      case 1: System.out.println("enter ur debit cards details");
                              System.out. println("enter ur cards details");
                                String s2=s.next();
                               System.out.println(" Enter last four digits of cards");
                                String s3=s.next();
                              System.out.println("enter cards expire date");
                                 String s4= s.next();
                                System.out.println("  processing...!");
                                
                                    try
                                      {
                                   Thread.sleep(5000);
                                       }
                                       catch(Exception e){}
                                   
                                  System.out.println("payment sucessfull..!");
                                   System.out.println("ticket booked");
                                    break;
                        case 2: System.out.println("enter ur credit cards details");
                              System.out. println("enter ur cards details");
                                String s5=s.next();
                               System.out.println(" Enter last four digits of cards");
                                String s6=s.next();
                              System.out.println("enter cards expire date");
                                 String s7= s.next();
                                System.out.println("  processing...!");
                                
                                    try
                                      {
                                   Thread.sleep(5000);
                                       }
                                       catch(Exception e){}
                                    }
                                    
                                  System.out.println("payment sucessfull..!");
                                   System.out.println("ticket booked");
                                    break;
                             case 3: System.out.print("enter upi details");
                                     System.out.print("enter ur mobline number");
                                     String s8=s.next();
                                     System.out.println("enter six digit pin code sent to mobile no"); 
                                      String s9=s.next();
                                       System.out.println("  processing...!");
                                
                                    try
                                      {
                                   Thread.sleep(5000);
                                       }
                                       catch(Exception e){}
                                    }
                                     
                                  System.out.println("payment sucessfull..!");
                                   System.out.println("ticket booked");
                                       break;
                          }  
                         break;
        case 2: System.out.println("edit onceagain");
                 System.exit(0);
                  break;
  }   

     }
 public void previous()
{
 System.out.println(" perviously booked flight ticket details");
   try
{
   FileReader fr= new FileReader("abcd.txt");
       BufferedReader br= new BufferedReader(fr);
           String name1= br.readLine();
           String password1=br.readLine();
           String email=br.readLine();
            String address1= br.readLine();
            String age1=br.readLine();
            String  phone1=br.readLine();
     System.out.println(" name:"+name1 );
    System.out.println(" email id: "+ email  );
     System.out.println(" address :"+address1  );
     System.out.println(" age:"+age1);
     System.out.println(" phone no:"+phone1);
       br.close();
  
  FileReader fr1= new FileReader("abcde.txt");
       BufferedReader br1= new BufferedReader(fr1);
           String form1= br1.readLine();
           String to1=br1.readLine();
           String date1= br1.readLine();
           String air1=br1.readLine();
           String board1= br1.readLine();
           String depart1=br1.readLine();
           String price1= br1.readLine();
       System.out.println(" starting from:"+form1 );
    System.out.println("  to distination :"+ to1  );
     System.out.println(" date of travelling:"+date1  );
     System.out.println(" airlines:"+ air1);
     System.out.println(board1);
      System.out.println(depart1);
     System.out.println("price of ticket"+price1);
    br.close();
}
 catch(Exception e){}
}
 public void cancel()
{
  try
{
    FileWriter fw=new FileWriter("abcde.txt");
      PrintWriter pw= new PrintWriter(fw);
         pw.println("");
         pw.close();
     System.out.println("ticket cancelled sucessfully...!");
}
catch(Exception e){}
}
public void postpone()
{
 try
{
    FileWriter fw=new FileWriter("abcde.txt",true);
      PrintWriter pw= new PrintWriter(fw);
       System.out.println("enter new date of travelling");
        String date2= s.next();
       pw.println(date2);
     pw.flush();
      pw.close();
 
  System.out.println("ticket sucessfully postponed");
  FileReader fr1= new FileReader("abcde.txt");
       BufferedReader br1= new BufferedReader(fr1);
           String form1= br1.readLine();
           String to1=br1.readLine();
           String date1= br1.readLine();
           String air1=br1.readLine();
           String board1= br1.readLine();
           String depart1=br1.readLine();
           String price1= br1.readLine();
            String date3=br1.readLine();
       System.out.println(" starting from:"+form1 );
    System.out.println("  to distination :"+ to1  );
     System.out.println(" new date of travelling:"+date3 );
     System.out.println(" airlines:"+ air1);
     System.out.println(board1);
      System.out.println(depart1);
     System.out.println("price of ticket"+price1);
    br1.close();
 }
 catch(Exception e){}
}

}


