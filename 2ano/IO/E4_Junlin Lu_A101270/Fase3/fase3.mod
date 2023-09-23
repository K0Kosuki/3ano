param m, integer, > 0;
/* number of agents */

param n, integer, > 0;
/* number of tasks */
param CAP;
param fixo;
set I := 1..m;
/* set of agents */

set J := 1..n;
/* set of tasks */

param matrix{i in I, j in J}, >= 0;
/* cost of allocating task j to agent i */
param custos{i in I, j in J}, >= 0;

param procura {i in I,j in J},>=0;
var x{i in I, j in J}, >= 0;

var Y{i in I}, binary;



/* x[i,j] = 1 means task j is assigned to agent i
   note that variables x[i,j] are binary, however, there is no need to
   declare them so due to the totally unimodular constraint matrix */

s.t.capacidade_servidor{i in I}: sum{j in J} procura[i,j]*x[i,j] <= CAP*Y[i];
/* para transportes apagamos esta restrição ou colocamos um valor muito alto */

s.t.servir_cliente{j in J}: sum{i in I} matrix[i,j]* x[i,j] = 1;
/* each task must be assigned exactly to one agent */





minimize custoTOTAL:sum{i in I,j in J}matrix[i,j]*custos[i,j]*x[i,j]+sum{i in I}fixo*Y[i];
/* the objective is to find a cheapest assignment */

