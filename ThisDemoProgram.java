class ThisDemoProgram{

    int a ;
    int b ;

    public void setData(int a , int b){

        this.a = a;
        this.b = b;

    }

    public void getData(){

        System.out.println("A = "+this.a+" B = "+this.b);

    }

    public static void main(String[] args) {
        
            ThisDemoProgram obj = new ThisDemoProgram();
            obj.setData(10,20);
            obj.getData();

    }

}