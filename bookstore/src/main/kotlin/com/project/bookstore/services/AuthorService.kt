package com.project.bookstore.services

import com.project.bookstore.domain.entities.AuthorEntity

interface AuthorService {
    fun save(authorEntity: AuthorEntity) : AuthorEntity
}