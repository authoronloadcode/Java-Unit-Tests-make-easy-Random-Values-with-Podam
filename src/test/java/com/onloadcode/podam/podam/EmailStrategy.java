package com.onloadcode.podam.podam;

import uk.co.jemos.podam.common.AttributeStrategy;

import java.lang.annotation.Annotation;
import java.util.List;

public class EmailStrategy implements AttributeStrategy<String> {

  @Override
  public String getValue(Class<?> attrType, List<Annotation> attrAnnotations) {
    return "aaa.bbb@ccc.ddd";
  }
}
