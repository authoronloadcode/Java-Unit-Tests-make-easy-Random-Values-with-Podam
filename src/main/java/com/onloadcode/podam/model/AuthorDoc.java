package com.onloadcode.podam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/** The type Author doc. */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDoc {
  private Long userId;
  private String orgCode;
  private String firstName;
  private String lastName;
  private Date birthDay;
  private String email;
  private List<BookDoc> books;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime createdOn;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime modifiedOn;

  private String createdBy;
  private String modifiedBy;
}
