public class arrayExc {
    public static void main(String[] args) {
        Main myObj = new Main();
        int index = 0;

        while(index < myObj.numbers.length) {
            System.out.println("Value of item in array is: " + myObj.numbers[index]);
            index++;
        }

        for (int i : myObj.numbers) {
            System.out.println("\tValue of item in array is: " + i);
        }

        
    }

}
