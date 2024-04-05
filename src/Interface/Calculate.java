package src.Interface;

class Calculate implements Calculation {


    @Override
    public int Addition(int a,int b) {
        return a+b;
    }

    @Override
    public int Sub(int a,int b) {
        return a-b;
    }

    @Override
    public int multi(int a,int b) {
        return a*b;
    }

    @Override
    public int Div(int a,int b) {
        return a/b;
    }
}
