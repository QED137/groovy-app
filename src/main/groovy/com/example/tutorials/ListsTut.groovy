package com.example.tutorials

class ListsTut {
    static void run() {
        println "=== Lists Tutorial ==="
        def numbers = [1, 2, 3, 4, 5]
        println "Numbers: ${numbers}"
        println "Sum: ${numbers.sum()}"
        println "Even numbers: ${numbers.findAll { it % 2 == 0 }}"
    }
}