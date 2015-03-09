package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String msg="";
         String fullName ="";
         String lastName ="";
        do{
       fullName = JOptionPane.showInputDialog("Enter full name:");
       
        try{
        lastName = nameService.extractLastName(fullName);
        
        msg = "Your last name is: " + lastName;
        }catch(MyCustomException e){
        
        }
        }while(msg.equals("") || lastName.equals(""));
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
