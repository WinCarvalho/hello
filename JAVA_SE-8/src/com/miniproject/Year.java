package com.miniproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Year {
	public static void year() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Year for Complain Details: ");
		int year = scan.nextInt();

		String FileName = "D:\\complaints.csv";
		BufferedReader br = null;
		String line = "";
		String comma = ",";

		try {

			br = new BufferedReader(new FileReader(FileName));
			while ((line = br.readLine()) != null) {

				String[] complaint = line.split(comma);
				try {
					String[] splityear = complaint[0].split("/");
					int onlyyear = Integer.parseInt(splityear[2]);
					if (onlyyear == year) {
						System.out.println("Complaint " + complaint[0]+"\t" + complaint[1]+"\t" + complaint[2]+"\t" + complaint[3]+"\t"
								+ complaint[4]+"\t" + complaint[5]+"\t" + complaint[6]+"\t" + complaint[7]+"\t" + complaint[8]+"\t"
								+ complaint[9]+"\t" + complaint[10]+"\t" + complaint[11]+"\t" + complaint[12]+"\t" + complaint[13]);
					}
				} catch (Exception e) {
					String[] splityear = complaint[0].split("-");
					int onlyyear = Integer.parseInt(splityear[2]);
					if (onlyyear == year) {
						System.out.println("Complaint " + complaint[0]+"\t" + complaint[1]+"\t" + complaint[2]+"\t" + complaint[3]+"\t"
								+ complaint[4]+"\t" + complaint[5]+"\t" + complaint[6]+"\t" + complaint[7]+"\t" + complaint[8]+"\t"
								+ complaint[9]+"\t" + complaint[10]+"\t" + complaint[11]+"\t" + complaint[12]+"\t" + complaint[13]);
					}
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
