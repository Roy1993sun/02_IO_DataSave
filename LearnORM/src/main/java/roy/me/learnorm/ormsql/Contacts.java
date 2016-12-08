package roy.me.learnorm.ormsql;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * JavaBean 使用注解生成对应的表和结构
 * Created by Roy Sun on 2016/12/8.
 */

@Entity
public class Contacts {

    @Id(autoincrement = true) // 自增ID
    private long id;
    @NotNull // 指定非空
    private String uid;
    private String yid;

    private int gender;
    private String mobile;
    private String photoUrl;
    @Property(nameInDb = "nickname") // 可以指定表中的列名
    private String name;


    @Generated(hash = 668772395)
    public Contacts(long id, @NotNull String uid, String yid, int gender,
            String mobile, String photoUrl, String name) {
        this.id = id;
        this.uid = uid;
        this.yid = yid;
        this.gender = gender;
        this.mobile = mobile;
        this.photoUrl = photoUrl;
        this.name = name;
    }

    @Generated(hash = 1804918957)
    public Contacts() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
