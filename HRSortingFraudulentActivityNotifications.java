//public class HRSortingFraudulentActivityNotifications {
//}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HRSortingFraudulentActivityNotifications {

    static int checkMedian(int[] newArray, int nextDay) {
        int ind = newArray.length / 2;
        int median = newArray[ind];
        if (newArray.length % 2 == 0) median = (newArray[ind] + newArray[ind + 1]) / 2;

        //System.out.printf("Median: %d\n",median);
        if (nextDay >= (2 * median)) return 1;
        return 0;
    }

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int[] sorted = Arrays.copyOf(expenditure, expenditure.length);
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(expenditure));
        System.out.println(Arrays.toString(sorted));

        int notification = 0;
        for (int i = 0; i + d < expenditure.length; i++) {
            int[] newArray = Arrays.copyOfRange(expenditure, i, d + i);
            Arrays.sort(newArray);
            notification += checkMedian(newArray,expenditure[d+i]);
        }

        return notification;
    }

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = in.nextInt(), d = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(activityNotifications(arr, d));
    }
}

/*
 static int activityNotifications(int[] expenditure, int d) {

    int count = 0;
    // create freq array as exp <= 200 always
    //maintain a queue to find ontgoing and incoming exp
    //get median from freq array

    int freq[] = new int[201];
    Queue<Integer> q = new LinkedList<Integer>();

    for(int i=0;i<expenditure.length;i++)
    {
        while(i<d)
        {
            q.add(expenditure[i]);
            freq[expenditure[i]] = freq[expenditure[i]]+1;
            i++;
        }


        float median = getMedian(freq,d);

        if(expenditure[i] >= 2*median)
        {
            count++;
        }


        // removing outing going element freq
        int elem = q.remove();
        freq[elem] = freq[elem] - 1;

        // adding incoming element to freq
        q.add(expenditure[i]);
        freq[expenditure[i]] = freq[expenditure[i]]+1;
    }

    return count;
}

private static float getMedian(int[] freq,int d)
{
    if(d%2 == 1)
    {
        int center = 0;
        for(int i=0;i<freq.length;i++)
        {
            center = center + freq[i];

            if(center > d/2)
            {
                return i;
            }
        }
    }else{
        int count = 0;
        int first = -1;
        int second = -1;
        for(int i=0;i<freq.length;i++)
        {
            count = count + freq[i];

            if(count == d/2)
            {
                first = i;
            }else if(count > d/2)
            {
                if(first < 0 ) first = i;
                second = i;

                return ((float)first + (float)second)/2;
            }
        }
    }
    return 0f;
}
 */