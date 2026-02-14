package test;

public class Second_largest {
    public static void main(String[] args) {
        int[] arr ={5,1,4,2,8};
        int max =0;
        int smax =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            if(smax > arr[i] && max != arr[i]){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
