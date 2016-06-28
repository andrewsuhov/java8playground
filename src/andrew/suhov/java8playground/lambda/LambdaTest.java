/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.lambda;

/**
 *
 * @author asuhov
 */
public class LambdaTest
{
    private int operate(int a, int b, MathOperation mathOperation)
    {
        return mathOperation.operation(a, b);
    }
    
    
    public static void main(String[] args)
    {
        LambdaTest lambdaTest = new LambdaTest();
     
        // explicit parameter type and no curly braces
        MathOperation addition = (int a, int b) -> a + b;
        // implicit parameter types and no curly braces
        MathOperation substraction = (a, b) -> a - b;
        // explicit parameter types and curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        
        System.out.println("10 + 5 = " + lambdaTest.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambdaTest.operate(10, 5, substraction));
        System.out.println("10 * 5 = " + lambdaTest.operate(10, 5, multiplication));
        
        // no parenthesis and no curly braces
        GreetingService greetingService1 = message -> System.out.println("Helol " + message);
        // parenthesis and curly braces
        GreetingService greetingService2 = (message) -> { 
            System.out.println("Helol " + message);
        };
        
        greetingService1.sayMessage("Bitch");
        greetingService2.sayMessage("Andrew");
    }
}
