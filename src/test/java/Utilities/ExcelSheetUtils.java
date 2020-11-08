//package Utilities;
//
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
//
//public class ExcelSheetUtils {
//
//     private File sheet;
//     private Sheet currentSheet;
//     private Map<String, Integer> columns;
////     private WorkbookFactory workbooks = null;
//
//     // constructor for the class
//   public ExcelSheetUtils(File file){
//       sheet = file;
//       columns = new HashMap();
//   }
//
//   // A method to getsheet
//    public void getSheet(String name){
//       try( var workbooks = WorkbookFactory.create(sheet)){
//           currentSheet = workbooks.getSheet(name);
//           currentSheet.getRow(0).forEach(cell ->{ columns.put(cell.getStringCellValue(), cell.getColumnIndex());
//           });
//       }catch (Exception e){
//           e.printStackTrace();
//       }
//    }
//
//
//    public String getCellData(){
//       var dataRow = currentSheet.getRow(row);
//       return getCellDataAsString(dataRow.getCell(columns.get(column)));
//    }
//
//
//    public String getCellDataAsString(){
//       return switch(cell.getCellType()){
//           case String -> cell.getStringCellValue();
//           case NUMERIC -> String.valueOf((int)cell.getNumericCellValue());
//           default -> "";
//
//       };
//    }
//
//
//
//
//     // Step 1: instantiate the File property and give the directory of excel sheet
////      sheet = new File("data/order.xlsx");
//
//    // step 2:
//
//
//
//}
