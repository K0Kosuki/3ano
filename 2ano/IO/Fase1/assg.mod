/* ASSIGN, Assignment Problem */

/* Written in GNU MathProg by Andrew Makhorin <mao@gnu.org> */

/* The assignment problem is one of the fundamental combinatorial
   optimization problems.

   In its most general form, the problem is as follows:

   There are a number of agents and a number of tasks. Any agent can be
   assigned to perform any task, incurring some cost that may vary
   depending on the agent-task assignment. It is required to perform all
   tasks by assigning exactly one agent to each task in such a way that
   the total cost of the assignment is minimized.

   (From Wikipedia, the free encyclopedia.) */

param m, integer, > 0;
/* number of agents */

param n, integer, > 0;
/* number of tasks */

set I := 1..m;
/* set of agents */

set J := 1..n;
/* set of tasks */

param matrix{i in I, j in J}, >= 0;
param custos{i in I, j in J}, >= 0;




var x{i in I, j in J}, >= 0;
/* x[i,j] = 1 means task j is assigned to agent i
   note that variables x[i,j] are binary, however, there is no need to
   declare them so due to the totally unimodular constraint matrix */

s.t. phi{i in I}: sum{j in J} x[i,j] <= 1;
/* each agent can perform at most one task */

s.t. psi{j in J}: sum{i in I} matrix[i,j]*x[i,j] = 1;
/* each task must be assigned exactly to one agent */   /*contar matriz tudo*/

minimize obj: sum{i in I, j in J} matrix[i,j]*custos[i,j] * x[i,j];
/* the objective is to find a cheapest assignment */
