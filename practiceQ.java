// //product of 3 int input
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         long Pro = (long)a*b*c;    //Type Casting
//         System.out.println(Pro);
// }
// }



//  area of squre-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int area = a*a;
//         System.out.println("Area of square is:"+area);         //for call any operend we use + operator
    
//     }

//         }


// Invoice-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         int $=24;
//         System.out.println($);                            // $ is also a name of variable it allow to use in java
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter pen price: ");
//         float pen = sc.nextFloat();                         //dono side float hi hona chahiye
//         System.out.print("Enter pencil price: ");           // only use ""
//         float pencil = sc.nextFloat();
//         System.out.print("Enter eraser price: ");
//         float eraser = sc.nextFloat();
//         float subTotal= pen+pencil+eraser;
//         float total=subTotal+(subTotal*18/100);
//         System.out.printf("Total price of items is: "+ subTotal + "With included GST :"+total);
//         sc.close();                                          // Scanner ko close karne ke liye 
//     }
// }


// // print larger then 3-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String args[]){
//         Scanner sc= new Scanner (System.in);
//         System.out.print("Enter a number: ");
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//          int c =sc.nextInt();
//          if(a>b) {
//             if(a>c){
//             System.out.print("gretest number is:"+a);
//             }
//             else {
//                  System.out.print("gretest number is:"+c);
//             }
//          }
//          else if(b>c) {
//             System.out.print("gretest number is:"+b);
//          }
//     }
// }


//Calculator-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter operator (+,-,*,/): ");
//         char op = sc.next().charAt(0);         
//     switch(op) {
//         case '+':  
//         System.out.print("Addition of two numbers is: "+(a+b));
//         break;
//         case '-':
//             System.out.print("Subtraction of two numbers is: "+(a-b));
//             break;
//             case '*':
//                 System.out.print("Multiplication of two numbers is: "+(a*b));
//                 break;
//                 case '/':
//                     System.out.print("Division of two numbers is: "+(a/b));
//                     break;
//                 case '%': 
//                 System.out.print("Modulus of two numbers is: "+(a%b));
//                 \
//                 break;
//                 defalt :
//                 System.out.print("Invalid operator");
//                 }
//                 }
//     }



    //weak number-
    // import java.util.Scanner;
    // public class javaBasic {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter a weak number: ");
    //         int n = sc.nextInt();
    //         switch(n) {
    //             case 1:
    //                 System.out.print("Sunday");
    //                 break;
    //             case 2:
    //                  System.out.print("Monday");
    //                 break;
    //             case 3: 
    //                 System.out.print("Teusday");
    //             case 4: 
    //                 System.out.print("Wednesday");
    //             case 5:
    //                 System.out.print("Thursday");
    //                             break;
    //             case 6:
    //                 System.out.print("Friday");
    //                 break;
    //             case 7:
    //                 System.out.print("Saturday");
    //                  break;
                
                            
    //         }
    //     }
    // }

//reverse the  given number-
// import java.util.Scanner;

// public class javaBasic1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int gvn=sc.nextInt();
//         int rev=0;
//         while(gvn>0) {
//             int lDigit=gvn%10;
//             gvn=gvn/10;
//             rev=rev*10+lDigit;              //
//         }
//             System.out.println(rev);  
//     }
// }



// break statement problem-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        do {
//         System.out.print("Enter the number: ");
//         int n=sc.nextInt();
//         if(n%10==0) {          // 
//             break;               // break statement
//         }
//        System.out.println(n);

//        }
//        while(true);   //infinite loop
//     }
// }

// continue statement-
// import java.util.Scanner;
//  public class javaBasic1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         while(true){
//             System.out.print("Enter the number: ");
//             int n = sc.nextInt();
//             if(n%10==0) {
//                 continue; //continue statement
//             }
//             System.out.println(n);
//         }
//     }
//  }


// get prime number -
// import java.util.Scanner;
// public class javaBasic2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=2;i<n;i++) {
//             if(n%i==0) {
//                 System.out.println(n+" is not a prime number");
//                 break;
//             }
//             else {
//                 System.out.println(n+" is a prime number");
//             }
//         }
//     }
// }



//      sum of  even no. and odd no.
// public class javaBasic3 {
//     public static void main(String args[]) {
//         int arr [] = {1, 2, 3, 4, 5, 6,43,43,32,58,5,53,56,78,53,31,75,65};
//         int sum=0;
//         int sum1=0;
//         for(int i=0;i<arr.length;i++) {
//             if(arr[i]%2==0) {
//                 System.out.println("even number: "+arr[i]);
//                 sum +=arr[i];
//             }
//             else   {
//                  System.out.println("odd number:"+arr[i]);
//                 sum1 +=arr[i];
//             }
            
//         }
//         System.out.println(sum);
//         System.out.println(sum1);
//         }
// }


//c java practiceQ.javafactoreal-
// import java.util.Scanner;
// public class javaBasic4 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int fac = sc.nextInt();
//         for(int i=fac-1; i>0; i--) {
//         fac=fac*i;
//         }
//         System.out.println("factorial of a number is :"+fac);
//     }
// }


