package roy.me.learnorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtnInsert, mBtnReload;
    ListView mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnInsert = (Button) findViewById(R.id.insert);
        mBtnReload = (Button) findViewById(R.id.reload);
        mBtnInsert.setOnClickListener(this);
        mBtnReload.setOnClickListener(this);

        mData = (ListView) findViewById(R.id.lv_show_data);
        // TODO: 2016/12/9  
        //mData.setAdapter(null);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.insert:
            insertData();
            break;
            case R.id.reload:
            reloadData();
            break;
        }
    }

    /**
     * 读取数据
     */
    private void reloadData() {

    }

    /**
     * 写入数据
     */
    private void insertData() {

    }
}
