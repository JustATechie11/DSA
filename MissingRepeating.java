class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int missing = -1; 
        int repeated = -1;
        int n = grid.length;

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int val = grid[i][j];
                if(!s.contains(val)){
                    s.add(val);
                } else {
                    repeated = val;
                }
            }
        }

        for(int x = 1; x <= n*n; x++){
            if(!s.contains(x)){
                missing = x;
                break;
            }
        }

       return new int[] {repeated, missing};
    }
}
