package roy.me.learnorm.ormsql;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

import roy.me.learnorm.greendao.DaoMaster;

/**
 * 根据GreenDao的要求， 需要继承DaoMaster的Open Helper 实现更新
 * Created by Roy Sun on 2016/12/9.
 */

public class MyOpenHelper extends DaoMaster.OpenHelper {

    public MyOpenHelper(Context context, String name) {
        super(context, name);
    }
    
    /**
     * 如要版本升级需要重写方法
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        if (newVersion == 2 && oldVersion == 1) {
            // TODO: 2016/12/9  
        }
    }
}
