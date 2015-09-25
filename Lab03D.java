//Lab03Dst.java
//The Visible Average Program
//This is the student, starting version, of Lab 03D.

public class Lab03D
{
    public static void main(String args[])
    {
        System.out.println("Lab 03D");
        System.out.println();
        
        int Int1 = 12;
        int Int2 = 24;
        int Int3 = 36;
        int Int4 = 48;
        int Int5 = 60;
        
        double D1 = 12.34;
        double D2 = 24.68;
        double D3 = 36.9;
        double D4 = 48.12;
        double D5 = 66.6;
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        int intSum = Int1 + Int2 + Int3 + Int4 + Int5;
        int intAverage = (Int1 + Int2 + Int3 + Int4 + Int5)/5;
        
        double dSum = D1 + D2 + D3 + D4 + D5;
        double dAverage = (D1 + D2 + D3 + D4 + D5)/5;
        
        System.out.println("Integer 1: " + Int1);
        System.out.println("Integer 2: " + Int2);
        System.out.println("Integer 3: " + Int3);
        System.out.println("Integer 4: " + Int4);
        System.out.println("Integer 5: " + Int5);
        
        System.out.println("Integer Sum: " + intSum);
        System.out.println("Integer Average: " + intAverage);
        System.out.println();
        
        System.out.println("Real Number 1: " + D1);
        System.out.println("Real Number 2: " + D2);
        System.out.println("Real Number 3: " + D3);
        System.out.println("Real Number 4: " + D4);
        System.out.println("Real Number 5: " + D5);
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        
        System.out.println("Real Number Total: " + dSum);
        System.out.println("Real Number Average: " + dAverage);
    }
}