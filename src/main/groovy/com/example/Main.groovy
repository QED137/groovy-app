package com.example

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
    }
}

class MathHelper {
    int add(int a, int b) {
        return a + b
    }
}
