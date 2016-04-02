import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class run
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		execute("test.txt");
	}

	public static void execute(String fileName)
	{
		String line = null;

		try{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffered = new BufferedReader(fileReader);
			while((line = buffered.readLine()) != null){
				System.out.println(line);
			}
			buffered.close();
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

