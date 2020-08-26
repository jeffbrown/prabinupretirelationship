package prabinupretirelationship

class BootStrap {

    AuthorService authorService
    def init = { servletContext ->
            def author = new Author('name': "Author")
            author.addToBooks(new Book('title': "Book1"))
            author.addToBooks(new Book('title': "Book2"))
            authorService.save author
    }
    def destroy = {
    }
}
