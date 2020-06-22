public class SmallerSmallest {
    public static void main(String[] args) {

        double[] myArray = new double[5];

        myArray[0] = 5.6;
        myArray[1] = 24.5;
        myArray[2] = 2.4;
        myArray[3] = 54.2;
        myArray[4] = 15.5;

        double min = myArray[0];
        double minPlusOne = myArray[1];
        int indexOfMin = 0;
        int indexOfMinPlusOne = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
                indexOfMin = i;}
                else if (myArray[i] < minPlusOne){
                    min = myArray[i];
                    indexOfMinPlusOne = i;
                }
            }
        System.out.println("current MIN Value equals: "+ myArray[indexOfMin]);
        System.out.println("next minimum value in line equals: "+ myArray[indexOfMinPlusOne]);
    }
}




