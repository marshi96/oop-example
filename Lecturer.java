/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author User
 */
public class Lecturer implements Speaker {
    @Override
    public void speak()
    {
        System.out.println("speak");
    }
    public void teach()
    {
        
        System.out.println("teach");
    }
}
