/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-21
 * Time: 18:28
 */
public class TestDemo3 {
    public void oddInOddEvenInEven(int[] arr) {
        if(arr==null || arr.length<2){
            return;
        }
        int even=0;
        int odd=1;
        int end=arr.length-1;
        while(even <=end && odd<=end){
            if(arr[end]%2==0){
                swap(arr,end,even);
                even += 2;
            }else{
                swap(arr,end,odd);
                odd += 2;
            }
        }
    }
    public void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
