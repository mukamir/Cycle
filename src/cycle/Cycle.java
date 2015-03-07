package cycle;

public class Cycle 
{
    private byte numberOfWheels;
    private float weight;

    private Cycle(byte numberOfWheels, float weight) 
    {
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }

    public Cycle()
    {
        this((byte)100,1000.0f);
    }   
   
        @Override
    public String toString() 
    {
        return "Cycle{" + "Number Of Wheels = " + numberOfWheels + ", Weight = " + weight + '}';
        
    }

}