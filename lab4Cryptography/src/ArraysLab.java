public class ArraysLab
{
    public static void main(String[] args)
    {
        int position = 19;       //will be plus one as arrays start at zero so it will be in pos 3
        int currentSize = 7;
        int newElement = 69;

        int values [] = new int[20];
        values[0] = 19;
        values[1] = 23;
        values[2] = 94;
        values[3] = 56;
        values[4] = 75;
        values[5] = 12;
        values[6] = 3;

        insert(values,currentSize,position,newElement);

        for(int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }

    public static int[] insert(int [] values, int currentSize, int pos, int newElement)
    {
        if (currentSize<values.length)
        {
            for (int i = currentSize - 1; i >= pos; i--)
            {
                values[i+1] = values[i]; //moving down the array
            }
            values[pos] = newElement;   //occupying the space left behind
            currentSize++;
        }
        return values;
    }
}