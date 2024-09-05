这是仿照Android的UI组件制作的windows 整套桌面UI组件，使用MVC模式来实现桌面软件的UI开发
可以用于Android的代码移植到windows的桌面软件
也可以实现同一套代码开发，打包为原生的安卓代码，以及windows代码
由于这是8年前开发的，框架还存在一些缺陷

同样实现了Activity的生命周期，各种控件配套的Listener，开发模式和原生的android开发非常相似
下面是示例：
![image](https://github.com/user-attachments/assets/5a278e0f-851c-4c35-9433-9852381ae75a)

开发步骤：
1.定义MAin
```JAVA
public class Main extends JFrame implements ActionListener, MouseListener {

    public static void   main(String[] args){
        new LoginActivity();
    }
```
2.组件的使用可以用findViewById，也可以直接调用
```JAVA
public class LoginActivity extends Activity {
    private LLshouye shouye;
    private LinearLayout Ltop;
    @Override
    public void onCreate() { 
        super.onCreate();
        setUndecorated(true);

        shouye=new LLshouye(442,425);
        setContentView(shouye);
        initView();

    }

    private void initView()   {

        Ltop=(LinearLayout)findViewById(0);

        shouye.printlist.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) { 

            }

        });
```
