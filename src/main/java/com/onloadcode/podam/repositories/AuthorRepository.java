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
