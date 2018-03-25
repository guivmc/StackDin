package notestack;

public class StackDin 
{
    private Note top;
    
    public StackDin()
    {
        this.top = null;
    }
    
    public boolean isEmpty()
    {
        return (top == null);
    }
    
    public void push(int valor)
    {
        Note note = new Note(valor);
        note.setNext(top);
        top = note;
    }
    
    public int pop()
    {
        if(top == null) return -1;
        Note aux = top;
        top = top.getNext();      
        return aux.getDado();
    }
    
    public int peek()
    {
        if(top == null) return -1;
        return top.getDado();
    }
    
    public String show()
    {
        Note aux = top;
        String out = "";
        
        while(aux != null)
        {
            out += aux.getDado()  + " ";
            aux = aux.getNext();
        }      
        
        return out;
    }
}
