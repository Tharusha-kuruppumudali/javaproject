package Models;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Vehicle_Repair_jobs {
    
    String VehicleID;
    int ID;
    String Problem;
    Float Cost;
    String StartingDate;
    String EndingDate;
    String Status;
    
    
    public Vehicle_Repair_jobs(String VID,int ID,String P, Float C, String SD, String ED, String S){
        
        this.VehicleID=VID;
        this.ID=ID;
        this.Problem=P;
        this.Cost=C;
        this.StartingDate=SD;
        this.EndingDate=ED;
        this.Status=S;
        
    }

  
}
 