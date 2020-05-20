import java.util.Scanner;

class Cuboid{
    
   int length,width,height,volume;

   public void setLength(int l)
   {
       this.length=l;
   } 
   public void setWidth(int w)
   {
       this.width=w;
   }
   public void setHeight(int h)
   {
       this.height=h;
   }
   public void volumeCube()
   {
       volume=length*width*height;
       System.out.println("Volume of cuboid "+volume);
   }

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     Cuboid cuobj=new Cuboid();
     int l,b,h;
     System.out.println("Enter length of cuboid:");
     l=sc.nextInt();

     System.out.println("Enter width of cuboid:");
     b=sc.nextInt();

     System.out.println("Enter height of cuboid:");
     h=sc.nextInt();

     cuobj.setLength(l);

     cuobj.setWidth(b);

     cuobj.setHeight(h);

     cuobj.volumeCube();

  }
}