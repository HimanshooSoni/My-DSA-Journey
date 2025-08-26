// Syntex of java Boilerplate code-
// public class basicJava { 
// public static void main(String args[]) {     /*1. Modifiers
              // public: Ye access modifier hai. Iska matlab hai ki main method ko kisi bhi class se access kiya ja sakta hai.
              //  Ye zaroori hai, kyunki JVM ko main method ko access karna hota hai.

               // static: Ye keyword batata hai ki main method ko bina kisi object ke call kiya ja sakta hai. 
               // Iska matlab hai ki aap MyClass.main(args) ke through is method ko call kar sakte hain bina MyClass ka instance banaye.

               // 2. Return Type
               // void: Ye return type batata hai ki main method koi value return nahi karta.
               //  Iska matlab hai ki ye sirf program ko execute karta hai, lekin koi value wapas nahi karta.
               // 3. Method Name
               // main: Ye method ka naam hai. Java mein main method ka naam fixed hai, aur ye aapko is naam ko change nahi karna chahiye, kyunki JVM is method ko hi dhundta hai.
                  // 4. Parameters

               // String[] args: Ye parameter command-line arguments ko represent karta hai. 
               // Ye ek array hai jo strings ko store karta hai. Jab aap Java program ko command line se run karte hain, to aap kuch arguments de sakte hain, jo args array mein store hote hai
               // }
// }; 



//hello world -
// public class javaBasic {
//     public static void main (String args[]) {
//         System.out.print("Hello world");
//     }
// }

//pattern -
//  public class javaBasic {
//     public static void main (String args[]) {
//         System.out.println("* * * *");
//         System.out.println("* * * ");
//         System.out.println("* *");
//         System.out.println("*");
//     }
// }


//input-
// import java.util.Scanner;
// public  class javaBasic {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();           /*next() -reads the next token(matlab sirf space ke pahle wali value bus) from the input and returns it as a string only first sentence
//                                                    nextLine() -reads the entire line from the input and returns it as a string
//                                                    nextInt() -reads the next token from the input and returns it as an integer
//                                                    nextDouble() -reads the next token from the input and returns it as a double
//                                                    nextByte() -reads the next token from the input and returns it as a byte
//                                                    nextShort() -reads the next token from the input and returns it as a short
//                                                    nextLong() -reads the next token from the input and returns it as a long
//                                                    nextFloat() -reads the next token from the input and returns it as a float
//                                                    nextBoolean() -reads the next token from the input and returns it as a boolean

//                                                    */
//         System.out.println(input);
                                                     
//     }
// }


// product of two numbers -
// import java.util.Scanner;
// public class javaBasic {
//     public static void main (String args[]) {
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a*b;
//         System.out.println(product);
//     }
// }



//Function
// public class javaBasic {
//     public static void proDuct(int a, int b) {
//         int product = a*b;
//         System.out.print(product);
//     }
//     public static void main (String args[]) {
//     proDuct(5,6);
    
       
//     }
       
//}


//factorial-

// import java.util.Scanner;
//  public class javaBasic {
//     public static void/*int*/ fact(int n){          /*hum yaha per i=n-1 liya hai kyuki pahle hum n-1 ko n se multiply karwayenge
//                                               aur phir n-1 ko n-2 se multiply karwayenge         
//                                               .condition me i>0 matlab n ka last me 1 se multiply ho sake  */                                               
        
//         for(int i=n-1;i>0;i--) {
//          n=n*i;
//         }
//         System.out.println(n);
//         //  return n;
//     }
 
//  public static void main (String args[]) {
//     Scanner sc = new Scanner(System.in);
    
//     int n = sc.nextInt();
//     fact(n);                         /*void function ko call karna hai to hum function name likhna hai bus usko 
//                                      usko print karane ka kaam function ke andar hi hojata hai 
//                                      .-aur agar int function hai to wo value return karke dega jo fact() me store hogi 
//                                      us value ko print karane ke liye main fuction me S.o.p(fact) likhna padega*/                   
   
//     // System.out.println(fact);
//  }
//  }



 //binomial-
//  import java.util.Scanner;
//  public class javaBasic {
//     public static int fact(int n){        
//         for(int i=n-1;i>0;i--) {
//          n=n*i;
//         }
       
//          return n;
//     }
//     public static void binomial(int n,int r){
       
//         int N= fact(n);
//         int R=fact(r);
//         int ncr=fact(n-r);
//         int ans=(N/(R*ncr));
//         System.out.println(ans);
//     }
//     public static void main(String args[]) {
//         binomial(5,2);

//     }
//  }
 


 
 //Overloading-
 
//  public class javaBasic {
//     public static int sum(int A,int B) {
//        int sum=A+B;
//         return sum;
//     }
//     public static int sum(int A,int B,int C) {
//         int summ=A+B+C;
//         return summ;
//     }
//     public static void sum(float A,float B) {
//         System.out.println("sum of two void is "+(A+B));
//     }
//     public static void main(String args[]) {
//         System.out.println(sum(10,20));
//         System.out.println(sum(10,20,30));
//         sum(10.6f,20.78f);          //agar hum f na lagayenge to compiler usko double ki tarah hi consider karega
  
//     }
//  }


//prime number by function+
// public class javaBasic {
//     public static boolean isPrime(int n) {      ryturn type boolean hai to function type bhi boolean hi hoga 
//            boolean isprimee= true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//          isprimee=false;
//             return isprimee;                 //return likhna jaruri hai
//         }
//         }
//         return isprimee;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(9));
//     }
// }



//Optimize code(second mathod)-   
// import java.util.Scanner;

// public class primeNumberChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         if (isPrime(number)) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }

//         scanner.close();
//     }

