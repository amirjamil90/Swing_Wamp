import java.io.*;
class ext
{
	public static void main(String[] args)throws IOException {

FileInputStream fstream = new FileInputStream("amir.txt");
BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

String strLine;int k=0;
String a[]=new String[100000];

//Read File Line By Line
while ((strLine = br.readLine()) != null)   {

	for(int i=0;i<strLine.length();i++){

		char p=strLine.charAt(i);
		if(p=='('){
			a[k++] = strLine.substring(i+1,i+12);
		}
	}

  // Print the content on the console
  
}	
for(int q=0;q<100;q++){

	System.out.println(a[q]);
}

//Close the input stream
br.close();



	}
}