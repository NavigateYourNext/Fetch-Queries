package com.queries.getqueries;

import java.io.FileInputStream;

public class GetFileContent
{
	public static String getFileContentAsString(String filePath)
	{
		FileInputStream fis;
		StringBuffer sb = new StringBuffer();
		try
		{
		 
			fis = new FileInputStream(filePath);
			int ch = -1;
			while((ch = fis.read())!=-1)
			{
				sb.append((char)ch);
			}
			
			fis.close();
			return sb.toString();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
	}
}
