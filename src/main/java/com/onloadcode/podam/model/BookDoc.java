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
package com.onloadcode.podam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * The type Book doc.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDoc {
  private Long bookId;;
  private String bookName;
  private String isbnCode;
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime createdOn;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime modifiedOn;

  private String createdBy;
  private String modifiedBy;
}
