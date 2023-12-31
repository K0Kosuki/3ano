import java.util.*;

interface CarrinhaGelado {
    void pede(String sabor) throws InterruptedException;
    String pedidoSeguinte() throws InterruptedException;
    Map<String, Integer> topSabores();
    
} 
