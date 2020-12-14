// *************************************************************************************************
//
// PROJECT : Paragon 5G Platform™
// PRODUCT : Paragon 5G Platform™ - Backend
// ************************************************************************************************
//
// Copyright(C) 2020 Singapore Telecommunications Limited
// All rights reserved.
//
// This source code and all binaries derived from this source code here is intended for the sole
// use of Singapore Telecommunications Limited and contains information that is confidential
// and/or proprietary to the Singtel Group. Any use of the information contained herein (including,
// but not limited to, total or partial reproduction, communication, or dissemination in any form)
// by persons other than the employees of Singapore Telecommunications Limited is prohibited.
//
// *************************************************************************************************
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
