package Assignment;

import com.pega.uiframework.utils.Xls_Reader;

import java.util.ArrayList;

public class utils {

        static Xls_Reader reader;

        public static ArrayList<Object[]> getDataExcel(){

            ArrayList<Object[]> myData = new ArrayList<Object[]>();




            try{
                reader = new Xls_Reader("C:\\Users\\GunveerSingh\\IdeaProjects\\SeleniumWorks\\TestDataa\\GunveerFile(1).xlsx");

            }catch(Exception e){
                e.printStackTrace();
            }

            for(int rowNum=1;rowNum<= reader.getRowCount("Sheet1");rowNum++){
                String username = reader.getCellData("Sheet1", "username",rowNum);
                String password = reader.getCellData("Sheet1", "password", rowNum);
                Object ob[] = {username,password};
                myData.add(ob);

            }
            return myData;

        }
    }



