package zhdan.ruslan.hippodrome;

public class Horse
{
    private String name;
    private double speed;
    private double distance;

    public Horse(String n, double s, double d)
    {
        name = n;
        speed = s;
        distance = d;
    }

    public String getName()
    {
        return name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void move()
    {
        setSpeed(getSpeed() * Math.random() * 1.2);
        setDistance(getDistance() + getSpeed());
    }

    public void print()
    {
        String s = "";
        for (int i = 0; i < distance; i++)
        {
            s += ".";
        }
        s += getName();
        System.out.println(s);
    }
}
