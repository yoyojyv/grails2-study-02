package qotd

class Quote {

    String content
    String author
    Date cerated = new Date()

    static constraints = {
        author(blank: false)
        content(maxSize: 1000, blank: false)
    }
}
