import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class FP01Functional {

 static List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

    public static void main(String[] args) {

      

        printAllNumbersInListFunctional(numbers);

        System.out.println("*** Even Numbers ***");

        printAllEvenNumbersInListFunctional(numbers);
    }

    private static void print(int number){
        System.out.println(number);
    }


    



    

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //convert to stream of elements
        numbers.forEach(FP01Functional::print);
        //How to loop the numbers?
//        for(int number:numbers) {
//            System.out.println(number);
//        }
    }

    private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream() //convert to stream
                .filter(number -> number % 2 == 0) //lambda expression
                .forEach(System.out::println); //Method Reference
    }

}

