
class fourth{
public static void main(String args[]){
    int codeofproduct[]={1,2,3,4,5};
    int priceofproduct[]={200,2500,40,4,100};
    double bill=0,total=0,tax=0;
    

    for(int i=0;i<4;i++){
        int code=codeofproduct[i];
        double price=priceofproduct[i];
        switch(code)
        {
            case 1:
            tax=0.08*price;
            break;
            case 2:
            tax=0.12*price;
            break;
            case 3:
            tax=0.05*price;
            break;
            case 4:
            tax=0.075*price;
            break;
            case 5:
            tax=0.03*price;
            break;
        }
        bill=price+tax;
        System.out.println("Code"+code+"price"+bill);
        total+=bill;
    }
    System.out.println("Total bill :"+total);
}
}