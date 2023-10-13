import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Run {

    public Run(){
            VirtualPet p = new VirtualPet();
            p.takeabeat(3000);
            int s = options("Are you perhaps....the marshland guide?", "Yes", "...No", "What is that??");
            if (s == 0){
                p.respondPositively();
                p.takeabeat(2000);
                p.setMessage("I need help travelling across the marshland."); 
            } else if (s == 1){
                p.setFace("normal");
                p.setMessage("I see...");
                p.takeabeat(2000);
                int v = options("You can still help me though, right?", "Yes", "Yes", "Yes");
                if (v == 0 || v == 1 || v == 2){
                    p.respondPositively();
                    p.takeabeat(2000);
                    p.setMessage("I need help travelling across the marshland.");
                }
            } else {
                p.setFace("annoyed");
                p.takeabeat(2000);
                p.setMessage("A guide. For the marshlands. You know, the place we're in right now?");
                p.takeabeat(3000);
                p.setMessage("It doesn't matter. I need help travelling across the marshland.");
            }

            p.takeabeat(3000);
            p.setFace("marshland");
            p.setMessage("These are the marshlands");
            
            p.takeabeat(3000);
            String ans = getAnswer("I");
            if(ans.equalsIgnoreCase("Good")){
                p.respondPositively();
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
    
    public int options(String o, String a, String b, String c){
        Object[] options = {a,
                    b,
                    c};
        int n = JOptionPane.showOptionDialog( new JFrame(), o, "Who are you?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);
            return n;
    }

}
