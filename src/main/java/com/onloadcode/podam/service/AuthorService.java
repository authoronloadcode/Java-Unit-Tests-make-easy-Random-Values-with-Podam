package com.onloadcode.podam.service;

import com.onloadcode.podam.dto.AuthorDto;
import com.onloadcode.podam.mapper.AuthorMapper;
import com.onloadcode.podam.model.AuthorDoc;
import com.onloadcode.podam.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/** The type Author service. */
@Service
@RequiredArgsConstructor
public class AuthorService {
  private AuthorRepository authorRepository;

  /**
   * Find author by user id author dto.
   *
   * @param userId the user id
   * @return the author dto
   */
  public AuthorDto findAuthorByUserId(Long userId) {
    AuthorDoc authorDoc = authorRepository.findById(userId);
    final var authorDto = AuthorMapper.INSTANCE.authorDocToAuthorDto(authorDoc);
    return authorDto;
  }

  /**
   * Find authors name by org code list.
   *
   * @param orgCode the org code
   * @return the list
   */
  public List<String> findAuthorsNameByOrgCode(String orgCode) {
    List<String> authors = authorRepository.findAuthorsNameByOrgCode(orgCode);
    return authors;
  }

  /**
   * Find by org code list.
   *
   * @param orgCode the org code
   * @return the list
   */
  public List<AuthorDto> findByOrgCode(String orgCode) {
    List<AuthorDoc> authorDocs = authorRepository.findByOrgCode(orgCode);
    final var authorDtos = AuthorMapper.INSTANCE.authorDocsToAuthorDtos(authorDocs);
    return authorDtos;
  }

  /**
   * Find author map map.
   *
   * @param orgCode the org code
   * @return the map
   */
  public Map<String, AuthorDto> findAuthorMap(String orgCode) {
    Map<String, AuthorDoc> authorDocMap = authorRepository.findMapByOrgCode(orgCode);
    final var authorDtoMap = AuthorMapper.INSTANCE.authorDocMapToAuthorDtoMap(authorDocMap);
    return authorDtoMap;
  }
}
