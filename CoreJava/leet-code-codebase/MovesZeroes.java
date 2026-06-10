class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        for (;i<arr.length;i++){
            if (arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
         for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}