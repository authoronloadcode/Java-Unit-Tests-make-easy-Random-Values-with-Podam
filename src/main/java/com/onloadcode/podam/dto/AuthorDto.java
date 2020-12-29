package com.onloadcode.podam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/** The type Author dto. */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto {
  private Long userId;
  ;
  private String orgCode;
  private String firstName;
  private String lastName;
  private Date birthDay;
  private String email;
  private List<BookDto> books;
}
