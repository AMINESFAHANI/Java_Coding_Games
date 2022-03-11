/*
Input
        acidName: The name of the acid.
        acidCount: The number of drops of acid.
        waterCount: The number of drops of water
Output
        The percentage of acid in the solution (eg: 20%) and the acid name (if it is valid, else print "Unknown Acid").
        (Valid acid names: Hydrochloric, Sulfuric, Nitric, Citric)
        Round the the percentage to 1 decimal place (eg: 28.3%, 39.0%)
        Constraints
        Length of acidName > 0
*/

 import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class PercentageOfAmount {

        public String percentageOfAmount() {
            Scanner in = new Scanner(System.in);
            String acidName = in.nextLine();
            int acidCount = in.nextInt();
            int waterCount = in.nextInt();
//            String[] acidNames = new String[4];
//            acidNames[0]="Hydrochloric";
//            acidNames[1]="Sulfuric";
//            acidNames[2]="Nitric";
//            acidNames[3]="Citric";
            String[] acidNames = {"Hydrochloric", "Sulfuric", "Nitric", "Citric"};
            Arrays.sort(acidNames);
            //System.out.print(Arrays.toString(acidNames));
            if (!Arrays.asList(acidNames).contains(acidName)){
                acidName="Unknown";
            }
            double waterCount1 = waterCount;
            double d = 100*acidCount/(acidCount+waterCount1);

            return "The percentage of "+acidName+" Acid in the solution is "+String.format("%.2f",d)+"%";
        }
    }

