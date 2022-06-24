import java.util.ArrayList;

    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue (int myValue) {
            this.myValue = myValue;
        }
    }


public class Main {

    public static void main(String[] args) {

        String[] strArray = new String [10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

        ArrayList<IntClass> IntClassArrayList = new ArrayList<IntClass>();
        IntClassArrayList.add(new IntClass(54));

        Integer integer = new Integer (54);
        Double doubleValue = new Double (12.25);

        ArrayList <Integer> intArrayLIst = new ArrayList<Integer>();
//        for(int i = 0; i<= 10; i++) {
//            intArrayLIst.add(Integer.valueOf(i));
//        }
//
//        for(int i = 0; i<= 10; i++) {
//            System.out.println(i + "-->" + intArrayLIst.get(i).intValue());
//        }

        Integer myIntValue = 54;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl <= 10.0; dbl = dbl + 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i= 0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }



    }
}
