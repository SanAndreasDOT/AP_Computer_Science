package Q1.Working_In_Progress__TODO;

import java.util.Scanner;

public class LP_3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Birth Year (YYYY): ");
        int byear = input.nextInt();
        System.out.print("Enter Your Birth Month (MM): ");
        int bmonth = input.nextInt();
        System.out.print("Enter Birth Day (DD): ");
        int bday = input.nextInt();
        System.out.print("Enter the current year (YYYY): ");
        int cyear = input.nextInt();
        System.out.print("Enter the current month (MM): ");
        int cmonth = input.nextInt();
        System.out.print("Enter current day (DD): ");
        int cday = input.nextInt();

        int yearalive = byear - cyear * 365;
        int yearsleep = 2920;

       // test output: System.out.println(yearalive);

// link to doc: https://docs.google.com/document/d/1oh34kUrF8Yq5dRirVuPYuGGFUIIvuY13/edit

// days alive as of 12/15/2024 :6,048 days ( something is off with this number I think)
// year | year * 365 = day (math above doesn't add up to what I have calculated here)
// month | year * 30.417 = day (I haven't found a use for this yet ill probably need it  later)
// 8 hours of sleep in a day means 2920 hours of sleep in a year, which means 2920/ 24=121.6 days of sleep ( times back to now - 2007)
// or 4 months and 1 day of sleep approximately (according to google)




    }
}
/*
byear then cyear
C:\Users\schoonover.j\.jdks\openjdk-21.0.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=54850:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\schoonover.j\OneDrive\Documents\Java Projects (Windows 11)\out\production\Java Projects (Windows 10)" Q1.Working_In_Progress__TODO.LP_3_9
Enter Your Birth Year (YYYY): 2007
Enter Your Birth Month (MM): 05
Enter Birth Day (DD): 25
Enter the current year (YYYY): 2024
Enter the current month (MM): 12
Enter current day (DD): 15
-736753

Process finished with exit code 0
========================================
cyear then byear
C:\Users\schoonover.j\.jdks\openjdk-21.0.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=54886:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\schoonover.j\OneDrive\Documents\Java Projects (Windows 11)\out\production\Java Projects (Windows 10)" Q1.Working_In_Progress__TODO.LP_3_9
Enter Your Birth Year (YYYY): 2007
Enter Your Birth Month (MM): 05
Enter Birth Day (DD): 25
Enter the current year (YYYY): 2024
Enter the current month (MM): 12
Enter current day (DD): 15
-730531

Process finished with exit code 0
 */