

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Com {
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
	//	System.out.println("Enter bank Name : ");
		//String bankname = scan.next();
		
		 String FileName = "D:\\complaints.csv";
	        BufferedReader br = null;
	        String line = "";
	        String comma = ",";
	        String yes = "Yes";
	        try {

	            br = new BufferedReader(new FileReader(FileName));
	            while ((line = br.readLine()) != null) {
	            	
	                String[] complaint = line.split(comma);
	                try {
	                	String name = (complaint[11]);
	                	
	                	if(name.equals(yes)) {
	                		System.out.println("Complaint " + complaint[0]+"\t" + complaint[1]+"\t" + complaint[2]+"\t" + complaint[3]+"\t"
									+ complaint[4]+"\t" + complaint[5]+"\t" + complaint[6]+"\t" + complaint[7]+"\t" + complaint[8]+"\t"
									+ complaint[9]+"\t" + complaint[10]+"\t" + complaint[11]+"\t" + complaint[12]+"\t" + complaint[13]);
		                }
	                }catch(Exception e) {
	                //String[] spl2 = complaint[0].split("-");
	                	// int yr2 = Integer.parseInt(spl2[2]);
	                	// if(yr2 == year) {
	                		// System.out.println("Complaint " + complaint[0] + complaint[1] + complaint[2] + complaint[3] + complaint[4] + complaint[5] + complaint[6] + complaint[7] + complaint[8] + complaint[9] + complaint[10] + complaint[11] + complaint[12] + complaint[13]);
	 	               // }
	                }          

	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	}
}
