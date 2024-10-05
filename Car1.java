class Car1 {
     private String modelName;
     private String owner;
     private int regNumber;

     public Car1(String modelName,String owner,int regNumber) {
        this.modelName = modelName;
        this.owner = owner;
        this.regNumber = regNumber;
     }
        //declaration public methods 
        public void startEngine(){
           System.out.println("car can be started..");
        }
        public void accelarte(){
           System.out.println("car can be accelarted..");
        public void stop(){
            System.out.println("car can be stopped..");
        }

        //pirnt the attributes
        public void showCarInformation(){
            System.out.println("the car is owned by " + owner);
            System.out.println("the car model is " + modelName);
            System.out.println("the regNumber is " + regNumber);

        }
        //main method
        public static void main(String[] var0) {
            Car1 myCar = new Car1("BMW","sheetal",1234);
            myCar.startEngine();
            myCar.accelarte();
            myCar.stop();

            //display the car infomation
            myCar.showCarInformation();
        }


}
