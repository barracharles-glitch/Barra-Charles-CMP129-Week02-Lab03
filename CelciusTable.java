public class CelciusTable {
    public static void main(String args []){
        String table="";

        for (int i=0; i < 20; i++){
            table += (i+1) + "C | " + celciusCalc(i) + "F\n";
        }

        System.out.println("Celcius to Farenheight Table: \nCelcius | Farenheight\n" + table);
    }
    public static double celciusCalc(double f){
        double celcius;
        celcius = (0.55556) * (f - 32);
        return celcius;
    }
}

