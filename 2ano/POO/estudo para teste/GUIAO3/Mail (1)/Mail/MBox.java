

/**
 * Write a description of class MBox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class MBox
{
    // instance variables - replace the example below with your own
    private HashMap<String,ArrayList<Mail>> lista;

    /**
     * Constructor for objects of class MBox
     */
    public MBox()
    {
        // initialise instance variables
        this.lista = new HashMap<String,ArrayList<Mail>>();
    }
    
    public void add(Mail m)
    {
     
        if(this.lista.containsKey(m.getEnd()))
        {
            ArrayList<Mail> temp = this.lista.get(m.getEnd());
            temp.add(m.clone());
        }
        else
        {
            ArrayList<Mail> temp = new ArrayList<Mail>();
            temp.add(m.clone());
            this.lista.put(m.getEnd(),temp);
        }
    }
    
    
    public int numEnd()
    {
        return this.lista.size();
    }
    
    public int numMails(String end)
    {
        return this.lista.get(end).size();
    }
    
    public List<String> listaEnd(ArrayList<String> palavras)
    {
        ArrayList<String> ends = new ArrayList<String>();
        
        for(String e:this.lista.keySet())
        {
            ArrayList<Mail> temp = this.lista.get(e);
            Iterator<Mail> i = temp.iterator();
            boolean flag = false;
            while(i.hasNext() && !flag)
            {
                StringTokenizer s = new StringTokenizer(i.next().getSubjet()," ");
                while(s.hasMoreTokens() && ! flag)
                    flag = palavras.contains(s.nextToken());
            }
            
            if(flag)
                ends.add(e);
        }
        
        return ends;
    }
    // agora guarda os mails (e não os endereços)
    public List<Mail> listaEnd2(ArrayList<String> palavras)
    {
        ArrayList<Mail> ends = new ArrayList<Mail>();
        
        for(String e:this.lista.keySet())
        {
            ArrayList<Mail> temp = this.lista.get(e);
            Iterator<Mail> i = temp.iterator();
            boolean flag = false;
            while(i.hasNext() && !flag)
            {
                Mail m = i.next();
                StringTokenizer s = new StringTokenizer(m.getSubjet()," ");
                while(s.hasMoreTokens() && ! flag)
                    flag = palavras.contains(s.nextToken());
                    
                if(flag)
                    ends.add(m.clone());
            }
            
            
        }
        
        return ends;
    }
    
    public void eliminarData(int ano, int mes,int dia)
    {
        GregorianCalendar data = new GregorianCalendar(ano,mes,dia);
        
        for(ArrayList<Mail> mails: this.lista.values())
        {
            Iterator<Mail> i = mails.iterator();
            while(i.hasNext())
            {
                Mail m = i.next();
                if(m.getDatar().getTimeInMillis() < data.getTimeInMillis())
                    i.remove();
            }
        }
    }
    
    public List<String> mailshoje()
    {
        GregorianCalendar hoje = new GregorianCalendar();
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        
        ArrayList<String> ends = new ArrayList<String>();
        
        for(String e:this.lista.keySet())
        {
            ArrayList<Mail> temp = this.lista.get(e);
            Iterator<Mail> i = temp.iterator();
            boolean flag = false;
            while(i.hasNext() && !flag)
            {
                Mail m = i.next();
                GregorianCalendar data = m.getDatae();
                int a1 = data.get(Calendar.YEAR);
                int m1 = data.get(Calendar.MONTH);
                int d1 = data.get(Calendar.DAY_OF_MONTH);
                
                flag = (ano == a1 && mes == m1 && dia == d1);
            }
            
            if(flag)
                ends.add(e);
        }
        
        return ends;
    }
}
