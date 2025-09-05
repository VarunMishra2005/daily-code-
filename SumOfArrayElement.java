public class SumOfArrayElement {
    static int Sum(int arr[], int index){
if(index==arr.length){
    return 0 ;

    }
    
    

return arr[index]+Sum(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,50};
        int sum = Sum(arr, 0);
        System.out.println(sum);
    }
}
