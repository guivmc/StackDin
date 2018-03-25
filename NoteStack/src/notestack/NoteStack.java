package notestack;


public class NoteStack
{

   
    public static void main(String[] args) 
    {
        StackDin sd = new StackDin();
        
        sd.push(12);
        sd.push(13);
        sd.push(14);
        sd.push(15);
        
       // System.out.println(sd.show());
       while(!sd.isEmpty())
       {
           System.out.println(sd.pop() + " ");
       }
       System.out.println(sd.show());
    }
    
}
