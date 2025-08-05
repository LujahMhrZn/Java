public class ArrayExample {
    public static void main(String[] args){
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        // for(int i = 0; i < myArray.length; i++){
        //     System.out.println("Element at index " + i + ": " + myArray[i]);
        // }
         if(myArray.length == 0){
            System.out.println("No array passed");
        }else{
            for(int arg : myArray){
                System.out.println(arg);
            }
        }
    }
}