package com.example
import com.example.tutorials.*
import com.example.Employee
import com.example.EmployeeService
class Main {
    static void main(String[] args) {
        println "=== Welcome to my Groovy Application ==="
        println "Java Version: ${System.getProperty('java.version')}"
        println "Groovy Version: ${GroovySystem.version}"
        println "Working Directory: ${System.getProperty('user.dir')}"
        
        // Let's do something useful - read command line args
        if (args.length > 0) {
            println "\nYou passed these arguments:"
            args.eachWithIndex { arg, idx ->
                println "  Arg ${idx + 1}: ${arg}"
            }
        } else {
            println "\nNo arguments passed. Try: gradle run --args='hello world'"
        }
        
        // Call a helper method
        def result = new MathHelper().add(5, 3)
        println "\n5 + 3 = ${result}"

        // this is coming from another class tutorial exmapke
        println "======== Runninsg Tutotoal==========="
        BasicOne.basicSyn()

        println "====== Runnings from another Tutorial ======="
        ListsTut.run();


        // Java/Groovy interop demo
        println "\n====== Java Interop Demo ======="
        def employees = [
            new Employee("Anna", "Engineering", 65000),
            new Employee("Ben", "Sales", 52000),
            new Employee("Clara", "Engineering", 71000)
        ]

        def service = new EmployeeService()
        println "Sorted by salary (desc):"
        service.sortBySalaryDesc(employees).each { println "  ${it}" }

        println "\nEngineering only:"
        service.filterByDepartment(employees, "Engineering").each { println "  ${it}" }

        println "\nAverage salary: ${service.averageSalary(employees)}"
    }
}

class MathHelper {
    int add(int a, int b) {
        return a + b
    }
}
