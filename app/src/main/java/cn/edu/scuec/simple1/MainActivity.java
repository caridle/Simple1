package cn.edu.scuec.simple1;

import androidx.appcompat.app.AppCompatActivity;
import cn.edu.scuec.simple1.databinding.ActivityMainBinding;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       ActivityMainBinding mBinding = ActivityMainBinding.inflate(getLayoutInflater());
       // setContentView(ActivityMainBinding.inflate(getLayoutInflater()).getRoot());
        setContentView(mBinding.getRoot());
        mBinding.tv.setText("这是另外的内容哦");
    }
}
