package org.example;

public class MathLibrary {
    
    
    public static int multiply(int x, int y) throws IllegalArgumentException {
        
        
        int product = x * y;
        if (product / x != y) {
            throw new IllegalArgumentException("No se puede realizar la multiplicación, el resultado es más grande que el límite de enteros");
        }
        
        return x * y;
        
    }
    public static long multiply(long x, long y) {
        return x * y;
    }
}

