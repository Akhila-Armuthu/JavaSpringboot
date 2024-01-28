package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeeRepository extends JpaRepository<Employee,Long> {
}
