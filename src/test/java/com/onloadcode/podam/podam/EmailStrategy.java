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
