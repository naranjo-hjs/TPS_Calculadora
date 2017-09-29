/**
 * @author Ignacio
 * Jose Ignacio Herrera Martinez
 * 201356054
 * 3743 - Ingenieria de Sistemas
 * Universidad del Valle
 */

package logic;

public class CalculatorLogic {
    private double memory;
    
    public CalculatorLogic(){
        memory = 0;
    }
    
    public double Add(double number1, double number2){
        return number1 + number2;
    }
    
    public double Subtract(double number1, double number2){
        return number1 - number2;
    }
    
    public double Multiply(double number1, double number2){
        return number1 * number2;
    }
    
    public double Divide(double number1, double number2){
        return number1 / number2;
    }
    
    public double Square(double number1){
        return Math.pow(number1, 2.0);
    }
    
    public double SquareRoot(double number1){
        return Math.sqrt(number1);
    }
    
    public void FunctionMemory(double number1){
        this.memory = number1;
    }
    
    public void FunctionMemory_plus(double number1){
        this.memory += number1;
    }
    
    public void FunctionMemory_minus(double number1){
        this.memory -= number1;
    }
    
    public double FunctionMemory_recall(){
        return memory;
    }
    
    public void FunctionMemory_clear(){
        this.memory = 0;
    }
  
    
}
