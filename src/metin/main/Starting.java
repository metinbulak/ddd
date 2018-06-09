package metin.main;

import metin.file.ReadCsvFile;

public class Starting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// q1 select distinct SONG_ID  from table
		// q5 is IPv6
		// q6 ethernet II
		
		ReadCsvFile csv =  new ReadCsvFile("exhibitA-input.csv");
		
		//csv.readLine();
		
		System.out.println("maximum number of distinct song: "+csv.numberOfSong());

	}

}