// multiplecation table of given number-
// import java.util.Scanner;
// public class javaBasic5 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=10;i++) {
//             int mul = num*i;
//             System.out.println(mul);
//     }
//     }
// }


//pattern problems-
// import java.util.Scanner;
// public class basicJava {
//     public static void main(String args[]) {
//         int n=4;
//         for(int i=1;i<=n; i++) {
//             for(int j=1;j<=i;j++) {            /*badhte kram me agar pattern chahiye to j ki condition (j<=i)ko i se check karna hai
//                                                     *
//                                                     **
//                                                     ***
//                                                     ****     */
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// }
// }



// public class basicJava {
//     public static void main(String args[]) {
//         int n=4;
//         for(int i=1;i<=n; i++) {
//             for(int j=i;j<=n;j++) {            /*ghatte kram me agar pattern chahiye to j ki condition (j<=n)ko n se check karna hai aur j me i ki value 
//                                                     ko store krte hai                        
//                                                    ****
//                                                    ***
//                                                    **
//                                                    *    */
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// }
// }




// public class basicJava {
//     public static void main(String args[]) {
//         int n=4;
//             int temp=1;
//         for(int i=1;i<=n; i++) {
//             for(int j=i;j<=n;j++) {            /*ghatte kram me agar pattern chahiye to j ki condition (j<=n)ko n se check karna hai aur j me i ki value 
//                                                   ko store krte hai                        
//                                                    ****
//                                                    ***
//                                                    **
//                                                    *    */
//             System.out.print(temp );
//             }
//          temp++; 
//             System.out.println();
//         }
// }
// }





//charecter-
// public class basicJava {
//     public static void main(String args[]) {
//         int n=4;
//         char ch='A'; 

//         for(int i=1;i<=n; i++) {

//             for(int j=i;j<=n;j++) { 
                
//                                                     /* A
//                                                       B C
//                                                       D E F
//                                                       G H I J*/
//             System.out.print(" "+ch);
//             ch +=1;
//             }

//             System.out.println();
//         //   System.out.print("  ");

           
//         }
// }
// }




//Function-
// import java.util.Scanner;
//  public class basicJava {
//     public static int sum(int num1,int num2) {    //Parameters  "which is copy of a and b"
//        int  sum = num1+num2;
//         return sum;
//     }
//    public static void main(String args[]) {
//     Scanner sc=new Scanner (System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sumone = sum(a,b);        //argument
//     System.out.println(sumone);
//    }
//  }
 
 

 //FUNCTIONS QUESTION :-
//1=> greater number
//  import java.util.Scanner;
//  public class javaBasic {    
//     public static int isGreater(int a,int b,int c) {
//         if(a>b && a>c ) {
//          return a;   
//         }
//         else if(b>a && b>c) {
//             return b;
//         }
//         else {
//             return c;
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int max = isGreater(a,b,c);
//         System.out.print(max);
        
    
//  }
//  }



//  //2=> isEven or Odd
//  import java.util.Scanner;
//  public class basicJava {
//     public static boolean isEven(int num) {     // return type boolean hai to `isEven` bhi boolean me likhenge
//         if(num%2==0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         int num =sc.nextInt();
//         boolean result = isEven(num);        //return boolean value kar raha hai to result bhi boolean hi hoga
//         System.out.print(result);


//     }
//  }





//  Arrays-
// problem no. 1-
// import java.util.*;
// public class basicJava {
//     public static boolean check(int[] arr)
// {
//     for(int i=0; i<arr.length; i++) {
//         for(int j=i+1;j<arr.length; j++) {
//             if(arr[i]==arr[j]) {
//                 return false;
//             }

            
//     }
// }
//     return true;
// }
// public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 5};
//         System.out.println(check(arr));
//     }

// }




// // problem no. 5-
// //(threesum problem)
// import java.util.*;
// public class basicJava {
//    public static void treesum(int[] arr) {
//       or(int i=0; i<arr.length; i++) {
//          for(int j=i+1; j<arr.length; j++) {
//             for(int k=j+1; k<arr.length; k++) {
//                if(arr[i]+arr[j]+arr[k] == 0) {
//                   System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
//                }
//             }
//          }
//       }
//    }
//    public static void main(String args[]) {
//       int [] arr =  {-1, 0,  1, 2, -1, -4};
//       treesum(arr);
//    }
// }



// // 2D array problem-
// // number of occurrences of specific element in a 2D array-
// import java.util.*;
// public class basicJava {
//     public static void occurrences(int[][] dArr, int target) {
//         int count = 0;
//         for(int i=0; i<dArr.length; i++) {
//             for(int j=0; j<dArr[0].length; j++) {
//                 if(dArr[i][j]==target) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("Number of occurrences of "+target+" is "+count);
//     }
//     public static void main(String[] args) {
//         int[][] arr = { {4,7,8},{8,8,7} };
//         int target = 8;
//         occurrences(arr, target);
//     }
// }
 