//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false; // 0 and 1 are not prime numbers
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {            //math.sqrt hume root of num print kara ke 
//                                                                 // jisse code optimije hoga (2*4=4*2) isse bachayega time waste karne me 
//             if (num % i == 0) {
//                 return false; // Found a divisor, not prime
//             }
//         }
//         return true; // No divisors found, is prime
//     }
//}
 
 //series of prime number
//  import java.util.Scanner;
//  public class PrimeSeries {
//     public static void getPrimeSeries(int n) {         //jis function me multiple values print karani hai to 
//                                                     //void function ko call karna hai   
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//             }

//         }
        
       
//     }  

//     public static boolean isPrime(int n) {
//            boolean isprimee= true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//          isprimee=false;
//          return isprimee ;              //return likhna jaruri hai
//         }
//         }
//         return isprimee;
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         int n= sc.nextInt();
//         getPrimeSeries(n);

        
//  }
//  }


// binary to decimal-
// import java.util.Scanner;
// public class binaryToDecimal {
//     public static void conversion(int num) {
//         int decimal=0;                        // for geting a int value from variable to number-swap wala logic hi lagega
//         int i=0;
//         while(num>0){
//             int lDig=num%10;
//             decimal = decimal + (lDig)*(int)Math.pow(2,i);     //Math.pow(a,b) function hai jo batata hai ki a ki power b hai 
//                                                                 //per ye double value return karta hai isko int me change karne ke liye (int) likhna hai
//             num=num/10;
//             i++;


//         }
//         System.out.print(decimal);
//         }
    
    
//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         int num= sc.nextInt();
//         conversion(num);
//     }
// }


//decimal to binary



// Pattern :-

// /*holo ractangle pattern
// *****   --row
// *   *
// *   *     
// *****
// collom^
// */
// public class basicJava {
//     public static void pattern(int totRow, int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             for(int j=1; j<=totColm; j++) {
//                 if(i ==1 || i== totRow || j==1 || j== totColm) {       //(i,j) ,where stand for row and j stand for column
//                     System.out.print("*");
//         }
//         else {
//             System.out.print(" ");
//         }
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String[] args) {
//         pattern(4, 5);
//     }
// }


//inverted half pyramid:-
/*
   *   stage of row == number of stars
  **    number of collom-stage of row ==  number of spaces
 ***       
****
*/
// public class basicJava {
//     public static void pattern(int totRow , int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             for(int j=1; j<=totColm-i; j++) {
//                System.out.print(" ");   //for print spaces
//             }
//             for(int j=1; j<=i; j++) {    //for print *
//                 System.out.print("*");
//         }
//         System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         pattern(4 , 4);

//     }
// }


//// integer number print in the place of stats
// public class basicJava {
//     public static void pattern(int totRow , int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             int temp=1;
//             for(int j=1; j<=totColm-i; j++) {
//                System.out.print(" ");   //for print spaces
//             }
//             for(int j=1; j<=i; j++) {    //for print *
//                 System.out.print(temp);
//                 temp++;
//         }
//         System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         pattern(4 , 4);

//     }
// }



// //binary tryangle:-
// /*
// 1
// 01
// 101
// 0101     logic- row +collom=even, print 1;
// 10101           row +collom=odd , print 0;
// */
// public class basicJava {
//     public static void pattern(int totRow , int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             for(int j=1; j<=i; j++) {
//             if((i+j)%2==0) {
//                 System.out.print("1");
//                 }
//                 else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();

//         }
//     }

//     public static void main(String args[]) {
//         pattern(5 , 5);
//     }
// }




//IMP-Butterfly Pattern-
/*
*      *
**    **            space=2*(n-row)
***  ***
********
********
***  ***
**    **
*      *
*/
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++) {                //for print first four rows
//                 System.out.print("*");
//             }
//             for(int j=1; j<=2*(n-i); j++){        
//                 System.out.print(" ");             //for print spaces bitween stars
//             }
//             for(int j=1; j<=i; j++) {          
//                 System.out.print("*");
//             }
//             System.out.println();
//             }
//          for(int i=1; i<=n; i++){          //for print remaining four rows
//             for(int j=i; j<=n; j++) {
//                 System.out.print("*");   
//             }
//             for(int j=3; j<=2*i; j++) {            //for print spaces bitween stars
//                 System.out.print(" ");
//             }
//             for(int j=i; j<=n; j++) {
//                 System.out.print("*");   
//             }
//           System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         pattern(4);
//     }

// }
  




// //Solid rhombus pattern:-
// /*
//     *|****
//    **|***
//   ***|**   //logic- devide then create code for first half then second half recursively
//  ****|*
// *****
// */
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n;i++) {
//             for(int j=1;j<=(n-i);j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++) {         //j ki initial value aur condition me jitna likha hai(n) uske bich ka difference jitna hoga utne star print honge.
//                 System.out.print("*");
//             }
//             for(int j=i+1;j<=n;j++) {     
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         pattern(5);
//     }
// }



// //hollow rectangle:-
// /*
//     ****
//    *  *
//   *  *
//  **** 
// */
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n;i++) {
//             for(int j=i;j<=n;j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++) {
//                 if( i==1 || i==n || j==1 || j==n) {     /*yaha per i matlab first and last row ki baat ho rahi hai aur j matlab first
//                                                     and last column ki baat ho rahi hai per humne pahle hi spaces ko print karwa liya hai to j inclined print hoga */
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");      //it is complesory
//                 }

//         }
//         System.out.println();
//     }
//     }
//     public static void main(String args[]) {
//         pattern(4);
//     }
// }




// // dimond problem:-
// /*
//    *
//   **|*
//  ***|**
// ****|***     //we devide it into 4 parts and print seperatly (ye humne apni understaning ke liye bus devide kiya hai)
// ----------
// ****|***
//  ***|**
//   **|*
//    *
// */
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=i; j<=n; j++){   //for print spaces
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++) {
//             System.out.print("*");
//         }
//         for(int j=1;j<=i-1;j++) {
//             System.out.print("*");    //for print second half
//         }
//         System.out.println();
//     }
//     for(int i=n; i>=1; i--) {       //logic-agar kisi pattern ki mirror image banana hai to hum outer loop ko bus ulta karke likhte hai aur inner loop ko same rakh dete hai
//            for(int j=i; j<=n; j++){   //for print spaces
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++) {
//             System.out.print("*");
//         }
//         for(int j=1;j<=i-1;j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     } 
//     }
//     public static void main(String args[]) {
//         pattern(5);
//     }
// }


// //Array:-
// //1. Array is a collection of elements of the same data type stored in contiguous memory locations
// //wrong code findout mistake-
// import java.util.*; 
// public class ArrayCreate {
//     public static void main(String args[]) {
//         int[] arr = new arr[5]; //create an array of 5 elements
        
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter values");
//         arr[0] = sc.nextInt();
//         arr[1] -= sc.nextInt();
//         arr[2] = sc.nextInt();
//         arr[3] = sc.nextInt();
//            System.out.println("Physics : "+arr[0]);
//             System.out.println("Chemistry : "+arr[1]);
//             System.out.println("Bio : "+arr[2]);
//             System.out.println("English : "+arr[3]);
//     }
// }
 


// //correct code:-
// import java.util.*; 

// public class ArrayCreate {
//     public static void main(String args[]) {
//         int[] arr = new int[50]; // Corrected array declaration
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter values for Physics, Chemistry, Bio, and English: ");
        
//         // Input values
//         for (int i = 0; i < 4; i++) {
//             arr[i] = sc.nextInt();

//         }
        
//         // Output values
//         System.out.println("Physics : " + arr[0]);
//         System.out.println("Chemistry : " + arr[1]);
//         System.out.println("Bio : " + arr[2]);
//         System.out.println("English : " + arr[3]);
        
//         sc.close(); // Close the scanner
//     }
// }





// //Array argument passing:-
// import java.util.*;
// public class  first {     //jab jab compile karke run karenge tab tab file name and class name same hona chahiye
//    public static void Update(int arr[]) {    //int sirf argument passing bus me lagega
//      for(int i=0; i<arr.length; i++){          // <= nahi use karna 
//      arr[i]=arr[i]+1;
//      //System.out.println("Array after passing :"+ arr[i]);
//      }
//    }
//    public static void main(String args[]) {
//       int arrr[] = {11,21,31,41};
//       Update(arrr);
        
//       for(int i=0; i<arrr.length; i++){
//          System.out.println("Array after passing :"+ arrr[i]);
//    }
// }
// }

 //linear search-
//  import java.util.*;
//  public class basicJava {
// public static int search(int arr[], int key) {   //dubara bhi datatype lagana hoga(int) kyuki ye  arr[] aur key ak naye hi variables hai!
//    for(int i=0; i<arr.length; i++ ) {
//       if(arr[i] ==key) {
//          return i;
//       }

//    }
//        return -1;        //is return ko statement ko function ke closing bracket ke just pahle likhna hai
// }
      
//    public static void main(String args[]) {
//       int arr[] = {2,6,4,8,45,74,7,9};
//       int key= 7;
//       int index = search(arr,key);   //sirf array ka name bus likhna padta hai argument me 
//       if (index==-1) {
//          System.out.println("Invalid String");
//       }
//       else {
   //     System.out.println("THE ELEMENT IS FOUND AT INDEX "+index);
   //    }  
   //    }

   // }

//by the help of input method  
   // import java.util.*;
   // public class basicJava {
   //    public static int rch(int arr[], int key) {
   //       for(int i=0; i<arr.length; i++) {
   //          if(key==arr[i]) {
   //            /=9999
// System.out.println("index number of key is"+ i);
   //             return 0;
   //          }
   //       }
   //       return -1;
   //    }
   
   //    public static void main(String args[]) {
   //       int[] arr= {2,64,9,3,7,5,6,354,53};
   //       Scanner sc = new Scanner(System.in);
   //       System.out.println("Enter the key");
   //       int key = sc.nextInt();


   //    int index = rch(arr,key);
   //    if(index ==-1) {
   //       System.out.println("key is not found");
   //    }
   // }
   // }
 

//  //largest number in array
//  import java.util.*;
//  public class basicJava {
//    public static int largest(int arr[],int max) {      
//       for(int i=0; i<arr.length; i++) {
//          if(max < arr[i]) {
//             max = arr[i];

//       }

//    }
//       return max;   
//    }
//   public static void main(String args[]) {
//       int[] arr= {8448392,5,33,75,46,1};
//       int max = arr[0];
//       //or
//       // int max = Integer.MIN_VALUE;   //Integer.MIN_VALUE is the smallest possible integer value in Java(-infinity);
//                                         // Integer.MAX_VALUE is the largest possible integer value in Java(infinity);
//       int index = largest(arr,max);
//       System.out.println("largest number is "+ index);
      
//    }
   
//  }
 
// Binery Search-
// Incorrect code:
// :array.lenth is a total number of elements in array so last index will be - array.length-1;
// import java.util.*;
// public class basicJava {
//    public static int binerySearch(int arr[],int key) {
//       while(arr[0]<arr[arr.length-1]) {  // ye loop tab tak chalega jab tak key mid se match na kar jaye 
//          int start = 0;
//          int end = arr.length-1;
//       int[] mid = (start+end)/2;
//       if(mid[]==key[]){
//          return mid;
//       }
//       else if(mid[]>=arr[key]) {
//          end = mid-1;
//          }
//          else {
//             start = mid+1;
//          }
//       }
//       return  -1;      // ye statement tab likhte hai jab key array me nahi hai(invalid case ke liye )
//       }

//    public static void main(String args[]) {
//       int[] arr ={1,2,3,4,5,6,8,9,14,18,24,27,34,37};
//       int key = 18;
//       int index = binerySearch(arr,key);
//       if (index==-1) {
//          System.out.println("key is not found");
//       }
//       System.out.println("index of key is "+index);

//    }
// }


// // correct code-
// import java.util.*;
// public class basicJava {
//    public static int binerySearch(int arr[],int key) {
//          int start = 0;
//          int end = arr.length - 1;   //INKO BAHAR HI initialije karna hai!
//       while(start <= end)  {  // ye loop tab tak chalega jab tak key mid se match na kar jaye 
//       int mid = (start + end)/2;   //mid is like middile value ka index number 
//       if(arr[mid] == key) {
//          return mid;
//       }
//       else if(arr[mid] >= key) {
//          end = mid - 1;
//          }
//          else {
//             start = mid +1;
//          }
//       }

//       return  -1;      // ye statement tab likhte hai jab key array me nahi hai(invalid case ke liye )
//       }

//    public static void main(String args[]) {
//       int[] arr ={1,2,3,4,5,6,8,9,14,18,24,27,34,37};
//       int key = 18;
//       int index = binerySearch(arr,key);
//       if (index == -1) {
//          System.out.println("key is not found");
//       }
//       System.out.println("index of key is "+index);

//    }
// }
 





//  Uses of int return mathod & void mathod in java - return type mathod ka use tab karte hai jab kisi array ki help se nayi value return karna hai
//  void mathod ka use tab karte hai jab kisi array ko modify karke dubara usi ko print karna ho 

// import java.util.*;
// public class basicjava  {
//    public static  void reverse(int arr[]) {
//       int first = 0;
//       int last = arr.length - 1;
//       while (first < last) {
//          int temp = arr[first];
//          arr[first] = arr[last];
//          arr[last] = temp;
//          first++;
//          last--;
//       }
   
//    }

//    public static void main (String args[]) {
//       int[] arr = {2,4,6,8,10,12,14,16,18};
//       reverse(arr);                    //jo changes humne is array me function ke through ki hai wo updation automatic is array me ho jayega 

//       for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//       }      

//    }
// }

// // print pair of array elements-(using nested loop concept)
// import java.util.*;
// public class basicJava {
//    public static void pairs(int arr[]) {
//       int first = 0;
//       int last = arr.length;
//       for(int i=first; i<last; i++) {
//          for(int j=i+1; j<last; j++) {      // j depend i per karega
//             System.out.print("("+ arr[i]+", "+arr[j]+") ");
//          }
      
//    }
// }
//    public static void main(String args[]) {
//       int[] arr =  {2,4,6,8,10,12,14,16,18};
//       pairs(arr);
   


//    }
// }


// // print Subarray of any array-
// //Importent-
// import java.util.*;
// public class basicJava {
//    public static void subarray(int arr[]) {
//       for(int i= 0; i<arr.length; i++) {
//          for (int j=i; j<arr.length; j++) {
//             System.out.println();
//             int sum = 0;
//             for(int k=i; k<=j; k++) {
//                System.out.print(" "+ arr[k] + " ");
//                sum += arr[k];
//          }
//                System.out.println(" ,their sum :" +sum);
//       }
//    }
//    }
//    public static void main (String args[]) {
//       int[] arr = {2,4,6,8,10};
//       subarray(arr);

//    }
// }


//For maximum sum of subarray
// #Brute Force-(but their time complexity is O(n^3) which is bad)
// import java.util.*;
// public class basicJava {  
//    public static void subarray(int arr[]) {
//       int maxSum = Integer.MIN_VALUE;            // value is -infinity
      
//       for(int i= 0; i<arr.length; i++) {
//          for (int j=i; j<arr.length; j++) {
//             System.out.println();
//             int sum = 0;
//             for(int k=i; k<=j; k++) {
//                System.out.print(" "+ arr[k] + " ");
//                sum += arr[k];
//              }
//              if(maxSum<sum) {
//                maxSum = sum;

//              }

//                System.out.println(" ,their sum :" +sum);
//       }
//    }
//       System.out.println(maxSum );           
//    }
//    public static void main (String args[]) {
//       int[] arr = {2,4,6,8,10};
//       subarray(arr);

      

//    }
// }


// //For maximum sum of subarray 
// // by prefix sum-
// import java.util.*;
// public class javaBasic {
//    public static void subarray(int arr[]) {
//          int prearr[] = new int[arr.length];
//           int prefix = 0; 
//       for(int i=0; i<arr.length; i++) {
//          prefix= prefix + arr[i];
//          prearr[i]= prefix;
//       }
//       int maxSum = Integer.MIN_VALUE;
//       int sum = 0;
//      for(int i= 0; i<arr.length; i++) {    //start  element
//          for (int j=i; j<arr.length; j++) {   //end element
//            for(int k=i; k<=j; k++) {
//             System.out.print(" "+ arr[k] + " ");        
//            }
//             sum = i==0 ? prearr[j] : prearr[j]-prearr[i-1];    //impprtent (ye kisi bhi do element ke biche ke sare element ko joodi hai) 
//             System.out.println(" ,their sum is :"+sum);
//             if(maxSum <sum) {
//                maxSum = sum;
//             }
          

//       }
//    }
//       System.out.println("So, the overall maximum sum of subarray is :"+maxSum);

//    }
//    public static void main(String args[]) {
//       int[] arr= {2,-9,5,-2,-1};
//       subarray(arr);


//    }
// }






// // Trapping Rain Water problem-
// import java.util.*;
// public class javaBasic {
//    public static void trapWater(int arr[]) {
//       // creating a copy of array and storing the max element on left side
//       int[] leftbar = new int[arr.length];
//       leftbar[0] = arr[0];
//       for(int i=1; i<arr.length; i++) {
//          leftbar[i]= Math.max(arr[i], leftbar[i-1]);
//       }
//       // creating a copy of array and storing the max element on right side
//       int[] rightbar = new int[arr.length];
//       rightbar[arr.length-1] = arr[arr.length-1];
//       for(int j=arr.length-2; j>=0; j--) {
//          rightbar[j]= Math.max(rightbar[arr.length-1], arr[j]);
//       }
//       // now we have two array, leftbar and rightbar!
//       // now we will iterate over the array and find the minimum of leftbar and rightbar
//       // and subtract the element from it, and add it to the sum
//       int sum=0;
//       for(int i=0; i<arr.length; i++) {
//          int capacity= Math.min(leftbar[i], rightbar[i])-arr[i];    //if width is define in question then you have to multiply it with capacity
//          sum += capacity;
//       }
//       System.out.println("So, the overall water trapped is :"+sum);

     


//    }
//    public static void main(String args[]) {
//       int[] arr = {8,2,0,6,3,2,5};     //Higth of each bar
//       trapWater(arr);
//    }
// }


// // Stock exchanging problem-
// import java.util.*;
// public class basicJava {
//    public static int maxProfit(int[] prices) {
//       int buypric = Integer.MAX_VALUE;
//       int maxProfit = 0;
//       int profit =0;
//       for(int i=0; i<prices.length; i++) {
//          if(buypric < prices[i] ) {
//            profit = prices[i]-buypric;
//            maxProfit = Math.max(profit , maxProfit);
      
//          }
//          else {
//             buypric = prices[i];
//          }
         
//       }
//       return maxProfit;
//    }
//    public static void main(String args[]) {
//       int[] prices = {7,6,4,3,1}; // prices
//       int index =maxProfit(prices);
//       System.out.print("maximum profite is equel to :" +index); 
//    }
// }


// // problem two-(treesum problem)
// import java.util.*;
// public class basicJava {
//    public static void treesum(int[] arr) {
//       for(int i=0; i<arr.length; i++) {
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


 
// // BoubleShort -
// import java.util.*;
// public class javaBasic {
//    public static void boubleShort(int[] arr) {
//       // for(int i=0; i<arr.length-1; i++) {
//       //    for(int j=i+1; j<arr.length-1; j++) {
//       //    if(arr[i]>arr[j]) {
//       //       int temp = arr[i];
//       //       arr[i] = arr[j];
//       //       arr[j] = temp;    
//       //    }
//       //    break;
//       //    }
//          //ye niche ki di line ratt lo ...
//       for(int i=0; i<arr.length-1; i++) {
//          for(int j=0; j<arr.length-1-i; j++) {
//             if(arr[j]>arr[j+1]) {
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//             }
//          }  
   
//       }
//    }


//    public static void main(String Args[]) {
//    int[] arr = {7,3,9,5,8,4,1};
//    boubleShort(arr);
//     System.out.print( "shorted elements is :");
//    for(int i=0; i<arr.length; i++) {
//       System.out.print ( arr[i] + " ");
//    }

// }
// }


// Improved code for Selection Sort
// import java.util.*;

// public class javaBasic {
//    public static void selectionSort(int[] arr) {
//       for (int i = 0; i < arr.length - 1; i++) {
//          int minIndex = i;
//          for (int j = i + 1; j < arr.length; j++) {
//             if (arr[minIndex] > arr[j]) {
//                minIndex = j;
//             }
//          }
//          // Swap elements
//          int temp = arr[i];
//          arr[i] = arr[minIndex];
//          arr[minIndex] = temp;
//       }
//    }

//    public static void main(String args[]) {
//       int[] arr = {7, 9, 3, 6, 0, 5, 8};
//       selectionSort(arr);
//       System.out.print("Sorted elements are: ");

//       for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//       }
//    }
// }

// selection short-
//Wong logic
// import java.util.*;
// public class javaBasic {
//    public static void SelectionShort(int[] arr) {
//       for(int i=0; i<arr.length; i++) {
//       int maxnum = Integer.MAX_VALUE;
//       for(int j=i; j<arr.length-1; j++) {
//          if(maxnum>arr[j]) {
//             maxnum = arr[j];
//           }
//       }
//          int temp = arr[i];
//         arr[i]= maxnum;
//         maxnum = temp;     values apas me nahi change hongi unki addressing change hongi example 2=8 nahi posible per arr[1] = arr[3] is this posible;
//          //  break;
//       }
//    }
//    public static void main(String args[]) {
//       int[] arr = {7,9,3,6,0,5,8};
//       SelectionShort(arr);
//       System.out.print("shorted elements is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] + " ");
//    }
// }
// }
// import java.util.*;
// public class javaBasic {
//    public static void SelectionShort(int[] arr) {
//       for(int i=0; i<arr.length; i++) {
//       int maxIndex = i;
//       for(int j=i; j<arr.length; j++) {
//          if(arr[maxIndex]>arr[j]) {
            
//             maxIndex = j;
//           }
//       }
//       int temp = arr[i];
//       arr[i] = arr[maxIndex];
//       arr[maxIndex] = temp;
      
//       }
//    }
//    public static void main(String args[]) {
//       int[] arr = {7,9,3,6,0,5,8};
//       SelectionShort(arr);
//       System.out.print("shorted elements is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] + " ");
//    }
// }
// }


// // insertion sort-
// import java.util.*;
// public class javaBasic {
//    public static void InsertionSort(int[] arr) {
//       for(int i=1; i<arr.length; i++) {
//          int current = i;
//          while(current>0 && arr[current]<arr[current-1]) {
//             int temp = arr[current];
//             arr[current] = arr[current-1];
//             arr[current-1] = temp;

//             current = current-1;         //current is a variable that is used to track the current element in the array
//          }
//       }
//    }
//    public static void main(String args[]) {
//       int arr[] = {7,8,2,5,3,6,0};
//       InsertionSort(arr);
//       System.out.print("sorted elements is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] + " ");

//    }
// }


// }



//  Inbuilt function in java for sorting array
//Syntex-
// import java.util.Arrays;
// Arrays.sort(arr);


// //Example-
// import java.util.*/*orArrays*/;
// public class javaBasic {
//    public static void main(String args[]) {
//       int arr[] = {7,8,2,5,3,6,0};
//       Arrays.sort(arr);
//      // System.out.print("sorted elements is :");
//          System.out.print("Sorted array is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i]+ " ");
//          }
//          }
// }


// Another feature- 
//  Inbuilt function in java for sorting array
//Syntex-
// import java.util.Arrays;
// Arrays.sort(arr ,STRTING INDEX,ENDING INDEX);  SI and EI is define for sorting array from specific index to specific index and bacha kucha sab waise ka waise hi 
//Example-
// Arrays.sort(arr,0,3); it will sort the array from index 0 to 3;


// collection framework in java
// it is use when we need reverse of sorted array means 1,2,3 => 3,2,1;
//Syntex- 
//Integer[] arr = {5,3,8,1,6,9};
//Arrays.sort(arr, Collections.reverseOrder());         firstly it sort the array then print reverse form




// //  Counting array-
// import java.util.*;
// public class javaBasic {
//    public static void Counting(int[] arr) {
//       int[] newarr = new int[arr.length];
//       for(int i=0; i<arr.length; i++) {
//          newarr[arr[i]]++;
         
//       }


//    }
//    public static void main(String args[]) {
//       int[] arr = {5,3,8,5,6,1,6,9};
//       Counting(arr);
//       System.out.print("Counting array is :");
//       for(int i=0; i<arr.length; i++) {
//       System.out.print(arr[i]);
//       }
//    }
// }
   




// youtube{

// import java.util.*;
// public class kgChallenge {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name :");
//         String name = sc.nextLine();
//         System.out.print("Enter your id:");
//         int id = sc.nextInt();
//         System.out.println("Hii "+name+" nice to meet you ,your id is :"+id);

//     }
// }
// }



// Restart :-

// Topic :- 2D-Arrays in Java

// import java.util.*;
// public class javaBasic {
//    public static boolean SearchElement(int[][] dArr, int kay)  {    // BOOLEAN TYPE FUNCTION KE ANDAR BHI HUM KOI STATEMENT PRINT KARA SAKTE HAIN
//       for(int i=0; i<dArr.length; i++) {                            // dArr.length se hum 2D array ke row{.....} ko define karte hain
//          for(int j=0; j<dArr[0].length; j++) {                      // dArr[0].length se hum 2D array ke column{:} ko define karte hain
//             if(dArr[i][j] ==kay) {
//                System.out.println("Element found at position ("+(i+1)+","+(j+1)+")");
//                return true;
//             }
//          }
//       }
//       System.out.print("element not found");
//       return false;
//    }
//    public static void main(String[] args) {
//       System.out.print("enter the  values");
//       Scanner sc = new Scanner(System.in);
//       int[][] dArr = new int[3][3];           
//       for(int i=0; i<dArr.length; i++) {
//          for(int j=0; j<dArr[0].length; j++) {
//             dArr[i][j] = sc.nextInt();           //values are fill in 2D array
//          }
//       }
//        for(int i=0; i<dArr.length; i++) {      //printing 2D array
//       for(int j=0; j<dArr[0].length; j++) {
//          System.out.print(dArr[i][j] + " ");
//       }
//       System.out.println();

//       }
//       SearchElement(dArr, 5);

//    }
// }





// // spiral traversal of matrix
// import java.util.*;
// public class javaBasic {
//    public static void main(String [] args) {
//       int[][] dArr = {{1,2,3},{4,5,6},{7,8,9}};
//           int top = 0 , bottom = dArr.length-1 , left = 0 , right = dArr[0].length-1 , dir = 0 ;
//           while(top <=bottom && left <=right) {
//             if(dir == 0) {
//             for(int i=left ; i<=right; i++) {
//                System.out.print(dArr[top] [i] + " ");
//             }
//             top++;
//             }
//             else if(dir == 1) {
//                for(int j= top; j<=bottom; j++ ) {
//                   System.out.print(dArr[j][right] + " ");
//                }
//             right--;
//             }
//             else if(dir == 2 ) {
//                for(int i=right; i>=left; i--) {
//                   System.out.print(dArr[bottom][i] + " ");
//                }
//                bottom--;
//             }
//             else if(dir == 3) {
//                for(int j=bottom; j>=top; j--) {
//                   System.out.print(dArr[j][left] + " ");
//                }
//             left++;
//             }
//             dir = (dir+1)%4 ;

//           }
//    }
// }



// // diagonal sum 
// import java.util.*;
// public class javaBasic {
//    public static void main(String[] args) {
//       int[][] dArr = {{1,2,3},{4,5,6},{7,8,9}};
//       int sum=0;
//       for(int i=0; i<dArr.length; i++) {
//            sum += dArr[i][i];
//          for(int j=0; j<dArr[0].length; j++) {
//             if(i+j == dArr.length-1) {
//                sum += dArr[i][j];
//             }

//          }
//    }
//             if(dArr.length %2 != 0) {
//                sum -= dArr[dArr.length/2][dArr.length/2];
//             }
//       System.out.print(sum);
//       }
// }

//Searching in Shorted 2D array :

// import java.util.*;

// public class javaBasic {
//    public static void Searching(int[][] dArr, int target) {
//       int row = 0, column = dArr[0].length - 1;

//       while(row < dArr.length && column >= 0) {
//          if(target == dArr[row][column]) {
//             System.out.println("Target element found at position: " + row + "," + column);
//             return;
//          }
//          else if (target > dArr[row][column]) {
//              row++;
//          }
//          else {
//             column--;
//          }
//       }

//       System.out.println("Target element not found in the array.");
//    }

//    public static void main(String[] args) {
//       int[][] dArr = {
//          {10, 20, 30, 40},
//          {15, 25, 35, 45},
//          {27, 29, 37, 48},
//          {32, 33, 39, 51}
//       };
//       int target = 37;
//       Searching(dArr, target);
//    }
// }




// day 2:-
// String:-
// stirng is palindrome or not :
// import java.util.*;
// public class javaBasic {
//    public static boolean isPalindrome(String str) {
//       int last=str.length()-1;
//       for(int i=0; i<=str.length()/2; i++) {
//          if(str.charAt(i) != str.charAt(last)) {
//             System.out.print("String is not palindrome, statement ");
//             return false;
//          }
//          last--;
//       }
//    System.out.print("Sting is palindrome");
//    return true;
//    }
//    public static void main(String[] args) {
//       String str = "abba";
//       System.out.println(isPalindrome(str));

//    }
// }



// // shortest path of direction :-
// import java.util.*;
// public class javaBasic {
//    public static float shortestPath(String str) {
//       int x=0, y=0;
//       for(int i=0; i<str.length(); i++) {
//          char dir = str.charAt(i);
//          switch(dir) {
//             case 'N':
//                y++;
//                break;
//                case 'S':
//                   y--;
//                   break;
//                   case 'E':
//                      x++;
//                      break;
//                      case 'W':
//                         x--;
//                         break;
//          }
//       }
//       return (float)Math.sqrt(x*x+y*y);
//    }
//    public static void main(String[] args) {
//       String str = "WNEENESNNN";
//       System.out.println(shortestPath(str));
// }
   
// }



// // String Builder:-
// import java.util.*;
// public class javaBasic {
//    public static void main(String[] args) {
//       StringBuilder sb = new StringBuilder("");   //empty string builder
//       for(char ch ='a'; ch <='y'; ch++) {                // charecter ke liye '' lagate hai jabki string ke liye "" lagate hai(imp)
//          sb.append(ch);     //String ke piche chrectors ko add karne ke liye .append use kiya jata hai

//       }
//       System.out.print(sb);
//    }
// }

// // Convert letter to UpperCase:-
// import java.util.*;
// public class javaBasic {
//    public static void toUpperCase(String str) {
//       StringBuilder sb = new StringBuilder("");
//       char ch=Character.toUpperCase(str.charAt(0));
//       sb.append(ch);
//       for(int i=1; i<str.length(); i++) {
//          if(str.charAt(i)==' ' && str.charAt(i-1) != ' ') {
//             sb.append(str.charAt(i));
//             i++;                       // i++ karne se first chAR ki value increment ho jati hai aur code ange badhta hai, increment i to skip the space  
//             ch = Character.toUpperCase(str.charAt(i));     //i+1 karne next charecter me to phuch jate per i pure function ke liye increment nahi  hota aur current i ki value wahi rahti jisse character dubara print ho jata ! 
//             sb.append(ch);
//          }
//          else {
//             sb.append(str.charAt(i));
//          }

//       }
//       System.out.print(sb.toString());
//    }
//    public static void main(String[] args) {
//       String str = "hi, I am a java developer";
//       toUpperCase(str);
//    }

// } 



// // day-3;-
// // question :- String Compression-
// // further do it:
// import java.util.*;
// public class java {
//    public static void compress(String str) {
//       StringBuilder sb = new StringBuilder("");
//       char ch= str.charAt(0);
//       sb.append(ch);
//       Integer count = 0;
//       for(int i=1; i<str.length(); i++) {
//          while(str.charAt(i) == str.charAt(i-1)) {
//             count++;
//             sb.append(count.toString());
//             // if(str.charAt(i+1)==str.charAt(i-1) && sb.charAt(i) instanceof Integer ) {
//                // count++;
//                // sb.append(count.toString());

//             }
      
      
//          sb.append(str.charAt(i));
//    }
//    System.out.print(sb.toString());
//    }
//    public static void main(String[] args) {
//       String str = "aabcccccaaa";
//       compress(str);
//    }
// }


// // Restart after the exam:-
// // let Day -3:-
// // topic- constructor:-
// import java.util.*;
// public class Oopm {
//    public static void main(String[] args) {
//       Student s1 = new Student(97 ,"Rahul", 76.2f);   // agar koi number 0 se start ho to wo by defalt octal value me consider kiya jata hai
//       Student s2 = new Student(98 ,"Aman", 96.2f);    // object  creation of STUDENT class
//       System.out.println("Student rollno is "+ s1.getRollNo());    //Getter method USED

// }
// }

// class Student {
//    private int rollno;
//    int getRollNo() {     //is mathod ke through hum (private data)-rollno ko return karte hai outside the class 
//       return rollno;
//    }
//    String name;
//    float marks;
//    Student(int rollno, String name, float marks) {
//       this.rollno = rollno;
//       this.name = name;
//       this.marks = marks;
//        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks);



//            }


// }

// Copy constructor:-

// class Student {
//     int rollno;
//     String name;

//     // Normal Constructor
//     Student(int r, String n) {
//         rollno = r;
//         name = n;
//     }

//     // Copy Constructor
//     Student(Student s) {
//         rollno = s.rollno;
//         name = s.name;
//     }

//     void display() {
//         System.out.println("Roll No: " + rollno + ", Name: " + name);
//     }
// }

// public class first {
//     public static void main(String[] args) {
//         Student s1 = new Student(101, "Rahul");   // original object
//         Student s2 = new Student(s1);             // copy object using copy constructor

//         System.out.println("Original Student:");
//         s1.display();

//         System.out.println("Copied Student:");
//         s2.display();
//     }
// }



// public class Student {
//    int rollno;
//    String name;
//    int marks;
   
//    public Student(int r, String n, int m) {
//       rollno = r;
//       name = n;
//       marks = m;
//    }

//    public Student(Student s) {   // copy constructor 
//       rollno = s.rollno;
//       name = s.name;
//       marks = s.marks;
//    }
// }



// public  class first {
//    public static void main(String[] args) {
//       Student s1 = new Student(101, "Rahul", 85);
//       Student s2 = new Student(s1);

//    }
// }



// // Inheritence :-
// // Hybrid Inheritance is a combination of hierachical  inheritence and multilevel inheritance.
// class Animal {
//    void eat() {
//       System.out.println("Eating...");
//       }
//       }
//     class Mammal extends Animal {
//          void Eat() {
//             System.out.println("Eating...");
//             }
//             }
//             class Dog extends Mammal {
//                 void bark() {
//                     System.out.println("Dogs barking...");
//                 }
//             }
//             class Cat extends Mammal {
//                 void attack () {
//                     System.out.println("Cats Attacking...");
//                 }
//             }

//     class Fish extends Animal {
//                 void wins () {
//                     System.out.println("Fishes have no legs");
//                 }
//             }
//     class Bird extends Animal {
//         void fly() {
//             System.out.println("Birds can fly");
//         }
//     }
//         class Peacock extends Bird {
//             void dance() {
//                 System.out.println("Peacocks dance");
//             }
//         }

    
//     public class first {
//                public static void main(String[] args) {
//                   Dog d = new Dog();
//                   d.eat();  // Output: Eating...
//                   d.bark(); // Output: Barking...
//                   }
//                   }
                   


// Day 4 : Interfaces in Java
// 1. What is an Interface in Java?
// An interface in Java is a collection of abstract methods. It is a blueprint of a class which
// defines a contract that must be implemented by any class that implements it.
// 2. How to create an Interface in Java?   
// An interface in Java is created using the interface keyword. It is declared with 
// the interface keyword followed by the name of the interface. It is defined inside
// the curly brackets and it can contain methods, constants, and other methods.

// public class first {
//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();

//     }
// }

// interface CheasPlayer {
//     void moves();    //yaha pe sirf hum method define karte hai pehle usko implement nahi kar sakte ye method bydefalt public aur abstract  hai!

// }

// class Queen implements CheasPlayer {
//     public void moves() {       //in methods ko implement karna yaha compulsory hota hai 
//         System.out.println("Queen moves one square at a time");
//     }
// }
// class King implements CheasPlayer {
//     public void moves() {
//         System.out.println("King moves one square in any direction  only single step");
//     }
// }




// // perform multiple inheritence in java using interface
// interface HervivoreAnimal {
//     void eat();
// }
// interface CarnivoreAnimal {
//     void eats();   // name same nahi hona chahiye 
// }
// class Bear implements HervivoreAnimal,CarnivoreAnimal {
//     public void eat() {
//         System.out.println("Bear eats fish");
//     }
//     public void eats() {
//         System.out.println("Bear survives by eating fish");
//     }
// }

// public class first {
//     public static void main(String[] args) {
//         Bear b = new Bear();
//         b.eat();
//         b.eats();
//         }
//     }



// // Static kay word in java 
// public class first {
//     public static void main(String[] args) {
//         Second s = new Second();
//         s.change(12);            
//         Second S = new Second();
//         System.out.print(s.a);     //maine s obj me value change kar di jiske karan sare object me ab update value jayegi 

// }
// }
// class Second {    // defalt value of static variable is 0
//         static int a;     //static kayword ki help se variable ki value sare object me same hoti hai agar hum kahi static variable ko change karte hai to uska effect sabhi object par hota hai
//         // System.out.println(a);
//         void change(int a) {
//             this.a =a; 
//         }  
// }



// // super kaywoord in java 
// public class first {
//     public static void main(String[] args) {
//         Child ch = new Child();
        
//     }
// }
// class Super {
//     int a = 10;
//     Super() {
//         System.out.println("Parent Constructor is called ");
//     }

// }
// class Child extends Super {
//      Child() {     //  constructor ko direct likha jata hai void nahi lagate 
//     // super.a = 20;
//         // super();  // it is used to call imediate  parent class constructor    //aur agar supeR LAGAYE YA NA LAGAYE PARENT CONSTRUCTOR CALL HOGA HI 
//         System.out.println("Child Constructor is called ");
//         // System.out.println(a+ "is changes value");
//     }
// }


// // Recursion in Java :-
// program 1st - print 1 to n
// public class first {
//     public static void main(String[] args) {

//         fun(10);
//     }


//     static  void fun(int n) {    // static lagana padega ya fir fun(n) ka object create karna padega 
//         if(n==1) {
//             System.out.println("1");
//             return;
//         }
//         System.out.println(n+" ");
//         fun(n-1);
//     }
// }


// // program 2nd- factorial of a number
// public class first {
//     public static void main(String[] args) {
//         System.out.println(fact(5));
//     }
//     static int fact(int n) {
        
//         if(n==0) {
//             return 1;
//         }
//         return n*fact(n-1);
    
//     }
// }


// // problem 3rd - sum of n number 
// public class first {
// public static void main(String[] args) {
//     System.out.println(sum(10));
// }
// static int sum(int n) {
//     if(n==1) {
//         return 1;
//     }
//     return  n+sum(n-1);
// }
// }



// // problem no 4th - Nth fibonacci series
// public class first {
//     public static void main(String[] args) {
//         System.out.println(fib(3));
//     }
//     static int fib(int n) {
//         if(n==0) {
//             return 0;
//         }
//         else if(n==1) {
//             return 1;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// }


// // problem number 5th - check if array is shorted or not -
// public class first {
//    public static void main(String[] args) {
//       int[] arr = {1,2,3,4,,5,6};
//       if(isSorted(arr,0)) {
//          System.out.println("Array is sorted");
//       }
//       else {
//          System.out.println("Array is not sorted");
//       }
//    }
//    static boolean isSorted(int[] arr, int i) {
//       if(i==arr.length-1) {
//          return true;
//       }
//       else if(arr[i]>=arr[i+1]) {
//          return false ;
//       }
//       return isSorted(arr,i+1);
//    }

// }


// // problem no 6th - find the first  index value where kay has exist in element in array
// public class first {
//    public static void main(String[] args) {
//       int[] arr = {1,2,3,4,5,6,7,5};

//       System.out.print("-"+findFirstIndex(arr,5,0));
//    }
//    static int findFirstIndex(int[] arr, int key,int i) {
//       if(arr[i]==key) {
//          System.out.print("key is exist at index ");
//          return i;
//       }
//       else if(i==arr.length-1) {
//          System.out.print("key is not exist in array");
//          return -1;
//       }
//       else {
//          return findFirstIndex(arr,key,i+1);
//       }
      
//    }


// public class first {
//       public static void main(String[] args) {
//          int[] arr = {1,2,3,4,5,6,7,5,4,9,6};
//          System.out.print("-"+findLastIndex(arr,5,0));

//       }
//    static int findLastIndex(int[] arr, int key,int i) {
//       if(i==arr.length) {   //  yaha per compiler array ki sari values ko check kar chuka hoga 
//          return -1;
//       }
//      int isFound= findLastIndex(arr,key,i+1);
//      if(isFound ==-1 && arr[i]==key) {       //  values ko check karte samay kahi per bhi agar key mil jati hai to us index ko return kar denge
//       System.out.print("the key is exist at index ");
//       return i;
//      }
//      return isFound;
//    }}


// 🔄 Backtracking (Stack Unwinding)
// Let’s look at the values of arr[i] when it’s checking while coming back from recursion:

// i	arr[i]	isFound	Condition met?	Return
// 10 	6	     1	arr[10] == 5 → ❌ return 1
// 9	   9	     1	arr[9] == 5 → ❌	return 1
// 8	   4     	1	arr[8] == 5 → ❌	return 1
// 7  	5     	1	✅ match!	return 7
// 6  	7	      7	arr[6] == 5 → ❌	return 7
// 5  	6	      7	❌	return 7
// 4	   5	      7	✅ but isFound ≠ 1 → skip	return 7
// 3  	4	      7	❌	return 7
// 2  	3	      7	❌	return 7
// 1  	2      	7	❌	return 7
// 0  	1	      7	❌	return 7


// // fint the value of x^n
// public class first {
//    public static void main(String args[]) {
//       System.out.println("the value of 2^10 is "+power(2,10));
//        }
//        static int power(int x,int n) {
//          if(n==1) {
//             return x;
//          }
//          return x*power(x,n-1);
//        }
// }
// time complexity is O(n) and space complexity is O(n)

// // optimied code of above code
// public class first {
//    public static void main(String args[]) {
//       System.out.println("the value of 2^10 is "+power(2,10));
//    }
//    public static int power(int x,int n) {
//       if(n==1) {
//          return x;
//       }
//       if(n%2==0) {
//          return (power(x,n/2))*(power(x,n/2));
//       }
//          return x*power(x,n/2)*power(x,n/2);
      
//    }
// }
// // the time complexity is O(logn) and space complexity is O(logn) because we are dividing the problem inm








// // problem no. 8 - tilling a floor  (amazon interview)   IMP
// public class first {
//    public static void main(String args[]) {
//       System.out.println("the number of way to paced tile in floor is "+totalWay(2,6));
//    }
//    public static int totalWay(int c,int n) {
//       if(n==0 || n==1) {
//          return 1;
//       }
//       int way1= totalWay(c,n-1);  //for vertical placing 
//       int way2= totalWay(c,n-2);  //for horizontal placing
//       return way1+way2;
//    }
//    }

// callstack se samajh a ra hai ki ye problem kaise solve ho rahi hai
// // totalWay(2,6) = totalWay(2,5) + totalWay(2,4)
// // totalWay(2,5) = totalWay(2,4) + totalWay(2,3)
// // totalWay(2,4) = totalWay(2,3) + total  Way(2,2)
// // totalWay(2,3) = totalWay(2,2) + totalWay(2,1)
// // totalWay(2,2) = totalWay(2,1) + total  Way(2,0)
// // totalWay(2,1) = 1                
// // totalWay(2,0) = 1
// // totalWay(2,2) = 1 + 1 = 2
// // totalWay(2,3) = 2 + 1 = 3  
// // totalWay(2,4) = 3 + 2 = 5
// // totalWay(2,5) = 5 + 3 = 8
// // totalWay(2,6) = 8 + 5 = 13
// // so the total number of way to paced tile in floor is 13git 




// // // problem no. 9 - remove duplicates from string (amazon,gooogle interview)
// // revision importent:-
// public class first {
//     public static void main(String[] args) {
//         String str = "aabccdeef";
//         System.out.println(removeDuplicates(str, ""));
//     }
    
//     static String removeDuplicates(String str, String ans) {
//         if (str.length() == 0) {     
//             return ans;
//         }
        
//         char ch = str.charAt(0);
//         if (ans.indexOf(ch) == -1) { // check if character is not already in ans
//                                      // indexOf returns -1 if the character is not found(matlAB KI HUM CHECK KAR RAHE HAIN KI charecter ans me hai ya nahi  agar nahi hoga to -1 return karega)
//             ans += ch;
//         }
        
//         return removeDuplicates(str.substring(1), ans); // recursive call with the rest of the string
//     }                                                    //String str = "hello";
//                                                           //String result = str.substring(1);
//                                                          //   System.out.println(result);
//                                                          // 📌 Output
//                                                          // ello
// }

// // PRACTICE OF CODE -
// public class first {
//    public static void main(String[] args) {
//       String str = "aabccdeef";
//       StringBuilder ans = new StringBuilder("");
//       removeDuplicates(str, ans);
//    }
//    public static void removeDuplicates(String str, StringBuilder ans) {
//       if(str.length()== 0){
//          System.out.println(ans.toString());
//          return;
//       }
//       char ch = str.charAt(0);                    //StringBuider ke paas indexOf method nahi hota hai isliye hum StringBuilder ko String me convert karte hai using toString() method
//       if(ans.toString().indexOf(ch) == -1) { // check if character is not already in ans
//           ans.append(ch); // append the character to ans(means ch ko ans ke pichhe add kar do)
//       }

//       removeDuplicates(str.substring(1), ans); // recursive call with the rest of the string 
// //    }                                              char[] chars = {'a', 'b', 'c'};
// //                                                       System.out.println(chars.toString());
// //                                                          output- 
// //                                                             [C@15db9742   ye adress return karega na ki oringnal string
//                                              //   }
// }




// // problem no. 10 - Friend Pairing Problem (goldman sach  interview) IMP
// public class first {
//    public static void main(String[] args) {
//       System.out.println("the number of way to paired friend is "+friendPairing(4));
//    }
//    public static int friendPairing(int n) {
//       if(n==1 || n==2) {  // base case
//          return n;
//       }
//       int single = friendPairing(n-1); // single friend
//       int pair = friendPairing(n-2) * (n-1); // pair
//       return single + pair;
//    }
// }






// // STACK:-
// // Stack is a data structure that follows the Last In First Out (LIFO) principle.
  
// // program 1st -
// import java.util.ArrayList;

// public class first {

//    static class Stack {
//       static ArrayList<Integer> list = new ArrayList<>();

//       static boolean isEmpty() {
//          return list.size() == 0;
//       }

//       static void push(int data) {
//          list.add(data);
//       }

//       static int pop() {
//          int top = list.get(list.size() - 1);
//          list.remove(list.size() - 1);
//          return top;
//       }

//       static int peek() {
//          return list.get(list.size() - 1);
//       }
//    }

//    public static void main(String[] args) {
//       Stack s = new Stack();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       s.push(4);

//       while (!s.isEmpty()) {
//          System.out.println(s.peek());
//          s.pop();
//       }
//    }
// }


// // program 2nd - Stack using Linked List




// // program 3rd - Push element at the bottom of the stack
// import java.util.*;            //   ye java collection framework hai jisme bahut si useful class stored rahti hai 
// public  class first {
//    public static void pushAtBottom(Stack<Integer> s, int element) {
//       if(s.isEmpty()) {        //har function ko call karne se pahle "s." likhna compulsory hai !
//          s.push(element);
//          return;
//       }
//       int top = s.pop();
//       pushAt
// Bottom(s, element);
//       s.push(top);
//    }
//    public static void main(String[] args) {
//       Stack<Integer> s = new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);

     
//       pushAtBottom(s ,4);
//        while(!s.isEmpty()) {
//          System.out.println(s.pop());
//       }

//    }
// }

// // recursion call stack se samajh a raha hai ki ye problem kaise solve ho rahi hai
// // pushBottom(s, 4) = pushBottom(s, 3) + s.push(4)
// // pushBottom(s, 3) = pushBottom(s, 2) + s.push(3)
// // pushBottom(s, 2) = pushBottom(s, 1) + s.push(2)
// // pushBottom(s, 1) = s.push(1) + return
// // s.push(4) = 4 is pushed to the bottom of the stack
// // s.push(3) = 3 is pushed to the top of the stack
// // s.push(2) = 2 is pushed to the top of the stack
// // s.push(1) = 1 is pushed to the top of the stack
// // so the final stack will be 4,3,2,1


// // program 4th - Reverse a string using stack using recursion
// import java.util.*;
// public class first {
//     static StringBuilder sb= new StringBuilder("");        
//       public static void main(String[] args) {
//       Stack<String> s = new Stack<>();
//       String str = new String("himanshu");
//       int index =0;
//       String revStirng=reverseStr(s, str, index);
//       System.out.println(revStirng);
      
//    }
//    public static String reverseStr(Stack<String> s, String str, int index) {
//       if(str.length()==index) {
//          return "";
//       }
//       s.push(String.valueOf(str.charAt(index)));
//       reverseStr(s, str, index+1);
//       sb.append(s.pop());
//       return sb.toString();
//    }
   
// }

// // without recursion 
// import java.util.*;
// public class first {
// public static void main(String[] args) {
//  String str =new String("apolo");
//  String newStr = reverseStr(str);
//  System.out.print(newStr);
//    }
//    public static String reverseStr(String str) {
//       Stack<Character> s= new Stack<>();
//       for(int i=0; i<str.length(); i++) {
//          s.push(str.charAt(i));
//       }
//       StringBuilder sb = new StringBuilder("");
//       while(!s.isEmpty()) {
//       sb.append(s.pop());
//       }
//       return sb.toString();
//    }
// }

// // Question no. 3 reverse a stack 
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
//       Stack<Integer> s = new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       reverseStack(s);
//       while(!s.isEmpty()) {
//          System.out.println(s.pop());
//       }

//    }
//    public static void pushAtBottom(Stack<Integer> s, int element) {
//       if(s.isEmpty()) {
//          s.push(element);
//          return;
//       }
//       int top = s.pop();
//       pushAtBottom(s, element);
//       s.push(top);
//    }
//    public static void reverseStack(Stack<Integer> s) {
      
//        if(s.isEmpty()) {
//          return;
//        }
//        int top=s.pop();
//        reverseStack(s);
//        pushAtBottom(s, top);  // yaha pe hum pushAtBottom function ko call karte hai jisse stack ke bottom me element ko push karte hai
//    }
// }


// // Problem no. 4 - Stock span Problem (amazon interview) IMP
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
//       int[] stock = {100, 80, 60, 70, 60, 85, 100,120};
//       int[] span = new int[stock.length];
//       getSpan(stock, span);
//       for(int i=0; i<span.length; i++) {
//          System.out.print(span[i]);
//       }

//    }
//    public static void getSpan(int[] stock, int[] span) {
//       Stack<Integer> s= new Stack<>();
//       s.push(0);
//       span[0]= 1;
//       for(int i=1; i<span.length; i++) {
//          int curElement = stock[i];
//          while(!s.isEmpty() && curElement > stock[s.peek()]) {
//             s.pop();
//          }
          
//       span[i] = s.isEmpty() ? (i + 1) : (i - s.peek());    // yaha pe hum check karte hai ki stack empty hai ya nahi agar empty hai to span[i] = i+1 hoga kyuki uske pahle koi bhi element nahi hai jo current element se chota ho aur agar stack empty nahi hai to span[i] = i - s.peek() hoga jisse hum current element ke index se stack ke top element ka index minus karte hai
//          // yahaan pe hum current element ke index se stack ke top element ka index minus karte hai jisse hume current element ka span milta hai
//        s.push(i);
//    }
// }
// }


// // // Problem no. 6 - Next  Right Greater Element (amazon interview) IMP
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
   
//       int[]  arr = {6,8,0,1,3}; {
//       updatedArray(arr);
//       }
//    }
//    public static void updatedArray(int[] arr) {
//       int[] newArr = new int[arr.length];
//       Stack<Integer> s = new Stack<>();
//       int lastE= arr.length-1;
//       s.push(arr[lastE]);
//       for(int i=arr.length-1; i>=0; i--) {
//       while(!s.isEmpty() && arr[i]>=s.peek()) {
      
//       s.pop(); 
//       }
      
      
//       if(s.isEmpty()) {
//         newArr[i] = -1;
//       }
//       else {
//       newArr[i]= s.peek();
//       }      
//       s.push(arr[i]);
//    }
//    for(int i=0; i<newArr.length; i++ ) {
//    System.out.print(" "+newArr[i]);
//    }
//    }
// }


// // Problem no. 7 - genuin parenthesis (amazon interview) IMP
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
//       String str = "[[(){}]]";
//       if(checkStr(str)) {
//          System.out.print("string is valid");
//       }
//       else {
//             System.out.print("string is not valid");
//       } 

//    }
//    public static boolean checkStr(String str) {
//       Stack<Character> s= new Stack<>();
//       for(int i= 0; i<str.length(); i++) {
//          if(str.charAt(i)=='(' || str.charAt(i)=='['||  str.charAt(i)=='{' ) {
//             s.push(str.charAt(i));
//          }
//          else if(s.peek()== '(' && str.charAt(i)== ')') {
//                s.pop();
//          }
//          else if(s.peek()== '{' && str.charAt(i)== '}') {
//             s.pop();
//          }
//          else if(s.peek()== '[' && str.charAt(i)== ']') {
//             s.pop();
//          }

//          if(s.isEmpty()) {
//             return true;
//          }
//       }
//       return false;
//    }
// }


// // program no. 8 - duplicate parenthesis (amazon interview, GOOGLE INTERVIEW) IMP
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
//     String str = "((a+b)+(c-d))" ;
//     if(checkduplicate(str)) {
//       System.out.println("duplicate present");
//     } 
//     else {
//       System.out.println("duplicate not present");
//     }
//    }
//    public static boolean checkduplicate(String str) {
//       Stack<Character> s = new Stack<>();
//       for(int i= 0; i<str.length(); i++) {
//          char ch=str.charAt(i);
//          if(ch!=')') {
//             s.push(ch);
//          }
//          else {
//             int count =0;
//             while(!s.isEmpty() && ch==')' && !(s.peek()=='(')) {
//                s.pop();
//                count++; 
//             }
//             if(count==0) {
//                return true;
//             }
//             if(s.peek()=='(') {
//                s.pop();
//             }
            
//          }

//       }
//       return false;
//    }
// } 


// // program no. 9 - Area of Histogram Problem (amazon interview) IMP
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
//       int[] arr = {2,1,5,6,2,3};
//       int maxArea = maxArea(arr);
//       System.out.println("the maximum area of histogram is "+maxArea);



//    }
//    public static int[] leftSmallerElement(int[] arr) {
//       int[] arr1 = new int[arr.length];
//       Stack<Integer> s= new Stack<>();
//       // s.push(0);
//       for(int i=0; i<arr.length; i++) {
//          while(!s.isEmpty() && arr[i]<=arr[s.peek()]) {
//             s.pop();
//          }
//          if(s.isEmpty()) {
//             arr1[i] = -1;
//          }
//          else {
//             arr1[i]= s.peek();
//          }
//          s.push(i);
//       }
//       return arr1;
//    }

//    public static int[] rightSmallerElement(int[] arr) {
//     int[] arr2 = new int[arr.length];
//     Stack<Integer> s = new Stack<>();

//     for (int i = arr.length - 1; i >= 0; i--) {
//         while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
//             s.pop();
//         }
//         arr2[i] = s.isEmpty() ? arr.length : s.peek();
//         s.push(i);
//     }
//     return arr2;
// }

//    public static int maxArea(int[] arr) {
//       int[] RSE = rightSmallerElement(arr);
//       int[] LSE = leftSmallerElement(arr);
//       int Maxarea =0;

//       for(int i= 0; i<arr.length; i++) {
//          int width = RSE[i] - LSE[i] - 1;
//          int area = arr[i]*width;
//          if(area > Maxarea) {
//             Maxarea =area;
//          }
          
//       }
//       return Maxarea;

//    }
// }


// Restart - from Devide and Conquer 
// // program no. 1 - Merge Sort IMP
// import java.util.*;
// public class first {
//    public static void main(String[] args) {
//       int[] arr = {7,4,6,9,2,5};
//       mergeSort(arr);
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] ,0, arr.length-1);  
//       }
//    }
//    public static void mergeSort(int[] arr,int SI, int EI) {
//       // Base case 
//       if(SI>=EI) {
//          return;
//       } 
//        int mid = (SI+EI)/2;
//       mergeSort(arr, SI, mid);
//       mergeSort(arr, mid+1,EI);
//       merge();  // iske baad nahi ban raha tha
//    }
//    publi static void merge()

