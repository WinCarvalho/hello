
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
public static void main(String[] args) {
//this holds the Csv file location
String csvFile ="D:\\complaints.csv";
String line = "";
//as we have to split the file from commas
String splitBy = ",";
String bankname="Citibank";
String year="2012";
String id="2034778";

//Buffered reader class is a java.io class which reads 
//a character input file ,it reads lines and arrays 
//File reader opens the given file in read mode 
try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//readline function is use to read a line form the file
while ((line = br.readLine()) != null) {
//loop will continue until the line ends 
String[] name = line.split(splitBy);

//split function use to split the words in the line by commas
//System.out.println("Date received: "+ name[0]+ " , Product:" + name[1]+ " , Sub-product:" + name[2]+ " , Issue:" + name[3]+",Sub-issue:"+name[4]+",Company:"+name[5]+",State:"+name[6]+",ZIP code:"+name[7]+",Submitted via"+name[8]+",Date sent to company"+name[9]+",Company response to consumer"+name[10]+",Timely response?"+name[11]+",Consumer disputed?"+name[12]+",Complaint ID"+name[13]);
//this is to print the each csv line 

//prints the complaint acc to bank name
/*if(name[5].endsWith(bankname)) {
 System.out.println("date:"+name[0]);
 System.out.println("Date received: "+ name[0]+ " , Product:" + name[1]+ " , Sub-product:" + name[2]+ " , Issue:" + name[3]+",Sub-issue:"+name[4]+",Company:"+name[5]+",State:"+name[6]+",ZIP code:"+name[7]+",Submitted via"+name[8]+",Date sent to company"+name[9]+",Company response to consumer"+name[10]+",Timely response?"+name[11]+",Consumer disputed?"+name[12]+",Complaint ID"+name[13]);
 }
*/
//prints the complaint acc to year
/*if(name[0].endsWith(year)) {
System.out.println("date:"+name[0]);
 System.out.println("Date received: "+ name[0]+ " , Product:" + name[1]+ " , Sub-product:" + name[2]+ " , Issue:" + name[3]+",Sub-issue:"+name[4]+",Company:"+name[5]+",State:"+name[6]+",ZIP code:"+name[7]+",Submitted via"+name[8]+",Date sent to company"+name[9]+",Company response to consumer"+name[10]+",Timely response?"+name[11]+",Consumer disputed?"+name[12]+",Complaint ID"+name[13]);
 }*/

if(name[13].contains(id)) {
System.out.println("date:"+name[0]);
 System.out.println("Date received: "+ name[0]+ " , Product:" + name[1]+ " , Sub-product:" + name[2]+ " , Issue:" + name[3]+",Sub-issue:"+name[4]+",Company:"+name[5]+",State:"+name[6]+",ZIP code:"+name[7]+",Submitted via"+name[8]+",Date sent to company"+name[9]+",Company response to consumer"+name[10]+",Timely response?"+name[11]+",Consumer disputed?"+name[12]+",Complaint ID"+name[13]);
 }
}} catch (IOException e) {
e.printStackTrace();
}


}

}
