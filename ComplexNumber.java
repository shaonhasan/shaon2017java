/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.demo;

/**
 *
 * @author Asus
 */
public class ComplexNumber {
    private double real;
    private double imagenary;
    
    public ComplexNumber(double r, double i){
        real = r;
        imagenary = i;
        
    }
    public double getreal(){
        return real;
    }
    public double getimagenary(){
        return imagenary;
    }
    public ComplexNumber add(ComplexNumber b){
        double cReal;
        double cImagenary;
        
        ComplexNumber a = this;
        cReal = a.real + b.real;
        cImagenary = a.imagenary + b.imagenary;
        ComplexNumber c = new ComplexNumber(cReal,cImagenary);
        
        return c;
        }
    public ComplexNumber substract(ComplexNumber b){
        double cReal;
        double cImagenary;
        
        ComplexNumber a = this;
        cReal = a.real - b.real;
        cImagenary = a.imagenary - b.imagenary;
        ComplexNumber c = new ComplexNumber(cReal,cImagenary);
        
        return c;
        }
    public ComplexNumber multiply(ComplexNumber b){
        double cReal;
        double cImagenary;
        
        ComplexNumber a = this;
        cReal = a.real * b.real - a.imagenary * b.imagenary;
        cImagenary = a.real * b.imagenary + a.imagenary * b.real;
        ComplexNumber c = new ComplexNumber(cReal,cImagenary);
        
        return c;
        }
    public ComplexNumber devide(ComplexNumber b){
        double cReal;
        double cImagenary;
        
        ComplexNumber a = this;
        cReal = a.real / b.real;
        cImagenary = a.imagenary / b.imagenary;
        ComplexNumber c = new ComplexNumber(cReal,cImagenary);
        
        return c;
        }
        public String toString(){
            return real + " + " + imagenary +"i ";
        
    }

}