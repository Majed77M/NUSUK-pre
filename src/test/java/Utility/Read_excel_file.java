package Utility;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Read_excel_file {
    static File file = new File("C:\\Users\\MajedSultanAlotaibi\\git\\NUSUK-pre\\src\\test\\java\\Utility\\Inputs.xlsx");

    public static  String getFirstName() throws IOException {

            FileInputStream fs = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheetAt(0);
         //   Row row = sheet.getRow(1);
           // Cell cell = row.getCell(1);
        String getFirstName = String.valueOf(sheet.getRow(2).getCell(1));
        return getFirstName;
    }
    public static  String getLastName() throws IOException {
        FileInputStream fs = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        //   Row row = sheet.getRow(1);
        // Cell cell = row.getCell(1);
        String getLastName = String.valueOf(sheet.getRow(2).getCell(2));
        return getLastName;
    }
    public static void readExcel(String filePath, String fileName, String sheetName) throws IOException {
        FileInputStream fs = new FileInputStream(file);
//Creating a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(sheet.getRow(0).getCell(0));
        Row row1 = sheet.getRow(1);
        Cell cell1 = row1.getCell(1);
        System.out.println(sheet.getRow(0).getCell(1));
        Row row2 = sheet.getRow(1);
        Cell cell2 = row2.getCell(1);
        System.out.println(sheet.getRow(1).getCell(0));
        Row row3 = sheet.getRow(1);
        Cell cell3 = row3.getCell(1);
        System.out.println(sheet.getRow(1).getCell(1));
        Row row4 = sheet.getRow(4);
        Cell cell4 = row4.getCell(4);

//String cellval = cell.getStringCellValue();
//System.out.println(cellval);
    }
//String cellval = cell.getStringCellValue();
//System.out.println(cellval);
    }

