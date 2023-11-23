
import java.util.Scanner;


public class BMIImbran {
     static void CalculateBMI(float weight, float height) 
  {

    float BMI = ( 100 * 100 * weight ) / ( height * height ); 
    // multiplying 100 * 100 to convert cm to m

    System.out.println("\nYour BMI value: " + BMI);

    if(BMI < 18.5)
      System.out.println("You are underweight!");
    else if(BMI < 25)
      System.out.println("You are normal:)");
    else if(BMI < 30)
      System.out.println("You are overweight!");
    else
      System.out.println("You are obese!");

  } 

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("BMI CALCULATOR");
    System.out.print("Enter your weight in kg: ");
    float weight = sc.nextFloat();
    System.out.print("Enter your height in cm: ");
    float height = sc.nextFloat();

    CalculateBMI(weight, height);
  }

}

