import java.util.ArrayList;

import java.util.Collections;



public class ArrayChallenges
	{
		static ArrayList<String>songs = new ArrayList<String>(10);
		
		public static void main(String[] args)
			{
				songMethod();
	}

		private static void songMethod()
			{
				
				songs.add("Rock of Ages - Def Leppard");
				songs.add("Rocket - Def Leppard");
				songs.add("Into the Fire - Dokken");
				songs.add("Break the Chains - Dokken");
				songs.add("Hymn for the Weekend - Coldplay");
				songs.add("Something Just Like This - Colplay");
				songs.add("Love Bites - Def Leppard");
				songs.add("Hang Tough - Tesla");
				songs.add("Rock Lobster - B52s");
				songs.add("I wannna Rock - Twisted Sister");
					
					
				for(String s : songs) {
					System.out.println(s);
				}
					
					System.out.println();
				
			 Collections.sort(songs);
			 for(String s : songs) {
				 	System.out.println(s);
				}
		System.out.println();
			 	System.out.println(songs.get(0));
System.out.println(songs.get(9));
			System.out.println();


for(int i = songs.size()-1;i>=0;i--) {
String firstCharacter = songs.get(i).substring(0,1);
	
	
	if(firstCharacter.equals ("R")) {
		songs.remove(i);
		
		}
	

}

for(int j =songs.size()-1 ; j>=0;j--) {
	System.out.println(songs.get(j));
	}
			
	System.out.println();		
			
		
int number=songs.size();
			
			} 
		
	
	
	}
			
