package qotd

class QuoteService {

    def getStaticQuote() {
        return new Quote(author: "Annoymous", content: "Real Programmers Don't eat Quiche")
    }

    def getRandomQuote() {
        def allQuotes = Quote.list()
        def randomQuote
        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}
