package metin.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import metin.table.Song;

public class ReadCsvFile
{
	
	private BufferedReader br = null;
	private FileReader fr = null;
	
	
	
	public int disSong;
	

	public ReadCsvFile(String filename) {
		
	
		
		
		try {
			fr = new FileReader(filename);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		br = new BufferedReader(fr);
		
		
	
	}// end constructor
	
	
	public void readLine(){
		
		try {


			String sCurrentLine;
			int num=0;
			
			// client song ikilisi tutan map
			Map<String,Set<String>> clientSongmap =new HashMap<String,Set<String>>();
			
			
			sCurrentLine = br.readLine();
			while ((sCurrentLine = br.readLine()) != null) {
				
				// [0] play, [1] song, [2] client
				String[] lineParse=sCurrentLine.split("\\s+");	
					
			}// end while
			
			

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public int numberOfSong(){
		
		String sCurrentLine;
		Set<String> song=new HashSet<String>();
		try {
			sCurrentLine = br.readLine();
			while ((sCurrentLine = br.readLine()) != null) {
				
				// [0] play, [1] song, [2] client
				String[] lineParse=sCurrentLine.split("\\s+");
				
				song.add(lineParse[1]);
			
			}// end while
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// end try-cath
		
		
		return song.size();
	}// method number of song
	
	

}// end class read csv file
