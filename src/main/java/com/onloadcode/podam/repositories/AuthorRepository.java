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
package com.onloadcode.podam.repositories;

import com.onloadcode.podam.model.AuthorDoc;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/** The type Author repository. */
@Component
public class AuthorRepository {
  /**
   * Find by id author doc.
   *
   * @param userId the user id
   * @return the author doc
   */
  public AuthorDoc findById(Long userId) {
    return null;
  }

  /**
   * Find authors name by org code list.
   *
   * @param orgCode the org code
   * @return the list
   */
  public List<String> findAuthorsNameByOrgCode(String orgCode) {
    return null;
  }

  /**
   * Find by org code list.
   *
   * @param orgCode the org code
   * @return the list
   */
  public List<AuthorDoc> findByOrgCode(String orgCode) {
    return null;
  }

  /**
   * Find map by org code map.
   *
   * @param orgCode the org code
   * @return the map
   */
  public Map<String, AuthorDoc> findMapByOrgCode(String orgCode) {
    return null;
  }
}
