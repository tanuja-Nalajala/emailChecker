package EmailChecker;

class BasicSpellChecker implements SpellChecker{
    public void checkSpelling(String emailMessage){
        if(emailMessage!=null){
            System.out.println("Checking Spelling");
        }
        else{
            throw new RuntimeException("An exception occurred");
        }
    }
}
