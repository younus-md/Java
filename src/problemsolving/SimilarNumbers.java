package problemsolving;

import java.util.HashMap;
import java.util.Map;

/* Given an array of elements, find the similar pair count
[1,2,3,1]here 1 is at index 0 and last index so it becomes a pair and count is1
[1,2,3,4,1,2,1]
possible pair in above arrays 1,1 -2-2 -1,1 -1,1 --count is 4

Solution 1 : One straight farward soultion would be simply to iterate through arra
using two loops, if match found increase count else return 0. But time complexity is O(n**2).

Solution 2 : Using Hashmap and check if there is key already present else add them to hash map. Best suited solution.time complexity is O(n).
*/
public class SimilarNumbers {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 3, 4, };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println(arr[i] + "--" + arr[j]);
				if (arr[i] == arr[j]) {
					count++;
				}
			}

		}
		Map<Integer, Integer> cm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (cm.containsKey(arr[i])) {
				count++;
			} else {
				cm.put(arr[i], arr[i] + 1);
			}

		}

		System.out.println(count);
	}

}
