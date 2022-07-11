package Filehndlr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Getcellvalue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileInputStream file = new FileInputStream(
					new File("..//second//Resource//Testing//First//howtodoinjava3_demo.xls"));

			HSSFWorkbook workbook = new HSSFWorkbook(file);

			int getindex = workbook.getSheetIndex("Employee Data");
			HSSFSheet sheet = workbook.getSheetAt(getindex);

			int rowcount = sheet.getLastRowNum();

			int colcount = sheet.getRow(0).getLastCellNum();
			System.out.println(rowcount + " " + colcount);

			HSSFRow row = sheet.getRow(0);
			System.out.println(row.getCell(0).getStringCellValue());

			sheet.getRow(0).getCell(0).setCellValue("6");

			System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());

			for (int i = 0; i < rowcount; i++) {
				for (int j = 0; j < colcount; j++) {
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
				}
				System.out.println("");
			}

			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(
					new File("..//second//Resource//Testing//First//howtodoinjava3_demo.xls"));
			workbook.write(out);
			out.close();
			System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
