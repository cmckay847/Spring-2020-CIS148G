/* Update the main below to:

     Create one Box object with length 5 and width 5
     Create another Box object with length 8 and width 10
     Print all about both objects

     Update the first Box so that it's width is 20
     Print out the area of the first Box object

     Update the second Box so that it's length is 5
     Print out all about the second Box

     Print out ONLY the width of both Box objects
     Print out ONLY the length of both Box objects
*/


public class BoxApp {

   public static void main (String[] args) {

      private int length;
      private int width;

      public Box() {
         length = 5;
         width = 20;

         public int getLength () {
            return length;
         }


         public int getWidth () {
            return width;
         }

         public void printArea() {
            System.out.println("The area of this box is " + (length * width) ) ;
         }
      }

      public Box2() {
         length = 5;
         width = 10;

         public int getLength () {
            return length;
         }


         public int getWidth () {
            return width;
         }

         public void printArea() {
            System.out.println("The area of this box is " + (length * width) ) ;
         }
      }


   }