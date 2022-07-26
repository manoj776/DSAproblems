public class Frequiencies {
    static void printFreq(int arr[], int n) {
        int count =0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                System.out.println(arr[i]+" count is" + count);
            }

        }
    }

    public static void main(String args[])
    {
        int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

        printFreq(arr, n);

    }
}
