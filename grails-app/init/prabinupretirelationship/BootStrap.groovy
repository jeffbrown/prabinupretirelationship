package prabinupretirelationship

class BootStrap {

    def init = { servletContext ->
        Author.withTransaction {
            def author = new Author('name': "Author")
            author.addToBooks(new Book('title': "Book1"))
            author.addToBooks(new Book('title': "Book2"))
            author.save(flush: true)
        }
    }
    def destroy = {
    }
}
