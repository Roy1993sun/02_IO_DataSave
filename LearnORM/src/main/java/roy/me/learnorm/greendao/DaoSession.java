package roy.me.learnorm.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import roy.me.learnorm.ormsql.Contacts;

import roy.me.learnorm.greendao.ContactsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contactsDaoConfig;

    private final ContactsDao contactsDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contactsDaoConfig = daoConfigMap.get(ContactsDao.class).clone();
        contactsDaoConfig.initIdentityScope(type);

        contactsDao = new ContactsDao(contactsDaoConfig, this);

        registerDao(Contacts.class, contactsDao);
    }
    
    public void clear() {
        contactsDaoConfig.clearIdentityScope();
    }

    public ContactsDao getContactsDao() {
        return contactsDao;
    }

}
