package roy.me.learnorm.ormsql;

import android.content.Context;

import org.greenrobot.greendao.query.Query;

import java.util.List;

import roy.me.learnorm.greendao.ContactsDao;
import roy.me.learnorm.greendao.DaoMaster;
import roy.me.learnorm.greendao.DaoSession;

/**
 * Created by Roy Sun on 2016/12/9.
 */

public class OrmHelper {
    private static OrmHelper instance;

    private DaoMaster  mDaoMaster  = null;
    private DaoSession mDaoSession = null;

    /**
     * 进行初始化
     *
     * @param context
     */
    public OrmHelper(Context context) {
        MyOpenHelper openHelper = new MyOpenHelper(context, "ORMDB");

        mDaoMaster = new DaoMaster(openHelper.getWritableDatabase());
        mDaoSession = mDaoMaster.newSession();
    }

    public static OrmHelper getInstance(Context context) {
        if (instance == null) {
            instance = new OrmHelper(context);
        }
        return instance;
    }

    public void insertContacts(List<Contacts> list) {
        ContactsDao contactsDao = mDaoSession.getContactsDao();
        // 使用 事务 的方式插入数据
        contactsDao.insertInTx(list);
    }


    /**
     * 在数据库中查询数据的方法
     * @param offset
     *  起点
     * @param limit
     *  终点
     * @return
     */
    public List<Contacts> queryContacts(int offset, int limit) {
        ContactsDao contactsDao = mDaoSession.getContactsDao();
        // 查询数据
        Query<Contacts> query = contactsDao.queryBuilder().orderDesc(ContactsDao.Properties.Id).offset(offset).limit(limit).build();
        return query.list();
    }
}
