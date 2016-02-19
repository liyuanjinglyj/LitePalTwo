package com.example.litepaltwo;

import java.util.ArrayList;
import java.util.List;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;


/**
 * @author 子墨
 *
 * 2014-10-30
 */
public class MainActivity extends Activity {

	private SQLiteDatabase db;
	private List<Student> list;
	private Student student;
	private TextView mInformation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mInformation = (TextView) findViewById(R.id.student_information);
		// 生成student表
		db = Connector.getDatabase();

		initDate();

		//保存
		DataSupport.saveAll(list);

		//查找
		student = DataSupport.find(Student.class, 3);
		mInformation.setText("姓名:" + student.getName() + "学号:"
				+ student.getNumber() + "性别:" + student.getSex());

		//更新
		student=new Student();
		student.setName("吸血鬼");
		student.update(4);

		//删除
		DataSupport.delete(Student.class, 4);
	}

	/**
	 * 表中数据赋值
	 */
	private void initDate() {
		list = new ArrayList<Student>();
		list.add(new Student(1, "20100854212", "子墨", "女"));
		list.add(new Student(2, "20100854211", "Thea", "女"));
		list.add(new Student(3, "20100854210", "Vampire", "女"));
		list.add(new Student(4, "20100854213", "klaus", "男"));
		list.add(new Student(5, "20100854213", "klaus", "男"));
		list.add(new Student(6, "20100854213", "klaus", "男"));
		list.add(new Student(7, "20100854213", "klaus", "男"));
		list.add(new Student(8, "20100854213", "klaus", "男"));
		list.add(new Student(9, "20100854213", "klaus", "男"));
	}

}
