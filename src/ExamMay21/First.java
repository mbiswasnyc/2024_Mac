package ExamMay21;

public class First {
    public static void main(String[] args) {
        int[] nums1={12,3,4,6,9,3,4};
        int[] nums2={12,3,4,6,9,3,5};
        sumArray(nums1,nums2);

    }

    public static void sumArray(int[]nums1, int[] nums2){
        int sum1=0;
        int sum2=0;
        for(int i=0; i<nums1.length; i++){
            sum1=sum1+nums1[i];
        }
        for(int j=0; j<nums2.length; j++){
            sum2=sum2+nums2[j];
        }
        if(sum1==sum2){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
