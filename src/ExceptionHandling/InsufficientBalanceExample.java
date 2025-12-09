package ExceptionHandling;

 class InsufficientBalanceExample extends Exception {
    public InsufficientBalanceExample(String message){
        super(message);
    }

}
