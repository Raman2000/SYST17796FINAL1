/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author Owner
 */
public class FinalExam {

    double gross, net;
double calculateNet ( int hours, double rate, double tax)
{
    gross = hours * rate;
    net = gross-tax; 
    return net;
}
    public static void main(String[] args) {
        FinalExam e=new FinalExam();
        double salary= e.calculateNet(33, 349, 34);
        System.out.println(" Net Salary:" +salary);
    }
}
    
