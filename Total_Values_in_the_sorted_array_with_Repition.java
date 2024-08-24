
public static int findUnique(int arr[]){
        int count=0;
        for(int i=arr.length-1; i>=0; i--){
            if(i-1 >=0 && arr[i]==arr[i-1]){
                continue;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,6,6,6,6,6,7,8,9,10};
        System.out.println("Unique Value: " + findUnique(arr));
    }
}
