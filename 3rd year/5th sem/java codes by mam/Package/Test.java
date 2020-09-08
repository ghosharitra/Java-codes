import static java.lang.System.*;//static import
import cse3a.OriginalClass;
import cse3a.SubClassInSamePackage;
import cse3a.NonSubClassInSamePackage;
import cse3a.SubClassInDifferentPackage;
import cse3a.NonSubClassInDifferentPackage;
public class Test{
public static void main(String args[]){
SubClassInDifferentPackage obj=new SubClassInDifferentPackage();
obj.printVar();

SubClassInSamePackage obj1=new SubClassInSamePackage();
obj1.printVar();
out.println("HELLO");
}

}
