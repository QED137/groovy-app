package com.example

class Practice {
    static void main(String[] args) {
        println "=== Running Practice Class ==="
        
        // You can use project dependencies here!
        def result = (1..10).sum()
        println "Sum of 1 to 10: ${result}"
        
        // Play with maps
        def person = [name: "Alice", city: "Berlin"]
        println "Person: ${person.name} lives in ${person.city}"
    }
}
