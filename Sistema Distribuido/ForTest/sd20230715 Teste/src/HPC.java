import java.util.*;

interface HPC {

int inicio(int ncores) throws InterruptedException;
void fim(int tarefa, long tempo);
Map<Integer, Long> historia();
}
