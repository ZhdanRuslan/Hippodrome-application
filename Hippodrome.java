package zhdan.ruslan.hippodrome;
import java.util.ArrayList;

public class Hippodrome
{
    private ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static void main(String[] args)
    {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Grom", 3, 0));
        game.getHorses().add(new Horse("Veter", 3, 0));
        game.getHorses().add(new Horse("Molnia", 3, 0));

        game.run();
        game.printWinner();
    }

    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            move();
            print();
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                /*NOP*/
            }
        }
    }

    public void move()
    {
        for (Horse h : this.getHorses())
        {
            h.move();
        }
    }

    public void print()
    {
        for (Horse h : this.getHorses())
        {
            h.print();
            System.out.println("\n");
        }
    }

    public Horse getWinner()
    {
        Horse winner = null;

        for (Horse h : getHorses())
        {
            if (winner == null)
            {
                winner = h;
            } else
            {
                if (winner.getDistance() < h.getDistance())
                {
                    winner = h;
                }
            }
        }
        return winner;
    }

    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}