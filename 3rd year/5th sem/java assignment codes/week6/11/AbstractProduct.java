package qeleven;
abstract public class AbstractProduct{

protected int productId;
protected String name;
protected String description;

public AbstractProduct(int productId,String name,String description){
this.productId=productId;
this.name=name;
this.description=description;
}

abstract public void display();

}