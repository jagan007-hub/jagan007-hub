import java.io.*;
        //extends is a keyword to inherite a another class
 class born
 {
 born()//its a constructer its starts when object is declared
 {
 System.out.println("start new life ");
 }
 }
 class school extends born   //this statement inherits a born class
 {
 school()//its a constructer its starts when object is declared
 {
 System.out.println("in my school life");
 }
 }
 class college extends school  //this statment inhrits a school and school inherits a born class 
 {
   college()//its a constructer its starts when object is declared
   {
   System.out.println("at my first year");
   System.out.println("at my second year");
   System.out.println("at my third year");

   }
 
 }
 class  love extends college 
 /*this statment inhrits a college & college inherits a school and school inherits a born class */
 {
 love()//its a constructer its starts when object is declared
 {
 System.out.println("");
 }
 }
 class commitements extends love/*this statment inhrits love & love inherits a college & college inherits a school and school inherits a born class */
 {
 commitements()//its a constructer its starts when object is declared
 {
 System.out.println("more cmmitements");
 }
 }
 class  work extends commitements/*this statment inhrits a commitments &commitements inherits a college & college inherits a school and school inherits a born class */
 {
 work()//its a constructer its starts when object is declared
 {
 System.out.println("heavy work");
 }
 }
 class  marriage extends work
 {
 public static void main(String arg[])
 {
 marriage cg=new marriage();//this statement creates a object and new is a keyword
 System.out.println("start the main function");
 
}
} 
