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
package com.onloadcode.podam.mapper;

import com.onloadcode.podam.dto.AuthorDto;
import com.onloadcode.podam.model.AuthorDoc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * The interface Author mapper.
 */
@Mapper(componentModel = "spring")
@Component
public interface AuthorMapper {


  /**
   * The constant INSTANCE.
   */
AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

  /**
   * Author doc to author dto author dto.
   *
   * @param authorDoc the author doc
   * @return the author dto
   */
@Mapping(target = "books", source = "authorDoc.books")
  AuthorDto authorDocToAuthorDto(AuthorDoc authorDoc);

  /**
   * Author docs to author dtos list.
   *
   * @param authorDocs the author docs
   * @return the list
   */
List<AuthorDto> authorDocsToAuthorDtos(List<AuthorDoc> authorDocs);

  /**
   * Author doc map to author dto map map.
   *
   * @param authorDocMap the author doc map
   * @return the map
   */
Map<String, AuthorDto> authorDocMapToAuthorDtoMap(Map<String, AuthorDoc> authorDocMap);
}
