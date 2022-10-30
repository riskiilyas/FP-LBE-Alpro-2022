class Telephone implements Device{
   @Override
   public void turnOff() {
       System.out.println("Telephone Turned Off");
   }

   @Override
   public void turnOn() {
       System.out.println("Telephone Turned On");
   }
}