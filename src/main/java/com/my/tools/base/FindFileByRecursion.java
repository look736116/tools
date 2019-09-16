/**
 * 
 */
package com.my.tools.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.StartDocument;

/**
 * This class is a demo for how to use recursive method find file.
 * @author Rooker
 * @time 2019-9-15 19:00:06
 */
public class FindFileByRecursion {

	/**
	 * @param String targetFolder 
	 * @param String targetFileName
	 * @return ArrayList<String>
	 */
	public  ArrayList<File> findFile(File targetFolder,String targetFileName ) {
		// TODO Auto-generated method stub
		
		ArrayList<File> targetFiles = new ArrayList<File>();
		
		if(targetFolder.exists()) {
			File[] files = targetFolder.listFiles();
			for (File file : files) {
				if(file.isDirectory()) {//if the file is directory, reuse findFile method. 
					findFile(file, targetFileName);
				}else {//if the file is't directory,compare the files.
					String fileName = file.getName();
					if(targetFileName.equals(fileName)) {
						System.out.println(targetFileName +" is in the " + file.getAbsolutePath());
						targetFiles.add(file);
					}
				}
				
			}	
		}else {
			System.out.println("TargetFolder " + targetFolder.toString() + " does not exist!"  );
		}
		return targetFiles;

	}

}
