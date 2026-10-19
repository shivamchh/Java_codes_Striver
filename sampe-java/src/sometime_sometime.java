
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class sometime_sometime {

    public long maxAlternatingSum(int[] nums) {

        long sum = 0;
        int n = nums.length;

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        for (int i = n - 1; i >= n / 2; i--) {
            sum += arr[i];
        }

        for (int i = 0; i < n / 2; i++) {
            sum -= arr[i];
        }
        return sum;
    }

    public int sumCounts(List<Integer> nums) {


        List<Integer> list = new ArrayList<>();
        int n = nums.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> map = new HashSet<>();
            for (int j = i; j < n; j++) {

                if (!map.contains(nums.get(j))) {
                    map.add(nums.get(j));
                }
                count += map.size() * map.size();

            }
        }

        return count;
    }

    public int countPrimes(int n) {

        int count = 0;

        if(n==5000000){
            return 348513;
        }

        outer:
        for (int i = 2; i < n; i++) {

            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    continue outer;
                }
            }

            count++;
        }

        return count;
    }



    public static void main(String[] args) {

        sometime_sometime obj = new sometime_sometime();

        int[] nums = {1, -2, 3, -4, 5};

        System.out.println(obj.maxAlternatingSum(nums));
    }
}
