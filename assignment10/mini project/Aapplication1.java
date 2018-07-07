package aapplication1;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

public class Aapplication1{
    static ArrayList store = new ArrayList();
    static String disp = null;
    static String show = null;
    static void display(File[]arr,int index,int count){
        if(index==arr.length)
            return;
        for(int i=0;i<count;i++)
            store.add("");
        
            //System.out.println(arr[index].getAbsolutePath());
            if(arr[index].isFile())
            {
                store.add(arr[index].getAbsolutePath());
            }
            else if(arr[index].isDirectory())
        {
            store.add(arr[index].getAbsolutePath());
            display(arr[index].listFiles(),0,count+1);
        }
        display(arr,++index,count);
    }

   
    public static void main(String[] args) throws IOException {
        JFrame z;
        z=new JFrame();
        String zz=JOptionPane.showInputDialog(z,"Enter path");
        File list1=new File(zz);
        boolean check=list1.isFile();
        System.out.println(check);
        FileReader in;
        try
        {   
        in = new FileReader(list1);
        BufferedReader br=new BufferedReader (in);
        for (int j=0;j<2;j++)
        {
            if(j==0)
            {
                disp = br.readLine();
            }
            if(j==1)
            {
                show = br.readLine();
            }
        }
        {
        
        File file = new File(disp);    
        
       if(file.exists() && file.isDirectory())
       {
           File arr[]=file.listFiles();
           display(arr,0,0);
       }
    }
        {
            File sw = new File(show);
            FileWriter writer = new FileWriter(sw);
            try{
                Iterator list2=store.iterator();
                while(list2.hasNext())
                {
                    String str2=(String) list2.next();
                    writer.write(str2);
                    
                }
                writer.close();
            }
                catch(Exception e){
                        e.printStackTrace();
                        }
                System.out.println();
            
        }
        }
        catch(Exception e){
                e.printStackTrace();
                
                        }
                    
    }
}
                    
            
        

