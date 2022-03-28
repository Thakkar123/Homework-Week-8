package carpetCostCalc;

/* Program 17
3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
and it needs to initialize the fields.
Write the following methods (instance methods):
● Method named getTotalCost without any parameters, it needs to return the calculated total
cost to cover the floor with a carpet.
 */

public class Calculator {
    Floor floor;
    Carpet carpet;

// Constructor with two args with initialization

public Calculator(Floor floor,Carpet carpet)
    {
        this.floor=floor;
        this.carpet=carpet;
    }

// Instance method to calculate the total carpet cost
public double getTotalCost()
    {
       double carpetcost;
       carpetcost= floor.getArea()*carpet.getCost();
       return carpetcost;
    }
}
