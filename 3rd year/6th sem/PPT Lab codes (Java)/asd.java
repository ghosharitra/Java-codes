import java.util.Arrays;
interface a{
    void g();
}

class c {
    public void g(){
        System.out.println("inside c");
    }
}

class asd extends c implements a{

	public static void main(String[] args) {
    (new asd()).g();
    }
}