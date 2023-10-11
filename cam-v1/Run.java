import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Run {

    public Run(){
            VirtualPet p = new VirtualPet();
            p.takeabeat(2000);
            String ans = getAnswer("How are you?");
            if(ans.equalsIgnoreCase("Good")){
                p.respondPositively();
            }
            p.takeabeat(2000);
            int s = options("Should I go to sleep?");
            if (s == 0){
                p.agree();
                p.sleep();
            } else if (s == 1){
                p.agree();
            } else {
                p.setMessage("Okay. Goodnight.");
                p.sleep();
            }
            
            /*p.exercise();
            p.exercise();
            p.exercise();
            System.out.println(p.hunger());
            p.sleep();
            p.feed();*/

            

            }

        

    public static void main(String[] args){
        new Run();
        
    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
    );
        return s;
    }
    
    public int options(String o){
        Object[] options = {"Yes",
                    "No",
                    "Whatever you feel like"};
        int n = JOptionPane.showOptionDialog( new JFrame(), o, "A Silly Question",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);
            return n;
    }

}
