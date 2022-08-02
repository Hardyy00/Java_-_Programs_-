package challenge35.com.hardik;

// This code is used to demonstrate the meaning of Scope.
// Usually it's a bad practice to do all of this.
public class X {

    private int x;

    public X(int x){
        this.x = x;
    }

    public X(){
        x = 0;
    }

    public void x(){

        System.out.println("Table of '" + this.x + "' :");

        for(int x=1; x<=12; x++){

            System.out.println(this.x + " x " + x + " = " + this.x*x);
        }
    }



    public void x(int x){

        System.out.println("Table of '" + x + "' : ");

        for(int y = 1; y<=12; y++){

            System.out.println(x + " x " + y + " = " + x*y);

        }

    }
}
