import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila(){
        pila=new Stack<Integer>();
    }
    public void insertar (Integer dato){
        pila.push(dato);
    }
    public Integer eliminar() throws Exception {
        if(pila.empty()){
            throw new Exception("Pila sin elemnetos");
        }
        return pila.pop();
    }
    public Integer consultarTope() throws Exception {
        if(pila.empty()){
            throw new Exception("Pila sin elemnetos");
        }
        return pila.peek();
    }

    @Override
    public String toString() {
        String resultados= "===PILA===\n";
        for(int i=pila.size()-1;i>=0;i--){
            resultados+=pila.get(i)+"\n";
        }
        return resultados;
    }
}
