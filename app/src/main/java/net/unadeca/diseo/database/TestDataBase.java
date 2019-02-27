package net.unadeca.diseo.database;

import com.raizlabs.android.dbflow.annotation.Database;
//Version de la base de datos
@Database(name = TestDataBase.dbname, version = TestDataBase.dbversion)

public class TestDataBase {
    public static final String dbname = "TestDatabase";
    public static final int dbversion = 1;
}
