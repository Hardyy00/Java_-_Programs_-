
class Add{

    void add(int a,int b,int c,int d,int e, int f){

        String build = (a>=0 ? "" : "-") + a;
        int sum = a;


        sum += addSum(b);
        sum+= addSum(c);
        sum+=addSum(d);
        sum += addSum(e);
        sum += addSum(f);

        build += buildString(b);
        build += buildString(c);
        build += buildString(d);
        build += buildString(e);
        build += buildString(f);


        System.out.println(build + "=" + sum);


    }

    int addSum(int a){

        if(a != 89890)   // Arbitrary value
            return a;
        else
            return 0;
    }

    String buildString(int integer){

        if(integer>=0 && integer!=89890)
            return "+" + integer;
        else if(integer<0)
            return "";

        return "";

    }

    void add(int a , int b, int c, int d, int e){

        add(a, b,c,d,e,89890);
    }

    void add(int a , int b, int c, int d){

        add(a, b,c,d,89890,89890);
    }

    void add(int a , int b, int c){

        add(a, b,c,89890,89890,89890);
    }

    void add(int a , int b){

        add(a, b,89890,89890,89890,89890);
    }


}
