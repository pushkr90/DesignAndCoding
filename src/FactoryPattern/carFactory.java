package FactoryPattern;

public class carFactory {
    public Vehicle getModel(String Model)
    {
        if(Model=="Mercedes")
        {
            return new Mercedes();
        }
        else if(Model=="BMW")
        {
            return new BMW();
        }


        else{
            return new Audi();
        }

    }

}
