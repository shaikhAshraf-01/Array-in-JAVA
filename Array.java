public class Array{
     public static void main(String[] args){
        //Array declaration with new keyword and fixed sized.
        // int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;
        //  for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
     

        //Array with not fixed sized.
        int []arr={10,20,30,40};
         for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
     

       // with diff data types.
        double[] a={2.2,3.3,4.4};
         for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
     
        char[]c={'a','b','c'};
         for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }
     
        String [] s={"Ashraf","Fahim","Vikar"};
         for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
     
        Boolean [] b=new Boolean[4];
        b[0]=true;
        b[1]=false;
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
     }
}