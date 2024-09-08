import java.util.Scanner;

public class polynomial {
   
  static int max(int a[],int b[]){
    return a.length>b.length?a.length:b.length;
  }


  static void addPoly(int a[],int b[]){
       int size=max(a,b);
       int c[]=new int[size];

       for(int i=0;i<a.length;i++){
        c[i]=a[i];
       }

       for(int i=0;i<b.length;i++){
        c[i]+=b[i];
       }

       System.out.println();
       System.out.println("Sum polynomial: ");
       printPoly(c, size);
       System.out.println();
  }


  static void printPoly(int p[],int size){
    int i;  
    for( i=0;i<p.length;i++){
        System.out.print(p[i]);

       if(i!=0){
        System.out.print("x^"+i);
       }

        if(i!=size-1){
          System.out.print(" + ");
        }
        
       
      }
      System.out.println();
     
  }
   public static void main(String[] args) {

    System.out.print("Enter no. of coefficient for the first polynomial : ");
    Scanner s= new Scanner(System.in);

    int size_a=s.nextInt();
    int a[]=new int[size_a];

    System.out.println("Enter coefficient for first polynomial : ");

   for(int i=0;i<a.length;i++){
     a[i]=s.nextInt();
   }
    System.out.println();

    System.out.print("Enter no. of coefficient for the second polynomial : ");

    int size_b=s.nextInt();
    
    int b[]=new int[size_b];
    
   System.out.println("Enter coefficient for second polynomial : ");

   for(int i=0;i<b.length;i++){
     b[i]=s.nextInt();
   }
    System.out.println();
    System.out.println("First polynomial: ");
    printPoly(a, size_a);
    
    System.out.println();
    System.out.println("Second polynomial: ");
    printPoly(b, size_b);

    addPoly(a, b);

   }
}



