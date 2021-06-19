public class convertToHex {    
    public static String[] convertToHex(String[] nums) {

        for (int i = 0; i < nums[i].length(); i ++) {
            if (nums[i].charAt(0) != '#') {
                nums[i] = "#" + nums[i];
            }
        
            while (nums[i].length() > 7) {
                nums[i] = nums[i].substring(0, nums[i].length() - 1);
            }
        }

        return nums;
    }
}