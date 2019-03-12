public class TimeTable
{
    private final int DAYS = 5;
    private final int HOURS = 9 ;  // 9 hours per day

    private String[] days =
            {
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday"
            };

    private String[] hours =
            {
                    "09:00",
                    "10:00",
                    "11:00",
                    "12:00",
                    "13:00",
                    "14:00",
                    "15:00",
                    "16:00",
                    "17:00"
            };

    private ClassDetails[][] grid;

    public TimeTable()
    {
        grid = new ClassDetails[DAYS][HOURS];
        // the grid will have null values
    }

    public void set(int day, int hour, ClassDetails details)
    {
        grid[day][hour] = details;
        // store details at the specified position in the grid
    }

    public void display()
    {
        // display the grid
        System.out.printf("%15s", "");
        for (int i=0; i < hours.length; i++)
        {
            System.out.printf("%-20s",hours[i]);
        }
        System.out.println();

        for (int i = 0; i < DAYS; i++)
        {
            System.out.printf("%-15s",days[i]);

            for (int j = 0; j < HOURS; j++)
            {
                System.out.printf("%-20s", grid[i][j]);
            }
            System.out.println("\n");
        }
    }



    public ClassDetails get(int day, int hour)
    {
        ClassDetails details = grid[day][hour];
        return details;
        // returns the object at the specified position in the grid
    }

    public int getNumberOfClassesFor(String name) //e.g. get number of Algorithms classes
    {
        int numberOfClasses = 0,currentInt = 0;
       // for(int numberofClasses; numberOfClasses < )
        return numberOfClasses;
    }
/*
    public int getNumberOfFreeSlots()
    {
        return numberOfFreeSlots;
    }*/
}