//    }


// // program no 2 :

// public class first {
//    public static void main(String... args) {
//       int[] arr = {4,6,9,2,7};
//       quickSort(arr);
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(" "+arr[i]);
         
//       }

//    }
// }

public class first {
   public static void main(String[] args) {
      int[] arr = {4,5,6,7,0,1,2};
      int target = 0;
      int result =search(arr, target);
      System.out.println("Element found at index: " + result);
   }
public static int search(int[] nums, int target) {
    int targetIndex = advBinarySearch(nums,target);
    return targetIndex;
    }

    public static int searchInSortedArray(int[] arr ,int si,int ei, int target) {
    
        while (si <= ei) {
            int mid = si + (ei - si) / 2; // overflow avoid
            if (arr[mid] == target) {
                return mid; // index mil gaya
            } 
            else if (arr[mid] < target) {
                si = mid + 1; // right side me search
            } 
            else {
                ei = mid - 1; // left side me search
            }
        }
        return -1; // not found
    }


    public static int advBinarySearch(int[] arr , int target) {
        int si=0;
        int ei= arr.length-1;
        int midi = (si+ei)/2;
        if(arr[midi]==target) {
            return midi;
        }
        if(arr[midi]>=arr[si]) {
            if(target<arr[midi] && target>arr[si]) {
               return searchInSortedArray(arr, si, midi-1, target);
            }
            else {
                  return searchInSortedArray(arr, midi+1, ei, target);
                 }
                
                }
        else if(arr[midi]<=arr[ei]) {
            if(target>arr[midi] && target<arr[ei]) {
              return searchInSortedArray(arr, midi+1, ei, target);
            }
            else {
              return  searchInSortedArray(arr, si, midi-1, target);
            }
        }
        return -1;
    }

        
}
