import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[][] img = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int[][] expected = new int[][]{{2,2,2},{2,2,0},{2,0,1}};

        Assertions.assertArrayEquals(expected, solution.floodFill(img, 1, 1, 2));
    }
}

