/*Basal Metabolic Rate (BMR)*/
package app5;

import java.util.*;

public class App5 {

    public static void main(String[] args) {
        
        data a;
        a = new data();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Your Gender (man or Woman) = ");
        a.gender = scanner.next();
        
        System.out.print("Age = ");
        a.age = scanner.nextInt(); 
        
        System.out.print("Height = ");
        a.height = scanner.nextDouble();
        
        System.out.print("Weight = ");
        a.weight = scanner.nextDouble();
           
        
        switch (a.gender){
            
            case "man" :{
                System.out.println("Your Kcal = " + (88.362 +(13.397*a.weight)+(4.799*a.height)-(5.677*a.age)));
            } break;
                
            case "woman" :{
                System.out.print("Your Kcal = " + (447.593+(9.247*a.weight)+(3.098*a.height)-(4.330*a.age)));
            }break;
        
        }
        
    }
}
class data{
    double height;
    double weight;
    int age;
    String gender;   
}
