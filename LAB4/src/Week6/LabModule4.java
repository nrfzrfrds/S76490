/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author user
 */
public class LabModule4 {
    public static void main(String[] args) {
        double[] gpa = {2.5, 3.2, 3.0};
        double cgpa, total_gpa = 0;
        int total_sem = gpa.length;
        int i = 0;
        
        while (i < gpa.length){
            total_gpa += gpa[i];
            i++;
        }
        
        cgpa = total_gpa / total_sem;
        System.out.printf("Total gpa "+total_gpa + "\nYour cgpa %.2f", cgpa);
    }
    
}
