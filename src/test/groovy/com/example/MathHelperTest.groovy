package com.example

import spock.lang.Specification

class MathHelperTest extends Specification {
    
    def "Adding two numbers should return their sum"() {
        given:
        def math = new MathHelper()
        
        when:
        def result = math.add(5, 3)
        
        then:
        result == 8
    }
    
    def "Adding zero should return the same number"() {
        expect:
        new MathHelper().add(a, 0) == a
        
        where:
        a << [1, 10, 100, 999]
    }
}
