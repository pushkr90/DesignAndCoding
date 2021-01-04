package pacakge.com.OOD.parkingLot;

public class ParkingLot
{
    int[] arr;

    public ParkingLot(int big,int medium, int small)
    {
        arr=new int[3];
        arr[0]=big;
        arr[1]=medium;
        arr[2]=small;
    }

    public boolean check(int type)
    {
        int type1=type-1;
        if(arr[type1]-- >0)
        {
            return true;
        }
        return false;

    }
}
