class AllDataType{

    public static void main(String args[]){

        //Whole Number 
        byte age1 = 10;
        System.out.println("Byte Minimum Values ="+Byte.MIN_VALUE);
        System.out.println("Byte Maximum Values ="+Byte.MAX_VALUE+"\n");

        short age2 = 15;
        System.out.println("short Minimum Values ="+Short.MIN_VALUE);
        System.out.println("short Maximum Values ="+Short.MAX_VALUE+"\n");

        int age3 = 20;
        System.out.println("int Minimum Values ="+Integer.MIN_VALUE);
        System.out.println("int Maximum Values ="+Integer.MAX_VALUE+"\n");

        long age4 = 25;
        System.out.println("long Minimum Values ="+Long.MIN_VALUE);
        System.out.println("long Maximum Values ="+Long.MAX_VALUE+"\n");
       
        //Decimal Number
        float minValue = Float.MIN_VALUE;
        float maxValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value ="+minValue);
        System.out.println("Float Minimum Value ="+maxValue+"\n");

        double doubleMinValue = Float.MIN_VALUE;
        double doubleMaxValue = Float.MAX_VALUE;
        System.out.println("double Minimum Value ="+doubleMinValue);
        System.out.println("double Minimum Value ="+doubleMaxValue+"\n");

        //Character
        char initial ='z';
        System.out.println("char min  value ="+(int) Character.MIN_VALUE);
        System.out.println("char max value ="+(int) Character.MAX_VALUE+"\n");

        char heartSymbol =10084;
        char hindiChar = 2309;
        System.out.println(heartSymbol);
        System.out.println(hindiChar);

    }

}