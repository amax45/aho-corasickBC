//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class excel {
//    public static void main(String[] args) throws IOException {
//        ArrayList<String> titles = new ArrayList<String>();
//        String names = "";
//        String path="test.xlsx";
//        FileInputStream fileInputStream=new FileInputStream(path);
//
//        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
//       // XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
//        XSSFSheet sheet=xssfWorkbook.getSheet("Sheet1");
//        ArrayList<String> zatim = new ArrayList<String>();
//
//        int rows= sheet.getLastRowNum();
//        int cells= sheet.getRow(1).getLastCellNum();
//
//        for(int r=2;r<=rows;r++){
//            XSSFRow row=sheet.getRow(r);
//
//            for(int c=3 ;c<=cells;c++){
//                try{
//                XSSFCell cell=row.getCell(c);
//                if (c==3) {
//
//                }
//                    switch (cell.getCellType()){
//
//                    case STRING: System.out.println(cell.getStringCellValue());
//                    zatim.add(cell.getStringCellValue());
//                    break;
//                    case NUMERIC: System.out.println(cell.getNumericCellValue());break;
//                    case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
//                }
//                }catch (NullPointerException e){
//                    c++;
//                }
//            }
//            titles.add(String.valueOf(zatim));
//            zatim.clear();
//        }
//
//        System.out.println();
//        System.out.println(titles);
//        System.out.println(titles.get(0));
//
//        String arra[] = titles.get(0).split(",");
//        System.out.println(arra[1]);
//
//    }
//}
//
//
