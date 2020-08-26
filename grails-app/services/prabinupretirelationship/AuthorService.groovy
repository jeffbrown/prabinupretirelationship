package prabinupretirelationship

import grails.gorm.services.Service

@Service(Author)
interface AuthorService {
    Author save(Author a)
}
