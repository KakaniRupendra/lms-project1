package file_handling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Files.deleteIfExists(Paths.get("c://temp//testFile2.txt"));
		}
		catch(NoSuchFileException e) {
			System.out.println("no such file/directory exists");
		}
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
		}
		
       catch(IOException e) {
    	   System.out.println("invalid permission.");
       }
		System.out.println("Deletion Successful");
	}

}
