public class Shape {
   protected String color;
    protected String bordercolor;
    protected int radius;
    protected int width;
   protected int height;
    protected int a;
    protected int b;
    protected int c;
    public static void main(String[] args) {
        Shape[] shapes = new Shape[7];
        shapes[0] = new Triangle(3,4,5,"white","blue");
        shapes[1] = new Triangle(3,6,5,"green","blue");
        shapes[2] = new Circle(3,"red","orange");
        shapes[3] = new Circle(4,"purple","blue");
        shapes[4] = new Rectangle(2,5,"black","blue");
        shapes[5] = new Rectangle(5,6,"brown","blue");
        shapes[6]= new Rectangle(4,5,"red","yellow");
        for (int i =0;i< shapes.length;i++){
          double  s= ((Properties) shapes[i]).getSquare();
          String s1 = String.format("%.1f",s);
          double p =((Properties) shapes[i]).getPerimeter();
            String p1 = String.format("%.1f",p);
          String g = ((Shape) shapes[i]).color;
            String k = ((Shape) shapes[i]).bordercolor;
            System.out.println("Площадь: "+s1+ " Периметр: "+p1+" Цвет: "+g+" Цвет границы: "+k);
        }
    }
}
interface Properties{
    double getSquare();
    double getPerimeter();
}
 class Circle extends Shape implements Properties {
    public Circle(int radius,String color,String bordercolor){
        this.radius=radius;
        this.bordercolor=bordercolor;
        this.color=color;
    }
    public double getSquare(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
 class Rectangle extends Shape implements Properties {
    public Rectangle(int width,int height,String color,String bordercolor){
        this.width=width;
        this.height=height;
        this.bordercolor=bordercolor;
        this.color=color;
    }
    public double getSquare(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
}
 class Triangle extends Shape implements Properties {
    public Triangle(int a,int b,int c,String color,String bordercolor){
        this.a=a;
        this.b=b;
        this.c=c;
        this.bordercolor=bordercolor;
        this.color=color;
    }
    public double getSquare(){
        int p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getPerimeter(){
        int p=(a+b+c)/2;
        return p*2;
    }
}
