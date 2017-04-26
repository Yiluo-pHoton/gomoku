import java.io.*;
import java.util.*;

public class filegenerator {

	public static void main (String [] args) throws IOException 
	{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("start.txt")));
        for (int i = 18; i < 100; i++){
		    out = new PrintWriter(new BufferedWriter(new FileWriter("pela5.0_pela60.0_0" + i + ".txt")));
            out.print(" ");
        }
		out.close();
	}
}
