public class Arraysss {
    public static void main(String[] args) {
        String[] cars = new String[3];
        cars[0]="Mercedes";
        cars[1]="Supra";
        cars[2]="Lamborghini";
        for(int i = 0 ; i<cars.length ; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();
        String[] cars2 = cars.clone();
        System.out.println(cars2[2]);
        //2D arrays - array of arrays.

//        String[][] datatypes = new String[2][2];
//
//        datatypes[0][0] = "int";
//        datatypes[0][1] = "float";
//        datatypes[1][0] = "char";
//        datatypes[1][1] = "boolean";

        // Instead of assigning values to array we can directly assign values during declaring the array like:
        String[][] datatypes = {{"int","float"},
                                {"char","boolean"}
                                };

        for(int i=0; i<datatypes.length ; i++){
            System.out.println();
            for(int j=0 ;j<datatypes[i].length ; j++){
                System.out.print(datatypes[i][j]+" ");
            }
        }


    }
}
