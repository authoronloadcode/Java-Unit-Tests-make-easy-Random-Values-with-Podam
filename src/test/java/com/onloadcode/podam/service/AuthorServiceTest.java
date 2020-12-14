package com.onloadcode.podam.service;

import com.onloadcode.podam.dto.AuthorDto;
import com.onloadcode.podam.dto.BookDto;
import com.onloadcode.podam.model.AuthorDoc;
import com.onloadcode.podam.model.BookDoc;
import com.onloadcode.podam.repositories.AuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

import static org.mockito.Mockito.*;

class AuthorServiceTest {
  @Mock AuthorRepository authorRepository;
  @InjectMocks AuthorService authorService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  void testFindAuthorByUserId() {
    when(authorRepository.findById(anyLong()))
        .thenReturn(
            new AuthorDoc(
                Long.valueOf(1),
                "orgCode",
                "firstName",
                "lastName",
                new GregorianCalendar(2020, Calendar.DECEMBER, 14, 10, 50).getTime(),
                "email",
                Arrays.asList(
                    new BookDoc(
                        Long.valueOf(1),
                        "book Name 1",
                        "isbn1",
                        LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                        LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                        "createdBy",
                        "modifiedBy"),
                    new BookDoc(
                        Long.valueOf(2),
                        "book Name 2",
                        "isbn2",
                        LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                        LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                        "createdBy",
                        "modifiedBy")),
                LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                "createdBy",
                "modifiedBy"));

    AuthorDto result = authorService.findAuthorByUserId(Long.valueOf(1));
    Assertions.assertEquals(
        new AuthorDto(
            Long.valueOf(1),
            "orgCode",
            "firstName",
            "lastName",
            new GregorianCalendar(2020, Calendar.DECEMBER, 14, 10, 50).getTime(),
            "email",
            Arrays.asList(
                new BookDto(Long.valueOf(1), "book Name 1", "isbn1"),
                new BookDto(Long.valueOf(2), "book Name 2", "isbn2"))),
        result);
  }

  @Test
  void testFindAuthorsNameByOrgCode() {
    when(authorRepository.findAuthorsNameByOrgCode(anyString()))
        .thenReturn(
            Arrays.asList(
                "Lorem Ipsum", "simply dummy", "text of the printing", "typesetting industry"));

    List<String> result = authorService.findAuthorsNameByOrgCode("orgCode");
    Assertions.assertEquals(
        Arrays.asList(
            "Lorem Ipsum ", "simply dummy", "text of the printing", "typesetting industry"),
        result);
  }

  @Test
  void testFindByOrgCode() {
    when(authorRepository.findByOrgCode(anyString()))
        .thenReturn(
            Arrays.asList(
                new AuthorDoc(
                    Long.valueOf(1),
                    "orgCode",
                    "firstName",
                    "lastName",
                    new GregorianCalendar(2020, Calendar.DECEMBER, 14, 10, 50).getTime(),
                    "email",
                    Arrays.asList(
                        new BookDoc(
                            Long.valueOf(1),
                            "book Name 1",
                            "isbn1",
                            LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                            LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                            "createdBy",
                            "modifiedBy"),
                        new BookDoc(
                            Long.valueOf(2),
                            "book Name 2",
                            "isbn2",
                            LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                            LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                            "createdBy",
                            "modifiedBy")),
                    LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                    LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                    "createdBy",
                    "modifiedBy")));

    List<AuthorDto> result = authorService.findByOrgCode("orgCode");
    Assertions.assertEquals(
        Arrays.asList(
            new AuthorDto(
                Long.valueOf(1),
                "orgCode",
                "firstName",
                "lastName",
                new GregorianCalendar(2020, Calendar.DECEMBER, 14, 10, 50).getTime(),
                "email",
                Arrays.asList(
                    new BookDto(Long.valueOf(1), "book Name 1", "isbn1"),
                    new BookDto(Long.valueOf(2), "book Name 2", "isbn2")))),
        result);
  }

  @Test
  void testFindAuthorMap() {
    when(authorRepository.findMapByOrgCode(anyString()))
        .thenReturn(
            new HashMap<String, AuthorDoc>() {
              {
                put(
                    "String",
                    new AuthorDoc(
                        Long.valueOf(1),
                        "orgCode",
                        "firstName",
                        "lastName",
                        new GregorianCalendar(2020, Calendar.DECEMBER, 14, 10, 50).getTime(),
                        "email",
                        Arrays.asList(
                            new BookDoc(
                                Long.valueOf(1),
                                "book Name 1",
                                "isbn1",
                                LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                                LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                                "createdBy",
                                "modifiedBy"),
                            new BookDoc(
                                Long.valueOf(2),
                                "book Name 2",
                                "isbn2",
                                LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                                LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                                "createdBy",
                                "modifiedBy")),
                        LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                        LocalDateTime.of(2020, Month.DECEMBER, 14, 10, 50, 28),
                        "createdBy",
                        "modifiedBy"));
              }
            });

    Map<String, AuthorDto> result = authorService.findAuthorMap("orgCode");
    Assertions.assertEquals(
        new HashMap<String, AuthorDto>() {
          {
            put(
                "String",
                new AuthorDto(
                    Long.valueOf(1),
                    "orgCode",
                    "firstName",
                    "lastName",
                    new GregorianCalendar(2020, Calendar.DECEMBER, 14, 10, 50).getTime(),
                    "email",
                    Arrays.asList(
                        new BookDto(Long.valueOf(1), "book Name 1", "isbn1"),
                        new BookDto(Long.valueOf(2), "book Name 2", "isbn2"))));
          }
        },
        result);
  }
}
