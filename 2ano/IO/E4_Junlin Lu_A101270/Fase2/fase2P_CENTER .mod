param m, integer, > 0;
/* number of agents */

param n, integer, > 0;
/* number of tasks */

param P;
#parametro para resolver o p-MEDIAN e o p-CENTER

set I := 1..m;
/* set of agents */

set J := 1..n;
/* set of tasks */

param matrix{i in I, j in J}, >= 0;
/* cost of allocating task j to agent i */

param custos{i in I, j in J}, >= 0;

var x{i in I, j in J}, >= 0;
/* x[i,j] = 1 means task j is assigned to agent i
   note that variables x[i,j] are binary, however, there is no need to
   declare them so due to the totally unimodular constraint matrix */

var Y{i in I}, binary;

var W, >=0;

#s.t. phi{i in I}: sum{j in J} x[i,j] <= 1;
/* para transportes apagamos esta restrição */

s.t. psi{j in J}: sum{i in I} matrix[i,j]* x[i,j] = 1;
/* each task must be assigned exactly to one agent */

#minimize custoTOTAL: sum{i in I, j in J} matrix[i,j] * custos[i,j] * x[i,j];
/* the objective is to find a cheapest assignment */

minimize custo_maximo: W;

s.t. restri_numero_servidores:sum {i in I} Y[i]=P;

s.t. ativar_servidor_via_servico{i in I, j in J}: x[i,j]<=Y[i];

s.t. ativar_valor_W{j in J}:W>= sum {i in I} matrix[i,j]*custos[i,j]*x[i,j];
