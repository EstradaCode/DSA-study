package ArraysExercises;

public class TwoSums {
    //primer intento 70s time complexity O(n²)
        public int[] twoSum(int[] nums, int target) {
            int[] res= new int[2];
            for(int i=0; i< nums.length; i++){
                for(int j=i+1;j < nums.length; j++){
                    if((nums[i]+nums[j]) == target){
                        res[0]=i;
                        res[1]=j;
                        return res;
                    }
                }
            }
            return null;
        }
        /*
        A more efficient approach is to use a hash table (unordered_map in C++). We can iterate through the array once,
         and for each element, check if the target minus the current element exists in the hash table.
         If it does, we have found a valid pair of numbers.
         If not, we add the current element to the hash table.
         solucion de 0(N²) utilizando hash tables
            https://leetcode.com/problems/two-sum/solutions/3619262/3-method-s-c-java-python-beginner-friendly
         */
}
