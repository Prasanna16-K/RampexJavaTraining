package Day9.Classtask;



public class FindMissingNumbers {
    public static void main(String[] args){
        int n=6;
        int [] arr ={2,3,4,5,6};
        int aSum =0;
        int arSum =0;
        //finding the Actual sum 1 to n;
        for(int i=1;i<=n;i++){
            aSum =aSum+i;
            if(i>arr.length){continue;}
            arSum =arSum+ arr[i-1];
        }
        // find the Arraysum
//        for (int i=0;i<arr.length;i++){
//
//            arSum =arSum+ arr[i];
//
//        }
        System.out.print(aSum -arSum);
    }

}