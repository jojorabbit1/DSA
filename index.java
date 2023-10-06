// class Index1{

//     public int linearSearch(int arr[], int key){
//         int find = 0;

//         for(int i = 0; i < arr.length; i++){
//             if(key == arr[i]){
//                 find = i;
//                 return find;
//             }else{
//                 find = -1;
//             }
//         }
//         return find;
//     }
//     public static void main(String[] args){
//       Index obj = new Index();
//       int arr[] = {2,4,6,8,10,12,14,16};
//      int val = obj.linearSearch(arr, 11);
//      System.out.println(val);
//     }
// }

// class Index{

//    public int findLargest(int arr[]){
//     int largest = 0;

//     for(int i = 1; i< arr.length ; i++){
//         if(arr[largest] < arr[i]){
//             largest = i;
//         }
//     }
//     return largest;
//    }

//     public static void main(String[] args){
//       Index obj = new Index();
//       int arr[] = {2,4,6,8,10,12,14};
//      int val = obj.findLargest(arr);
//      System.out.println(arr[val]);
//     }
// }

class Index{

   public void binarySearch(int arr[],int key){
    int mid = arr.length / 2;

    if(arr[mid] == key){
        //retunr mid
    }else if(key < arr[mid]){
        
    }

   }

    public static void main(String[] args){
      Index obj = new Index();
      int arr[] = {2,4,6,8,10,12,14};
     int val = obj.findLargest(arr);
     System.out.println(arr[val]);
    }
}