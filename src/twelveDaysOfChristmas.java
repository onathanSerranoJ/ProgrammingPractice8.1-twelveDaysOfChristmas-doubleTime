public class twelveDaysOfChristmas
{
    public static void main(String[] args)
    {
        daysOfChristmas(12);
    }

    public static void daysOfChristmas(int n)
    {
        String output = "";
        if(n==1)
        {
            output = "On the 1st day of christmas my true love gave to me\n";
        }
        else if(n==2)
        {
            output = "On the 2nd day of christmas my true love gave to me\n";
        }
        else if(n==3)
        {
            output = "On the 3rd day of christmas my true love gave to me\n";
        }
        else
        {
            output ="On the " + n + "th day of christmas my true love gave to me\n";
        }

        switch (n) {
            case 12:
                output += "Twelve drummers drumming,\n";
            case 11:
                output += "Eleven pipers piping,\n";
            case 10:
                output += "Ten lords a leaping,\n";
            case 9:
                output += "Nine ladies dancing,\n";
            case 8:
                output += "Eight maids a milking,\n";
            case 7:
                output += "Seven swans a swimming,\n";
            case 6:
                output += "Six geese a laying,\n";
            case 5:
                output += "Five golden rings,\n";
            case 4:
                output += "Four calling birds,\n";
            case 3:
                output += "Three French hens,\n";
            case 2:
                output += "Two turtle doves,\n";
            case 1:
                output += "A partridge in a pear tree.\n";
        }

        if(n > 1)
            daysOfChristmas(n - 1);

        System.out.println(output);
    }
}
