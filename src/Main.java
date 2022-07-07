public class Main {

    public static void main(String[] args){
        BmiService service = new BmiService();
        int wheight = 75; //принимает значение в кг.
        double height = 1.82; //принимает значение в м, поэтому тип double
        double bmi = service.calculate(wheight, height);

        System.out.println(bmi);
        }
    }
