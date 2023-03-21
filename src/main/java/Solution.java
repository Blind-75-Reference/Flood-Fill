import java.util.LinkedList;
import java.util.List;

class Solution {
    /*
    This solution will track the unvisited cells and make sure to visit each, expanding the fill as we go
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        List<int[]> fillList = new LinkedList<>();
        int replaceColor = image[sr][sc];
        fillList.add(new int[]{sr, sc});

        while(!fillList.isEmpty()) {
            int row = fillList.get(0)[0];
            int col = fillList.get(0)[1];
            fillList.remove(0);
            if(image[row][col] == replaceColor) {
                image[row][col] = color;

                //check 4 neighbors
                if(row > 0) {
                    //west neighbor in bounds
                    fillList.add(new int[]{row-1, col});
                }

                if(row < image.length-1) {
                    //east neighbor in bounds
                    fillList.add(new int[]{row+1, col});
                }

                if(col > 0) {
                    //south neighbor in bounds
                    fillList.add(new int[]{row, col-1});
                }

                if(col < image[0].length-1) {
                    //north neighbor in bounds
                    fillList.add(new int[]{row, col+1});
                }
            }
        }

        return image;
    }
}