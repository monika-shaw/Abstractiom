package com.company;

 class Test6 extends Exception{
    class Test7
    {
        public static void main(String[] args) {
            try{
                throw new Test6();
            }
            catch (Test6 t)
            {
                System.out.println("Got test exception");
            }

            finally {
                System.out.println("Inside finally block");
            }
        }
    }
}
