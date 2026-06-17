package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	ImmutableList<String> fruits = ImmutableList.of("Apple","Banana","Orange");
	System.out.println(fruits);
	File srcf = new File("source.txt");
	File dest = new File("dest.txt");
	try{
		FileUtils.copyFile(srcf,dest);
		System.out.println("done");
	}
	catch(IOException i){
		System.err.println(i.getMessage());
	}
    }
}
