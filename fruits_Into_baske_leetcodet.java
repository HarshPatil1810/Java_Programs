class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> hm = new HashMap<>();
        int left = 0, maxfruit = 0;

        for (int right = 0; right < fruits.length; right++) {
            hm.put(fruits[right], hm.getOrDefault(fruits[right], 0) + 1);

            // Shrink the window if there are more than 2 types of fruits
            while (hm.size() > 2) {
                hm.put(fruits[left], hm.get(fruits[left]) - 1);
                if (hm.get(fruits[left]) == 0) {
                    hm.remove(fruits[left]);
                }
                left++;
            }

            // Update the maximum fruits collected
            maxfruit = Math.max(maxfruit, right - left + 1);
        }

        return maxfruit;
    }
}
