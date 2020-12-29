package com.onloadcode.podam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/** The type Book doc. */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDoc {
  private Long bookId;
  ;
  private String bookName;
  private String isbnCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime createdOn;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime modifiedOn;

  private String createdBy;
  private String modifiedBy;
}
