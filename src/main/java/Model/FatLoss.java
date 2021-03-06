package Model;

/**
 * Created by Markus on 10/11/15.
 */
public class FatLoss {

    private int vikt;

    private int height;

    private int age;

    private int bmr;

    public void setWeight(int w) {

        if(w <= 0) {
            throw new IllegalArgumentException();
        }
        this.vikt = w;
    }

    public void setHeight(int h) {

        if (h <= 0) {
            throw new IllegalArgumentException();
        }
        this.height = h;
    }

    public void setAge(int a)
    {
        if(a <= 0 || a>= 200)
        {
            throw new IllegalArgumentException();
        }
        this.age = a;
    }

    public double countCalories(int vikt, int height, int age){

        double kcal = 10 * vikt + 6.25 * height - 5 * age + 5;

        if (kcal <= 5) {
            throw new IllegalArgumentException();
        }
        return kcal;
    }

    public int countProtein(int vikt) //this method calculates the amount of protein per day
    {
        int protein = vikt*10;
        return protein;

    }

    public double countCarbs(double kcal)//this method calculates the amount of carbs per day
    {

        double carbs = (kcal*0.50)/4;

        return carbs;

    }
    public double countFats(double kcal)//this method calculates the amount of fats per day
    {
        double fats = (kcal*0.20)/9;
        return fats;
    }

    }
