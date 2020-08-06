package com.queries.getqueries;

public class GetQueries {

	public static String getQuery(String query)
	{
		String returnQuery = "";
		boolean queryFound = false;

		try
		{
			String fileContent = GetFileContent.getFileContentAsString("./queries/queries");
			String[] splitFileContent = fileContent.split(System.getProperty("line.separator"));

			for(String splitLine : splitFileContent)
			{
				if(queryFound && splitLine.startsWith("Query = "))
					break;

				if(queryFound)
					returnQuery = returnQuery + splitLine + System.getProperty("line.separator"); 

				if(splitLine.trim().equals("Query = "+query))
					queryFound = true;


			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		if(queryFound)
			return returnQuery;
		else
			return null;
	}

}
