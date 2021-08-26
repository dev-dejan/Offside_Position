package offside_Possiton;

public class Main {

	static boolean OffsidePosition(int[][] teams)
    {
        int i;
        int min = Integer.MAX_VALUE;
        for (i = 0; i < 11; i++)
        {
            if (teams[1][i] < min)
            {
                min = teams[1][i];
            }
        }

        int counter = 0;
        for (i = 0; i < 11; i++)
        {
            if (min >= teams[0][i])
            {
                counter++;
            }
        }
        if (counter < 2)
        {
            return true;
        }
        else return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(OffsidePosition(new int[][] { { 4, 80, 80, 80, 75, 60, 40, 30, 20, 30, 60 }, { 95, 78, 70, 60, 70, 50, 70, 50, 50, 40, 50 } }));
	}

}
