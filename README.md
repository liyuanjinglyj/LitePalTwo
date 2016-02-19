# LitePalTwo
SQLite数据库插件操作方式

一.配置litepal.xml:

在项目的assets目录下面新建一个litepal.xml文件，并将以下代码拷贝进去：

<?xml version="1.0" encoding="utf-8"?>
<litepal>
    <dbname value="demo" ></dbname>

    <version value="1" ></version>

    <list>
    </list>
</litepal>

配置文件相当简单，<dbname>用于设定数据库的名字，<version>用于设定数据库的版本号，<list>用于设定所有的映射模型，我们稍后就会用到。

二.配置LitePalApplication

<application  
        android:name="org.litepal.LitePalApplication"
        .....>

三.使用实例

public class Student extends DataSupport{
	
	private int id;
	private String number;
	private String name;
	private String sex;
	public Student() {
		super();
	}
	
	public Student(int id, String number, String name, String sex) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}


<?xml version="1.0" encoding="utf-8"?>
<litepal>
    <dbname value="demo" ></dbname>

    <version value="1" ></version>

    <list>
        <mapping class="com.example.databasetest.model.News"></mapping>
    </list>
</litepal>

SQLiteDatabase db = Connector.getDatabase();  创建表News

DataSupport.saveAll(list);保存数据

//查找
		student = DataSupport.find(Student.class, 3);
		mInformation.setText("姓名:" + student.getName() + "学号:"
				+ student.getNumber() + "性别:" + student.getSex());  查找数据


//更新
		student=new Student();
		student.setName("吸血鬼");
		student.update(4);   //更新数据
		
		
		//删除
		DataSupport.delete(Student.class, 4);//删除数据
