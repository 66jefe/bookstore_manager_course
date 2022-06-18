package com.jeferson.bookstoremanager.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeferson.bookstoremanager.model.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
