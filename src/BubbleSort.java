import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;

public class BubbleSort extends JPanel {
    boolean swapped = true;
    int comparison;
    public int executeBubbleSort(ArrayList<Integer> nums, Draw draw, App app) throws InterruptedException {
        // Start bubble sorting
        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) > nums.get(i+1)) {
                    Collections.swap(nums, i, i+1);
                    comparison++;
                    swapped = true;

                    Thread.sleep(10);
                    draw.removeAll();
                    draw.updateArray(nums);
                    draw.revalidate();
                    draw.paintImmediately(0,30,870,532);;
                }
            }
        }
        swapped = true;
        app.needReset = true;
        //System.out.println(comparison);
        return comparison;
    }
}
