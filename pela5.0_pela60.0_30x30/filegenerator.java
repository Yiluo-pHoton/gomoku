import java.io.*;
import java.util.*;

public class filegenerator {

	public static void main (String [] args) throws IOException 
	{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("start.txt")));
        for (int i = 0; i < 50; i++){
			if (i < 10)
			    out = new PrintWriter(new BufferedWriter(new FileWriter("pela5.0_pela60.0_30x30_00" + i + ".txt")));
            else
				out = new PrintWriter(new BufferedWriter(new FileWriter("pela5.0_pela60.0_30x30_0" + i + ".txt")));
        }
		out.close();
	}
}

