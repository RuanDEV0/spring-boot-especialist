package io.github.ruan.springjpa.repository;

import io.github.ruan.springjpa.model.entitys.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
