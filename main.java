

public class main {
    
    public static void main(String[] args) {
        // int x =10;
        // int y =0;
        // do{ 
        // System.out.println(x+"");
        // x++;
        // y++;
        // }
        // while( y<10);


        //table of 10 
        //how can i break at 12 
        // int x =2;
        // int ans=0;
        // for(int i =0; i<=10; i++){
        //     ans = x*i;
        //     if(ans==12){
        //         System.out.println(x+"*"+i+"="+ans);
        //         break;
        //     }   
        //     System.out.println(x+"*"+i+"="+ans);
        // }
        // System.out.println("we are outside the loop");

        //insertion 
        //deletion 
        //traversal
            //forward
            //backward
        
            // int arr [] = {1,2};
            // int len = arr.length;
            // System.out.println(len);

            // int arr2[]={1,2};
            // arr2[0]= 1;
            // arr2[0]= 2;
            // arr2[0]= 3;
            // arr2[0]= 4;
            // arr2[1]= 1;
            // System.out.println(arr2[1]);
            // int[] arr = new int[10];
            // for(int start =0; start<arr.length; start++){
            //         System.out.print(" "+arr[start]);
            // }

            // int arr2[]={1,2,3,4,5,6,7};
            //         //  0,1,2,3,4,5,6
            // //starting = arr.length - 1
            // //ending = 0
  
            // for(int start = arr2.length-1; start>=0; start--){
            //     System.out.print(" "+arr2[start]);
            //  }
    
             //10,20,30,40,50,60,70

            // int arr2[]={1,2,3,4,5,6,7};
            //wap to find if k exist or not if yes print true if not print false 
            //here k is any element given to user
            //wap a program to print 10, 20 ,30 

/*
 * Array data structure 
 * Array memory representation 
 * Array traversal 
 * Array insertion basic 
 * Array length 
 */
//---------------------------------------------------------
// program to find the largest element from the array
            //  int arr[]= {90,2,3,4,55,67,8,8};
            //             //0,1,2,3,4, 5, 6,7
            //  int max = 0;
            //  for(int i =0; i<arr.length; i++){
            //     if(max<arr[i]){
            //         max=i;
            //     } 
            //  }
            //  System.out.println("max "+ max);
        //max = 0
        //i = 0
        //arr[i]=90 

        //max = 1
        //i = 1
        //arr[i]=2  
        
        //max = 2
        //i = 2
        //arr[i]=3
        
        //max = 3
        //i = 3
        //arr[i]=4

        //max = 4
        //i = 4
        //arr[i]=55

        //max = 5
        //i = 5
        //arr[i]=67

        //max = 6
        //i = 6
        //arr[i]=8

        //max = 7
        //i = 7
        //arr[i]=8

        //ouput
        //67


//---------------------------------------------------------     
//wap to find the second largest element from the array //TC: O(n) 
// int sl[]= {-1, -2, -3, -4, -57, -67, 57};
//         // 0, 1, 2, 3, 4 , 5,  6
//         int largest =  Integer.MIN_VALUE; 
//         int secondLargest = Integer.MIN_VALUE;
            
//         for(int i =0; i<sl.length; i++){
//             if(sl[i]>largest){
//                 secondLargest = largest;                
//                 largest = sl[i];
//             }
//             else if(sl[i]> secondLargest && sl[i] != largest ){
//                 secondLargest = sl[i];
//             }
//         }
//         System.out.println(secondLargest);

//l = 1
//sl = -1
//sl[i] = 1
//i=0
//sl.legnth = 8

//l = 67
//sl = 57
//sl[i] = 57
//i=6
//sl.legnth = 7

//---------------------------------------------------------

//wap to find the smallest element in the given array 
// int smallestElement [] = {1,2,3,4,5,4};

// int s = Integer.MAX_VALUE; 
// for(int i =0; i<smallestElement.length; i++ ){
//     if(smallestElement[i]<s){
//         s = smallestElement[i];
//     }
// }
 
// System.out.println(s);

//---------------------------------------------------------
//wap to find the second smallest element
// int arr [] = {1,2,3,4,5,4};
//     int smallest = Integer.MAX_VALUE; ;
//     int secondSmallest= Integer.MAX_VALUE; 

//     for(int i=0; i<arr.length; i++){
//         if(arr[i]<smallest){
//             secondSmallest = smallest;
//             smallest = arr[i];
//         }
//         else if (arr[i]<secondSmallest && arr[i] != smallest ){
//             secondSmallest = arr[i];
//         }
//     }
//     System.out.println(secondSmallest);
//---------------------------------------------------------

//each one of them has bucket with 0 apples 
//initially alex picks 0th index apples 
//alex and alice plays a game
//turn by turn  picks a number 
//adds the number to their buccket and add them to previous one 
//return the one with max apples 

//int arr[]= {12,2,3,4,5,5,5}

//starting 
//answer condition
//ending 

//how to find whoes turn

int alexBucket =  0;
int aliceBucket = 0;

boolean turn = false;
//true = alex
//flase = alice 

int bucket[]={1,2,3,4,5,5,6,7};
            //0,1,2,3,4,5,6,7     
alexBucket = bucket[0];

for(int i=1; i<bucket.length; i++){
   if(turn == true){
    alexBucket += bucket[i];
    turn = false;
   }
   else{
    aliceBucket += bucket[i];
    turn = true;
   }
}


System.out.println(alexBucket + " " + aliceBucket);


//alexbucket = 1
//alicebucket = 2
//bucket[i] = 2
//i= 1
//turn = true
//bucket.length =8

//------------------------------------------------------------------------

//wap to count the elements greater then given value 










}
}
