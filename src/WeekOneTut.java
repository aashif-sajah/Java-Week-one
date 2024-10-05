import java.util.*;

public class WeekOneTut {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int [] markArray = new int[6];

        for (int i = 0 ; i < markArray.length; i++){
            System.out.print("Enter your mark for subject " + (i+1) + ":");
            markArray[i] = scan.nextInt();
        }

        for (int mark = 0 ; mark <markArray.length;mark++){
            System.out.println("Your mark for subject " + (mark+1) + " is: " + markArray[mark]);
        }

         // Step 2: Count and categorize the marks
         categorizeMarks(marks);

         // Step 3: Calculate and print the average
         double average = calculateAverage(marks);
         System.out.println("Average of marks: " + average);
 
         // Step 4: Find and print the maximum mark
         int maxMark = findMax(marks);
         System.out.println("Maximum mark: " + maxMark);
 
         // Step 5: Find and print the minimum mark
         int minMark = findMin(marks);
         System.out.println("Minimum mark: " + minMark);
 
         // Step 6: Sort the marks in ascending order
         int[] sortedMarks = sortMarks(marks);
         System.out.print("Sorted marks: ");
         for (int mark : sortedMarks) {
             System.out.print(mark + " ");
         }
         System.out.println();

    }

    public static void categorizeMarks(int[] marks) {
        int fail = 0, pass = 0, twoTwo = 0, twoOne = 0, first = 0;

        for (int mark : marks) {
            if (mark < 40) {
                fail++;
            } else if (mark >= 40 && mark <= 49) {
                pass++;
            } else if (mark >= 50 && mark <= 59) {
                twoTwo++;
            } else if (mark >= 60 && mark <= 69) {
                twoOne++;
            } else if (mark >= 70) {
                first++;
            }
        }

        System.out.println("Marks below 40 (Fail): " + fail);
        System.out.println("Marks between 40 and 49 (Pass): " + pass);
        System.out.println("Marks between 50 and 59 (2:2): " + twoTwo);
        System.out.println("Marks between 60 and 69 (2:1): " + twoOne);
        System.out.println("Marks 70 and above (First): " + first);
    }
    // Step 3: Calculate the average
    public static double calculateAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / (double) marks.length;
    }

    // Step 4: Find the maximum mark
    public static int findMax(int[] marks) {
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // Step 5: Find the minimum mark
    public static int findMin(int[] marks) {
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // Step 6: Sort the marks in ascending order
    public static int[] sortMarks(int[] marks) {
        int[] sortedMarks = marks.clone();
        for (int i = 0; i < sortedMarks.length - 1; i++) {
            for (int j = 0; j < sortedMarks.length - i - 1; j++) {
                if (sortedMarks[j] > sortedMarks[j + 1]) {
                    // Swap
                    int temp = sortedMarks[j];
                    sortedMarks[j] = sortedMarks[j + 1];
                    sortedMarks[j + 1] = temp;
                }
            }
        }
        return sortedMarks;
    }

}
