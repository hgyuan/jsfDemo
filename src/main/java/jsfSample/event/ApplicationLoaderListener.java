package jsfSample.event;

import jsfSample.model.Employee;
import jsfSample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Spring application context loader that checks if database has initial data.
 * If not, it fills database with some mock data.
 *
 * @author Michel Risucci
 */
@Component
public class ApplicationLoaderListener implements ApplicationListener<ContextRefreshedEvent> {

    private EmployeeRepository employeeRepository;

    @Autowired
    public ApplicationLoaderListener(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        if (context.getParent() != null) {
            long count = employeeRepository.count();
            if (count == 0) {
                initializeDatabaseWithMockData();
            }
        }
    }

    private void initializeDatabaseWithMockData() {
        List<Employee> employees = Arrays.asList(
                new Employee("Brazil"),
                new Employee("Canada"),
                new Employee("Portugal")
        );
        System.out.println("111");
        employeeRepository.save(employees);
    }

}