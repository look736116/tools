/**
 * 
 */
package com.my.tools.base.test;

import java.io.File;
import java.util.List;

import com.my.tools.base.FindFileByRecursion;

/**
 * @author Rooker
 * @time 2019-9-16 15:25:40
 *
 */
public class TestFindFileByRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindFileByRecursion findFile = new FindFileByRecursion();
		File targetFolder = new File("D:\\tools");
		String targetFile = "test.txt";
		List<File> targetFiles = findFile.findFile(targetFolder, targetFile);
		if(targetFiles.size()!=0) {
			for (File file : targetFiles) {
				System.out.println(file.toString());
			}
		}

	}

}
