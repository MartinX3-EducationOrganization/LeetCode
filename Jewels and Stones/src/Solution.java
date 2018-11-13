class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int y = 0; y < S.length(); y++) {
                if (S.charAt(y) == J.charAt(i)) {
                    counter++;
                }
            }
        }

        return counter;
    }
}