package ringelf.moadx.www.ring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ringelf.moadx.www.ring.showCustomNavigationBar.ShowNavigationActivity;

public class MainActivity extends AppCompatActivity {
    private Button navigation_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("做着玩的");

        initView();                               /// 初始化控件
        selectorMethod();
    }
    /*** * 初始化控件 */
    public void initView()
    {
        navigation_btn = (Button) findViewById(R.id.navigation_btn);
    }

    /*** * 按钮点击事件 */
    public void selectorMethod()
    {
        // 展示自定义NavigationBar
        navigation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("展示自定义NavigationBar");
                // 跳转页面
                Intent intent = new Intent(MainActivity.this, ShowNavigationActivity.class);
                startActivity(intent);
            }
        });
    }
}
