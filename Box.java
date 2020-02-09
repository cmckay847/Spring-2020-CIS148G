public class Box{
  //instance members .. each object of type Box will have it's own set
  private int length;
  private int width;

  //CONSTRUCTOR methods

  //this constructor initializes length and width of new object to 5
  public Box() {
     length = 5;
     width = 5;
  }

 //this constructor initializes length and width of new object to the value stored in newlen and newwid
  public Box(int newlen, int newwid) {
     length = newlen;
     width = newwid;
  }

//MUTATOR methods

  //this method updates the length of the calling object
  public void setLength(int newlen){
     length = newlen;
  }

  //this method updates the width of the calling object
  public void setWidth(int newwid) {
     width = newwid;
  }

//ACCESSOR methods

  //this method returns the length of the calling object
  public int getLength() {
     return length;
  }

  //this method returns the width of the calling object
  public int getWidth() {
     return width;
  }

  //this method prints out length and width of the calling object
  public void printAll() {
    System.out.println("This box has a dimensions " + length + " x " + width);
  }

  //this method prints outthe area of the calling object
  public void printArea() {
    System.out.println("The area of this box is " + (length * width) ) ;
  }

}

