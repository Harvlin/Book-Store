package com.project.bookstore.controllers

import com.project.bookstore.domain.dto.AuthorDto
import com.project.bookstore.services.AuthorService
import com.project.bookstore.toAuthorDto
import com.project.bookstore.toAuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController (private val authorService: AuthorService) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): AuthorDto {
        return authorService.save(authorDto.toAuthorEntity()).toAuthorDto()
    }
}