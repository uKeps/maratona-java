package maratona.Arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int[] nums2 = {1,2,3,4,5};
        int [] nums3 = new int[]{1,2,3,4,5};

//        for (int i = 0; i < nums3.length ; i++) {
//            System.out.println(nums2[i]);
//        }
//
        for(int num : nums3) {
            System.out.println(num);
        }
    }
}
