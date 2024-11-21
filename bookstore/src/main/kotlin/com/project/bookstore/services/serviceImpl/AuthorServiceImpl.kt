package com.project.bookstore.services.serviceImpl

import com.project.bookstore.domain.entities.AuthorEntity
import com.project.bookstore.repositories.AuthorRepository
import com.project.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(val authorRepository: AuthorRepository): AuthorService {
    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }
}