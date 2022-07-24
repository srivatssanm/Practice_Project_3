//Practice project 3
package practiceproject3;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

	public void read()
	{
		try {
	        File s1 = new File("mysamplefile.txt");
	        Scanner Reader = new Scanner(s1);
	        while (Reader.hasNextLine()) {
	            String data = Reader.nextLine();
	            System.out.println(data);
	        }
	        Reader.close();
	    }
	    catch (FileNotFoundException e) {
	        System.out.println("An error has occurred.");
	        e.printStackTrace();
	    }
	}
	
	public void write()
	{
		try {
			String s;
			System.out.println("Enter text to write");
			Scanner in1 = new Scanner(System.in);
			s = in1.nextLine();
	        FileWriter Writer = new FileWriter("mysamplefile.txt");
	        Writer.write(s);
	        Writer.close();
	        System.out.println("Successfully written.");
	    }
	    catch (IOException e) {
	        System.out.println("An error has occurred.");
	        e.printStackTrace();
	    }
	}
	
	public void append()
	{
		try {
		BufferedWriter out = new BufferedWriter(new FileWriter("mysamplefile.txt", true));
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter text to append");
		String str = inp.nextLine();
        out.write(str);
        out.close();
        System.out.println("Added successfully");
		}
		catch(IOException e) {
	        System.out.println("An error has occurred.");
	        e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandling fh = new FileHandling();
		File Obj = new File("mysamplefile.txt");
        if (Obj.createNewFile()) {
            System.out.println("File created: "
                               + Obj.getName());
        }
        else {
            System.out.println("File already exists.");
        }
        
        
        System.out.println("Choose 1 to read, 2 to write or 3 to append" );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num == 1)
       
        	fh.read();
        	
        else if(num == 2)
        	
        	fh.write();
        	
        else if(num == 3)
        	
        	fh.append();
        	
        else
        	System.out.println("This option is Invalid!");
        	
       

	}

}