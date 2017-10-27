package lgh.testjava.excel.extractor.busi.dto;

import lgh.testjava.excel.extractor.annotation.ExcelField;
import lombok.Data;

@Data
public class Student {
	@ExcelField(title = "姓名")
	private String name;
	@ExcelField(title = "年龄")
	private Integer age;
}
