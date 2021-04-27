package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class poi {
    public static ArrayList<String> a() throws EncryptedDocumentException, IOException{
        ArrayList<String> al = new ArrayList<String>();
        
        File f = new File("recursos");
        String absolute = f.getAbsolutePath();
        InputStream inp = new FileInputStream(absolute+"\\TestObj.xlsx");
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sh = wb.getSheetAt(0);
        int iRow = 0;
        Row row = sh.getRow(iRow);
        while(row!=null) 
        {
            Cell cell = row.getCell(0);  
            String value = cell.getStringCellValue();
            al.add(value);
            iRow++;  
            row = sh.getRow(iRow);
        }
        return al;
    }

    public static ArrayList<String> b() throws EncryptedDocumentException, IOException{
        ArrayList<String> al = new ArrayList<String>();
        File f = new File("recursos");
        String absolute = f.getAbsolutePath();
        InputStream inp = new FileInputStream(absolute+"\\TestObj.xlsx");
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sh = wb.getSheetAt(0);
        int iRow = 0;
        Row row = sh.getRow(iRow);
        while(row!=null) 
        {
            Cell cell = row.getCell(1);  
            String value = cell.getStringCellValue();
            al.add(value);
            iRow++;  
            row = sh.getRow(iRow);
        }
        return al;
    }
}
