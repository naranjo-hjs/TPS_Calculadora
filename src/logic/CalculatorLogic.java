/**
 * In Gooogle Style
 *  
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
    
    public double add(double number1, double number2){
        return number1 + number2;
    }
    
    public double subtract(double number1, double number2){
        return number1 - number2;
    }
    
    public double multiply(double number1, double number2){
        return number1 * number2;
    }
    
    public double divide(double number1, double number2){
        return number1 / number2;
    }
    
    public double square(double number1){
        return Math.pow(number1, 2.0);
    }
    
    public double squareRoot(double number1){
        return Math.sqrt(number1);
    }
    
    public void functionMemory(double number1){
        this.memory = number1;
    }
    
    public void functionMemory_plus(double number1){
        this.memory += number1;
    }
    
    public void functionMemory_minus(double number1){
        this.memory -= number1;
    }
    
    public double functionMemory_recall(){
        return memory;
    }
    
    public void functionMemory_clear(){
        this.memory = 0;
    } 
}
