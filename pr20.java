class pr20
{
    public static void main(String [] args){
        square o=new square();
        circle o1=new circle();
        o.dis_sp();
        o.dis_sq();
        o.dis_Rec();
        o1.dis_sp();
        o1.dis_circ();
    }
}
class shape{
void dis_sp(){
    System.out.println("Thi is shape");
    
}
}
class Rectectangle extends shape{
void dis_Rec(){
    System.out.println("This is rectangle");
}

}
class circle extends shape{
void dis_circ(){
    System.out.println("Thi is circle");
    
}
}
class square extends Rectectangle {
void dis_sq()
{
    System.out.println("Thi is square");
    
}
}
