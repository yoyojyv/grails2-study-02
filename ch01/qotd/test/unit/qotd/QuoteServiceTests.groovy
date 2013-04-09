package qotd



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
class QuoteServiceTests {

    void testStaticQuoteReturnsQuicheQuote() {
        Quote staticQuote = service.getStaticQuote()

        assertEquals("Annoymous", staticQuote.author)
        assertEquals("Real Programmers Don't eat Quiche", staticQuote.content)
    }
}
