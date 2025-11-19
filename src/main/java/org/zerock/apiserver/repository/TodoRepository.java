package org.zerock.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.apiserver.domain.Todo;
import org.zerock.apiserver.repository.search.TodoSearch;
//2
public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
}
