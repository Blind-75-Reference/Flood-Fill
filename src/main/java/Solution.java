class Solution {
    /*
    This recursive solution works by recursively calling the recursiveFill method with different coordinates
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(color != oldColor) {
            recursiveFill(image, sr, sc, oldColor, color);
        }
        return image;
    }

    private void recursiveFill(int[][] image, int row, int col, int oldColor, int newColor) {
        image[row][col] = newColor;

        //check and recurse on 4 neighbors
        //south
        if(row > 0 && image[row-1][col] == oldColor) {
            recursiveFill(image, row-1, col, oldColor, newColor);
        }

        //north
        if(row < image.length-1 && image[row+1][col] == oldColor) {
            recursiveFill(image, row+1, col, oldColor, newColor);
        }

        //west
        if(col > 0 && image[row][col-1] == oldColor) {
            recursiveFill(image, row, col-1, oldColor, newColor);
        }

        //east
        if(col < image[0].length-1 && image[row][col+1] == oldColor) {
            recursiveFill(image, row, col+1, oldColor, newColor);
        }
    }
}