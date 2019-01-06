package com.ingecno.MysteryShoppers.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.ingecno.MysteryShoppers.SignupDataModel.SignUpData;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataRepository {
	/**
	 * @param File
	 *            Name
	 * @param Sheet
	 *            Name
	 * @return
	 * @throws FileNotFoundException 
	 *//*public static void main(String[] args) throws FileNotFoundException {
		 getExcelData("D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\data\\logindata.xls", "user_name");
	 }*/

	public static String[][] getExcelData(String fileName, String sheetName) throws FileNotFoundException {
		File file = new File(fileName);
		
		//FileInputStream fis=new FileInputStream(file);
		
		String inputData[][] = null;
		Workbook w;

		try {
			w = Workbook.getWorkbook(file);

			// Get the first sheet
			Sheet sheet = w.getSheet(sheetName);

			int colcount = sheet.getColumns();

			int rowcount = sheet.getRows();

			inputData = new String[rowcount-1][colcount];

			for (int i = 1; i < sheet.getRows(); i++) {
				
				for (int j = 0; j < sheet.getColumns(); j++) {
					
					Cell cell = sheet.getCell(j, i);
					
					inputData[i-1][j] = cell.getContents();
					
					System.out.print(inputData[i-1][j]+" | ");
				}
				System.out.println();
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputData;
	}

	public static ArrayList<SignUpData> getDataFromExcelSheet(String fileName,
			String sheetName) {

		Workbook w;
		File file = new File(fileName);
		ArrayList<SignUpData> list = new ArrayList<SignUpData>();
		try {
			w = Workbook.getWorkbook(file);

			// Get the first sheet
			Sheet sheet = w.getSheet(sheetName);

			int colcount = sheet.getColumns();

			int rowcount = sheet.getRows();
		

			for (int i = 1; i < sheet.getRows(); i++) {
				SignUpData signUpData = new SignUpData();
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(j, i);
					String singleCellData = cell.getContents();
					if (j == 0) {
						signUpData.setDataset_no(singleCellData);
					}
					if (j == 1) {
						signUpData.setFirstname(singleCellData);
					}
					if (j == 2) {
						signUpData.setLastname(singleCellData);
					}
					if (j == 3) {
						signUpData.setContact(singleCellData);
					}
					if (j == 4) {
						signUpData.setEmail(singleCellData);
					}
					if (j == 5) {
						signUpData.setGender(singleCellData);
					}
					if (j == 6) {
						signUpData.setLocation(singleCellData);
					}
					if (j == 7) {
						signUpData.setArea(singleCellData);
					}
				}
				list.add(signUpData);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
