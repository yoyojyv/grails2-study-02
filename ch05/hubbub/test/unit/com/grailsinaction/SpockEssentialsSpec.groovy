package com.grailsinaction

import spock.lang.Specification

class SpockEssentialsSpec extends Specification {

    def "Ensure basic maths is still holding true"() {

        given: "A set of numbers"
        int a = 7
        int b = 3

        when: "The numbers atr summed"
        int c = a + b

        then: "The answer is the sum of values"
        c == 10
    }
}
