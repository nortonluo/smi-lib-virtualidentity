/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.virtualidentity.exception;

import com.dell.isg.smi.commons.elm.messaging.IMessageEnum;

/**
 * The Enum EnumErrorCode.
 */
public enum EnumErrorCode implements IMessageEnum {
    INVALID_NAME_LENGTH_CODE("INVALID_NAME_LENGTH_CODE", 234001), INVALID_NAME_FORMAT_CODE("INVALID_NAME_FORMAT_CODE", 234002), INVALID_DESC_LENGTH_CODE("INVALID_DESC_LENGTH_CODE", 234003), INVALID_DESC_FORMAT_CODE("INVALID_DESC_FORMAT_CODE", 234004), INVALID_DISPLAY_NAME_LENGTH_CODE("INVALID_DISPLAY_NAME_LENGTH_CODE", 234015), INVALID_DISPLAY_NAME_FORMAT_CODE("INVALID_DISPLAY_NAME_FORMAT_CODE", 234016), IOIDENTITY_INVALID_CREATE_REQUEST("IOIDENTITY_INVALID_CREATE_REQUEST", 231014), IOIDENTITY_INVALID_INPUT("IOIDENTITY_INVALID_INPUT", 231036), IOIDENTITY_RESERVATIONS_EXCEEDED("IOIDENTITY_RESERVATIONS_EXCEEDED", 231002), IOPOOL_MAX_SIZE_EXCEEDED("IOPOOL_MAX_SIZE_EXCEEDED", 231033), IOIDENTITY_INVALID_TYPE_IN_POOL("IOIDENTITY_INVALID_TYPE_IN_POOL", 231012), IOIDENTITY_FAILED_TO_RESERVE_IDENTITIES("IOIDENTITY_FAILED_TO_RESERVE_IDENTITIES", 231015), IOIDENTITY_GENERATION_INVALID_EUI("IOIDENTITY_GENERATION_INVALID_EUI", 231009), IOIDENTITY_FAILED_TO_ASSIGN_IDENTITIES("IOIDENTITY_FAILED_TO_ASSIGN_IDENTITIES", 231016), IOIDENTITY_INVALID_USAGE_ID("IOIDENTITY_INVALID_USAGE_ID", 231034), ENUM_NOT_FOUND_ERROR("ENUM_NOT_FOUND_ERROR", 200404), IOIDENTITY_INVALID_IDENTITY_ID("IOIDENTITY_INVALID_IDENTITY_ID", 231035), IOIDENTITY_NOT_FOUND("IOIDENTITY_NOT_FOUND", 231037), ENUM_SERVER_ERROR("ENUM_SERVER_ERROR", 200500);

    private Integer id;
    private String value;

    private EnumErrorCode(String value, Integer id) {
        this.value = value;
        this.id = id;
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.elm.messaging.IMessageEnum#getValue()
     */
    @Override
    public String getValue() {
        return this.value;
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.elm.messaging.IMessageEnum#getId()
     */
    @Override
    public Integer getId() {
        return this.id;
    }


    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return this.value;
    }
}
