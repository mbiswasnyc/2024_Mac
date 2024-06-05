package problems;

public class MethodMix {
    public static void main(String[] args) {
        printSquare(3);
        printLargerValue(13,6);

        int [] numbers1={1,4,5,3,7,8,9};
        int [] numbers2={7,7,9,4,7,5,3,5,7};
        largerArray(numbers1,numbers2);
    }

    public static void printSquare(int n1){
        System.out.println("Square value is: "+(n1*n1));
    }

    public static void printLargerValue(int n1, int n2){
        if(n1>n2){
            System.out.println("larger value is: "+n1);
        }else {
            System.out.println("larger value is: "+n2);
        }
    }

    public static void largerArray(int[] nums1, int[] nums2){
        if(nums1.length>nums2.length){
            System.out.println("larger Array is: 1st Array");
        }else if(nums2.length>nums1.length){
            System.out.println("larger Array is: 2nd Array");
        }else{
            System.out.println("Both Arrays are same in size");
        }
    }


}
