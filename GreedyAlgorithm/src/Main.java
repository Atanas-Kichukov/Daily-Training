import java.util.*;

//Given two integer arrays A and B of size N. There are
// N gas stations along a circular route, where the amount of gas at station i is A[i].
//You have a car with an unlimited gas tank and it costs
// B[i] of gas to travel from station i to its next station
// (i+1). You begin the journey with an empty tank at one of the gas stations.
//Return the minimum starting gas station's index if you can
// travel around the circuit once, otherwise return -1.
//You can only travel in one direction. i to i+1, i+2, ... n-1, 0, 1, 2..
// Completing the circuit means starting at i and ending up at i again.
//Return the minimum starting gas station's index if you can travel around the circuit once,
// otherwise return -1.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputGas = scanner.nextLine().split("\\s+");

        int[] refiledGas = new int[inputGas.length];
        for (int i = 0; i < refiledGas.length; i++) {
            refiledGas[i] = Integer.parseInt(inputGas[i]);
        }

        String[] inputReqGas = scanner.nextLine().split("\\s+");

        int[] neededGas = new int[inputReqGas.length];
        for (int i = 0; i < neededGas.length; i++) {
            neededGas[i] = Integer.parseInt(inputReqGas[i]);
        }
        int sum = 0;
        int minFuel = 0;
        int fuelInTank= 0;
        for (int i = 0; i < refiledGas.length; i++) {
            sum += refiledGas[i] - neededGas[i];
            fuelInTank += refiledGas[i] - neededGas[i];

            if(fuelInTank<0){
                minFuel = i + 1;
                fuelInTank = 0;
            }
        }
        if(sum<0){
            System.out.println(-1);
        }
        System.out.println(minFuel);
    }
}