package src.Interface;

class Calculate implements Calculation {


    Calculate(String customTitle){
        System.out.println(customTitle);
    }

    Calculate(){
        String title = "Out Put ";
        System.out.println(title);
    }


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
