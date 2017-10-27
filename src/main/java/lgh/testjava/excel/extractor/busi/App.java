package lgh.testjava.excel.extractor.busi;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lgh.testjava.excel.extractor.ExcelReader;
import lgh.testjava.excel.extractor.busi.dto.Student;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunning() {
		return args -> {
			String path = "/Users/johnsonlau/app/eclipse-workspace/testjava_excel_extractor/docs/student.xls";
			//String path = "/Users/johnsonlau/app/eclipse-workspace/testjava_excel_extractor/docs/student.xlsx";
			List<Student> students = ExcelReader.getInstance().readExcelAsBean(path, Student.class);
			for (Student student : students) {
				log.info("{}", student);
			}
		};
	}
}
