package pacakge.com.OOD.Factory;

public class Factory extends Phone{
    int Ram;
    int Storage;
    public Factory(int Ram,int Storage)
    {
        this.Ram=Ram;
        this.Storage=Storage;
         //print(Ram,Storage);

    }
    protected void print()
    {
        print(Ram,Storage);
    }

}
