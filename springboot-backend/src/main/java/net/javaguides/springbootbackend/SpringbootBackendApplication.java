package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootBackendApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}



	@Autowired
	private EmployeeeRepository employeeeRepository;



	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Akhila");
		employee.setLastName("Armuthu");
		employee.setEmailId("armuthu@gmail.com");
		employeeeRepository.save(employee);
		Employee employee1=new Employee();
		employee1.setFirstName("Rupa");
		employee1.setLastName("Armuthu");
		employee1.setEmailId("Rupa@gmail.com");
		employeeeRepository.save(employee1);
	}
}
