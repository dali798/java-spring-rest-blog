package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Component
public interface AuthorRepository extends JpaRepository<Author, Long> {
}