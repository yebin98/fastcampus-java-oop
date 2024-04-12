import logic.BubbleSort;

import java.util.Arrays;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : main
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("sort = " + sort.sort(Arrays.asList(args)));

    }
}
