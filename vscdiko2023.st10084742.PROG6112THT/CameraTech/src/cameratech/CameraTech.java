/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameratech;

/**
 *
 * @author Vuyani
 */
public class CameraTech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        
        
        
        double[][] reportPrices = new double [3][2];
        double[] resultsPrices = new double [3];
        
        
        reportPrices[0][0] = 10500;
        reportPrices[0][1] = 8500;
        reportPrices[1][0] = 9500;
        reportPrices[1][1] = 7200;
        reportPrices[2][0] = 12000;
        reportPrices[2][1] = 8000;
       
        resultsPrices[0] = reportPrices[0][0] - reportPrices[0][1];
        resultsPrices[1] = reportPrices[1][0] - reportPrices[1][1];
        resultsPrices[2] = reportPrices[2][0] -  reportPrices[2][1];
        
        String printCanon = "CANON";
        String printSony = "SONY";
        String printNikon = "NIKON";
             
        
        
        
        
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\t\tMIRRORLESS\t\t\tDSLR");
        System.out.println("CANON\t\tR " + reportPrices[0][0] + "\t\t\tCANON R " + reportPrices[0][1]); 
        System.out.println("SONY\t\tR " + reportPrices[1][0] + "\t\t\tSONY  R " + reportPrices[1][1]);
        System.out.println("NIKON\t\tR " + reportPrices[2][0] + "\t\t\tNIKON R " + reportPrices[2][1]);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("CANON\t R " + resultsPrices[0]);
        if(resultsPrices[0] >= 2500){
            System.out.println(" ***");
        } else {
            System.out.println();
        }
        System.out.print("SONY\t R " + resultsPrices[1]);
        if(resultsPrices[1] >= 2500){
            System.out.println(" ***");
        } else {
            System.out.println();
        }
            System.out.print("NIKON\t R " + resultsPrices[2]);
        if(resultsPrices[2] >= 2500){
            System.out.println(" ***");
        } else {
            System.out.println();
        }
            
        
        
        System.out.print("CAMERA WITH THE MOST COST DIFFERENCE: ");
        if(resultsPrices[0] > resultsPrices[1] && resultsPrices[0] > resultsPrices[2]){
            System.out.println(printCanon);
        }else if(resultsPrices[1] > resultsPrices[0] && resultsPrices[1] > resultsPrices[2]){
            System.out.println(printSony);
        }else{
            System.out.println(printNikon);
        }
        System.out.println("-----------------------------------------------------------------------");
        
     }
    
}



/*
References:
Ihechikara Vincent Abba. 2014. 2d array in java – Two-dimensional and nested arrays, August 10, 2022. Available at: https://www.freecodecamp.org/news/2d-array-in-java-two-dimensional-and-nested-arrays/ Accessed 10 October 2023
 
*/
