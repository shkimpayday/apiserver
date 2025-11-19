package org.zerock.apiserver.repository.search;

import org.springframework.data.domain.Page;
import org.zerock.apiserver.domain.Todo;
//2
public interface TodoSearch {

    Page<Todo> search1();
}
