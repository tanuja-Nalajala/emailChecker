package EmailChecker;

import EmailChecker.BasicSpellChecker;

class EmailApplication {
    public static void main(String args[]){
        EmailClient emailClient=new EmailClient(new BasicSpellChecker());
        emailClient.sendEmail("Hey"+"this is my first email message");
        emailClient.sendEmail("hey"+"This is my second email message");
    }
}
