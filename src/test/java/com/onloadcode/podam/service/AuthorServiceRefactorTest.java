package com.onloadcode.podam.service;

import com.onloadcode.podam.dto.AuthorDto;
import com.onloadcode.podam.model.AuthorDoc;
import com.onloadcode.podam.repositories.AuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

class AuthorServiceRefactorTest {
  @Mock AuthorRepository authorRepository;
  @InjectMocks AuthorService authorService;

  PodamFactory factory;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    factory = new PodamFactoryImpl();
  }

  @Test
  void testFindAuthorByUserId() {
    factory = new PodamFactoryImpl();
    AuthorDoc authorDoc = factory.manufacturePojo(AuthorDoc.class);

    when(authorRepository.findById(anyLong())).thenReturn(authorDoc);

    AuthorDto result = authorService.findAuthorByUserId(Long.valueOf(1));
    Assertions.assertEquals(authorDoc.getUserId(), result.getUserId());
    Assertions.assertEquals(authorDoc.getFirstName(), result.getFirstName());
    Assertions.assertEquals(authorDoc.getBooks().size(), result.getBooks().size());
  }

  @Test
  void testFindAuthorsNameByOrgCode() {
    List<String> authorNames = factory.manufacturePojo(ArrayList.class, String.class);
    when(authorRepository.findAuthorsNameByOrgCode(anyString())).thenReturn(authorNames);
    List<String> result = authorService.findAuthorsNameByOrgCode("orgCode");
    Assertions.assertEquals(authorNames, result);
  }

  @Test
  void testFindByOrgCode() {
    List<AuthorDoc> authorDocs = factory.manufacturePojo(ArrayList.class, AuthorDoc.class);
    when(authorRepository.findByOrgCode(anyString())).thenReturn(authorDocs);

    List<AuthorDto> result = authorService.findByOrgCode("orgCode");
    Assertions.assertEquals(authorDocs.size(), result.size());
  }

  @Test
  void testFindAuthorMap() {

    Map<String, AuthorDoc> authorDocMap =
        factory.manufacturePojo(HashMap.class, String.class, AuthorDoc.class);
    when(authorRepository.findMapByOrgCode(anyString())).thenReturn(authorDocMap);

    Map<String, AuthorDto> result = authorService.findAuthorMap("orgCode");
    result.forEach(
        (key, value) ->
            Assertions.assertEquals(authorDocMap.get(key).getUserId(), value.getUserId()));
  }
}