//  //  Question 2 :Print out the sum of the numbers inthe second row of the “nums” array
// import java.util.*;
// public  class basicJava {
//     public static void sumOfSecondRow(int[][] dArr) {
//         int sum = 0;
//         int row = 1;
//         for(int i=0; i<=dArr.length-1; i++) {
//             sum += dArr[row][i];
//         }
//         System.out.println("Sum of the second row is "+sum);
//         }
// public static void main(String[] args) {
//     int[][] dArr = { {1, 2, 3}, {4, 5, 6},{7,8,9}};
//     sumOfSecondRow(dArr);


// }
// }



// // Question 3 :Write a program to FindTransposeofa Matrix
// import java.util.*;
// public class basicJava {
//     public static void swaping(int[][] dArr) {
//         int row = dArr.length;
//         int col = dArr[0].length;
//         for(int i=0; i<col; i++) {
//             for(int j=0; j<row; j++) {

//                 System.out.print(dArr[j][i] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int[][] dArr = { {1, 2, 3}, {4, 5, 6}};
//         System.out.println("Original Matrix:");
//         for(int i=0; i<dArr.length; i++) {
//             for(int j=0; j<dArr[0].length; j++) {
//                 System.out.print(dArr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         swaping(dArr);

//     }
// }



// // String:-
// // Question1:CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser
// import java.util.*;
// public class javaBasic {
//     public static void countVowels(String str) {
//         int count=0;
//       for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//                 count++;
//             }
//       }
//       System.out.println("Number of Vowels: "+count);
//     }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     String str = sc.nextLine();
//     countVowels(str);

// }
// }
// // HimaNshU


// Question 4 :Determine if 2 Strings  are Anagrams of each other or not
// import java.util.*;
// public class javaBasic {
//     public static boolean isAnagrams(String str1, String str2) {
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         boolean result= true;
//         int h=0;
//         int i=0;
//         while(i<str2.length()) {
//             if(str1.charAt(h) != str2.charAt(i)) {
//              i++;   
//             }
//             else {
//                 h++;
//                 i=0;
//             }
//         }
//         if(h==str1.length()) {
//             result=true;
//         }
//         else {
//         result = false;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         String str1 = "listen";
//         String str2 = "silent";
//         if(isAnagrams(str1, str2)) {
//             System.out.println("Both Strings are Anagrams");
//         }
//         else {
//             System.out.println("Both Strings are not Anagrams");
//         }

//     }
// }



// // Recursion-
// // practice question no: 1-  occurrences of a number in an array
// public class practiceQ {

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 5, 2};
//         int target = 2;
//         occurrencesIndex(arr, target, 0);
//     }
//     public static void occurrencesIndex(int[] arr, int target, int index) {
//         if (index == arr.length) {                            
//             System.out.println("No more occurrences of " + target + " found.");
//             return;
//         }
//         if (arr[index] == target) {
//             System.out.println("Index of " + target + " is: " + index);
//         }
//         occurrencesIndex(arr, target, index + 1);
//     }
// }
    
    
    
    // call stack:-
       
    //    return;
    //  occurrencesIndex(arr, target, 6);  
    //    print - value of target and index
    //  occurrencesIndex(arr, target, 5);   
    // occurrencesIndex(arr, target, 4);
    //     print - value of target and index
    // occurrencesIndex(arr, target, 3);
    //  occurrencesIndex(arr, target, 2);
    //     print - value of target and index
    //  occurrencesIndex(arr, target, 1);
    //  occurrencesIndex(arr, target, 0)
// practice Q no. 2 - print digit of a number  
public class practiceQ {
    public static void main(String[] args) {
         String arr[] = {"gero","one" ,"Two", "Three", "Four", "Five", "Six", "Seven", "Eight" ,"Nine"};

        int number = 1234; // Example number   digit 0 se start nahi ho sakti kyuki wo fir octal me include kari jati HAI 
        if(number == 0) {
            System.out.println("Zero");
            return;
        }
        printDigits(number, arr);
    }
    public static void printDigits(int number, String[] arr) {
        if(number == 0 ) {
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10, arr);
        System.out.print(arr[lastDigit] + " ");
        
        }
}

// call stack:
// printDigits(1234, arr);
// printDigits(123, arr);
// printDigits(12, arr);
// printDigits(1, arr);
// printDigits(0, arr);
// return;
// System.out.print(arr[1] + " "); // "One"
// System.out.print(arr[2] + " "); // "Two"
// System.out.print(arr[3] + " "); // "Three"
//                              printDigits(1234)
//                                   |
//                              printDigits(123)
//                                   |
//                              printDigits(12)
//                                   |
//                              printDigits(1)
//                                   |
//                              printDigits(0)  ← Base case reached → return
//                                   |
//                             ↑ prints "One"
//                             ↑ prints "Two"
//                             ↑ prints "Three"
//                             ↑ prints "Four"

