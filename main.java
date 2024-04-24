

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
// int alexBucket =  0;
// int aliceBucket = 0;
// boolean turn = false;
// //true = alex
// //flase = alice 
// int bucket[]={1,2,3,4,5,5,6,7};
//             //0,1,2,3,4,5,6,7     
// alexBucket = bucket[0];
// for(int i=1; i<bucket.length; i++){
//    if(turn == true){
//     alexBucket += bucket[i];
//     turn = false;
//    }
//    else{
//     aliceBucket += bucket[i];
//     turn = true;
//    }
// }
// System.out.println(alexBucket + " " + aliceBucket);
//alexbucket = 1
//alicebucket = 2
//bucket[i] = 2
//i= 1
//turn = true
//bucket.length =8



// int alex=0;
// int alice =0;




//0=alex
//1=alice
//2=alex
//3=alice
//4=alex
//5= alice
//6 = alex

//i=4 alex
//i+1 = alice
// int bucket[]={1,2,3,4,5,5,6,7};
//             //0,1,2,3,4,5,6,7    

// for(int i =0; i<bucket.length; i++){
//     alex += bucket[i];
//     if(i+1 < bucket.length){
//         alice += bucket[i+1];
//     }
//     i++;
// }
// System.out.println("alex:" + alex + " " + "alice:" + alice);

//alex =1
//alice = 2
//i = 0
//bucket[i]= 1
//bucket[i+1] = 2
//bucket.length = 8

//alex =1+3
//alice = 2+4
//i = 2
//bucket[i]= 3
//bucket[i+1] = 4
//bucket.length = 8

//alex =1+3+5
//alice = 2+4+5
//i = 4
//bucket[i]= 5
//bucket[i+1] = 5
//bucket.length = 8


//alex =1+3+5+6
//alice = 2+4+5+7
//i = 6
//bucket[i]= 6
//bucket[i+1] = 7
//bucket.length = 8

//------------------------------------------------------------------------

//wap to count the elements greater then given value 


// //my name is utkarsh
// String para = "my name is utkarsh";
// //ym eman si ksraktu

// String arr[] = para.split(" ");

// String finalString="";
// // System.out.println(arr[0].length()+" " + arr[0].charAt(0));

// for(int i =0; i<arr.length; i++){
//     int length = arr[i].length()-1;
//     String str ="";
//     for(int j = length; j>=0; j--){
//             char ch = arr[i].charAt(j);
//             str =str + ch;
//     }
//     finalString = finalString + str + " ";
   
// }

// System.out.println(finalString);



 	
// Write a program to find out the difference between sum of all the elements in two arrays arr1 and arr2.
// 3
// 1 2 10
// 3
// 3 4 1
// First array is larger


// int arr[]= {1,2,34,5,5,-66,2};
// int arr2[] = {2,3,5,6,8,6,5,4,3,45,-67,8,-88,0};

//         int arrsum=0;
//         int arr2sum=0;

//     for(int i=0; i<arr.length; i++){
//             arrsum += arr[i];
//     }
//     for(int i=0; i<arr2.length; i++){
//         arr2sum += arr2[i];
//     }

//     if(arrsum>arr2sum){
//         System.out.println("array one");
//     }else{
//         System.out.println("array two");
//     }
//O(n)



//medium
// Karan has an array arr and an integer k. He wants to find out the number of consecutive pairs of array elements whose sum will be k.
// Write a program to count the number of consecutive pairs.
// Note that, if arr[5]={1,2,3,4,5} then consecutive pairs are (1,2),(2,3),(3,4),(4,5).

// array size =4
// k = 3
// int arr[]={1,2,1,2,1,2};
//         // 0,1,2,3,4,5
// int k =3;
// int count =0;
// //1
// for(int i = 0; i<arr.length - 1;i++){
//    System.out.println(arr[i]+" " + arr[i+1]);
//    if(arr[i]+arr[i+1]== k){
//     count++;
//    }
// }
// System.out.println(count);

//1,2
//2,1
//1,2
//2,1
//1,2
//2,1
//1,2
//0,3
//3,0
//0,3
//3,0
//0,3




// First line consists of an integer n1
// Second line consists of n1 spaced integers, representing elements of arr1
// Third line consists of an integer n2
// Fourth line consists of n2 spaced integers, representing elements of arr2

// 3
// 3 2 1
// 3
// 1 2 3

// 321 - 123 = 198


//----------------------------------------------------
//merge two sorted arrays
// int arr[] ={1,5,3,2};
// mergesort(arr, 0, 3);
//     for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]+ " ");
//     }
// }


