/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rahmahaula;

/**
 *
 * @author Acer
 */
public class Rahmahaula {
    
   int personAge;

   public Rahmahaula(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      personAge = age;
   }

   public int getAge( ) {
      System.out.println("Person's age is :" + personAge );
      return personAge;
   }

   public static void main(String []args) {
      
      Rahmahaula myName = new Rahmahaula( "rahma" );
      
      myName.setAge( 19 );

      myName.getAge( );
          
      System.out.println("Variable Value :" + myName.personAge );
   }
}