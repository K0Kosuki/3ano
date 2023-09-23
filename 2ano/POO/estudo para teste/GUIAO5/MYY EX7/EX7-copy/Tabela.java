public class Tabela
{
    private static double[] tabela = {12.2, 15.0, 16.0, 11.5, 23.4};
    
    public static double precos(int componente)
    {
       return tabela[componente]; 
    }
}