// public static void mergesort(int arr[], int right, int left){
//     if(left>=right){
//         return;
//     }
//     int mid = (right+left)/2;
//     mergesort(arr, left, mid);
//     mergesort(arr, mid+1, right);
//     mergesortedArrrays(arr,left, mid, right);
    
// }




// public static void mergesortedArrrays(int arr[], int left, int mid, int right){
//     int n = mid - left+1;
//     int m = right - mid;
    
//     int [] nums1 = new int [n];
//     int [] nums2 = new int [m];
//     int cur_idx = left;
//     for(int i =0; i<n; i++){
//         nums1[i] = arr[cur_idx];
//         cur_idx++;
//     }
//     for(int i =0; i<m; i++){
//         nums2[i] = arr[cur_idx];
//         cur_idx++;
//     }

//     int i =0;
//     int j =0;
//     int k = left;

//     while(i<n && j<m){
//         if(nums1[i]<nums2[j]){
//             arr[k]=nums1[i];
//             i++;
//         }else{
//             arr[k]=nums2[j];
//             j++;
//         }
//         k++;
//     }


//     while(i<n){
//         arr[k]=nums1[i];
//         i++;
//         k++;
//     }
//     while(j<m){
//         arr[k]=nums2[j];
//         j++;
//         k++;
//     }


// }

//-------------------------------------------------------------------------------------
//1,2,3,4,5,7,8,9,10,66,67
//arr1[] size n
//arr2[] size m
//size of arr3 = n+m
//we will two pointer one for arr1[] and other for arr[2]
//when we will go out either of any arrays index then we will copy the bigger arrays left over elemets directly to the arr[]3


// int arr1[]={0,2,3,4,5,66,67};//i
// int arr2[]={7,8,9,10};//j
// int n = arr1.length;
// int m = arr2.length;
// int arr3[] = new int[n+m];
// int i =0;
// int j =0;
// int currentidx =0;

// while(i<n && j<m){
//     if(arr1[i]<arr2[j]){
//         arr3[currentidx] = arr1[i];
//         i++;
//         currentidx++;
//     }else{
//         arr3[currentidx] = arr2[j];
//         j++;
//         currentidx++;
//     }
// }
// while(i<n){
//     arr3[currentidx] = arr1[i];
//     i++;
//     currentidx++;
// }
// while(j<m){
//     arr3[currentidx] = arr2[j];
//     j++;
//     currentidx++;
// }

// for(int j1 =0; j1<arr3.length; j1++){
//         System.out.print(arr3[j1]+" ");
// }

//i= 1
//j= 0
//arr1[i]= 1
//arr2[j]=7
//arr3[0]=1
//current_idx= 1

//i= 1
//j= 0
//arr1[i]= 2
//arr2[j]= 7
//arr3[1]= 1
//current_idx= 1

//i= 2
//j= 0
//arr1[i]= 3
//arr2[j]= 7
//arr3[1]= 1
//current_idx= 2

//i= 3
//j= 0
//arr1[i]= 4
//arr2[j]= 7
//arr3[1]= 1
//current_idx= 3

//i= 4
//j= 0
//arr1[i]= 5
//arr2[j]= 7
//arr3[1]= 1
//current_idx= 4

//i= 5
//j= 0
//arr1[i]= 66
//arr2[j]= 7
//arr3[1]= 1
//current_idx= 5

//i= 5
//j= 1
//arr1[i]= 66
//arr2[j]=8
//arr3[1]= 1
//current_idx= 6

//i= 5
//j= 2
//arr1[i]= 66
//arr2[j]= 9
//arr3[1]= 1
//current_idx= 7

//i= 5
//j= 3
//arr1[i]= 66
//arr2[j]= 10
//arr3[1]= 1
//current_idx= 7

//i= 5
//j= 4
//arr1[i]= 66
//arr2[j]= 10
//arr3[1]= 1
//current_idx= 7

//n = 7
//m = 4

//1,2,3,4,5,7,8,9,10

//-------------------------------------------------------------------------------------

//2D Array 
int arr[][] = new int[5][5];
int row=5;
int col=5;
int count =1;

//insertion 
for(int i =0; i<row; i++){
    for(int j=0; j<col; j++){
        arr[i][j]=count;
        count++;
    }
    System.out.println();
}





//print 2d array
for(int i =0; i<row; i++){
    for(int j=0; j<col; j++){
        System.out.print(arr[i][j]+ " ");
    }
    System.out.println();
}

//initilse 2d array 
//print empty matrix

//print matrix from 1-n(each cell value)

//print a binary matrix of 5,5

//Print Matrix Column Wise



    } 
}
