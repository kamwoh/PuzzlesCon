
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(System.in);
        int testcase = read.nextInt();
        for (int case_ = 0; case_ < testcase; case_++)
        {
            int n = read.nextInt(); //number of days
            int p = read.nextInt(); //number of parties
            boolean[] hartalDays = new boolean[n];
            int[] h = new int[p];
            for (int i = 0; i < h.length; i++)
            {
                h[i] = read.nextInt();
                int count = 1;
                while (true)
                {
                    int result = count * h[i];
                    if (result > n)
                        break;
                    if (result % 7 != 6 && result % 7 != 0)
                    {
                        hartalDays[result-1] = true;
                    }
                    count += 1;
                }
            }

            int output = 0;
            for (int i = 0; i < hartalDays.length; i++)
            {
                if (hartalDays[i])
                    output += 1;
            }
            System.out.println(output);
        }
    }
}
