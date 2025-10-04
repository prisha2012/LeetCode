class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }
    private void fill(int[][] img, int r, int c, int oldColor, int newColor) {
        if (r < 0 || c < 0 || r >= img.length || c >= img[0].length || img[r][c] != oldColor) return;
        img[r][c] = newColor;
        fill(img, r + 1, c, oldColor, newColor);
        fill(img, r - 1, c, oldColor, newColor);
        fill(img, r, c + 1, oldColor, newColor);
        fill(img, r, c - 1, oldColor, newColor);
    }
}

public class Q733 {
    
}
