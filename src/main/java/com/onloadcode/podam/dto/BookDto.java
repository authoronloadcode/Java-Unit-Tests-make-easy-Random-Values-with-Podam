package com.onloadcode.podam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** The type Book dto. */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
  private Long bookId;
  private String bookName;
  private String isbnCode;
}
