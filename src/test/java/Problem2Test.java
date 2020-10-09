import org.junit.Test;

/*Tests in ascending order*/

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        // add your tests here

        Problem2 test = new Problem2();
        int[] testOne = {3,2,1};
        int[] testTwo = {2,3,1};
        int[] testThree = {9,5,2};
        int[] testFour = {4,4,4};
        int[] testFive = {0,4,4};

        test.bubbleSort(testOne);
        test.bubbleSort(testTwo);
        test.bubbleSort(testThree);
        test.bubbleSort(testFour);
        test.bubbleSort(testFive);

    }
}

// Hii. I used geeksforgeeks to figure out how to do my test. I kept getting an error when trying to call the bubbleSort method in class problem2 and couldn't figure out why.
// Here is the link:https://www.geeksforgeeks.org/bubble-sort/ I used the "driver method test above" section in java