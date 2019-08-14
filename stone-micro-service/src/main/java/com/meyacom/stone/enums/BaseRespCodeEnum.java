package com.meyacom.stone.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * desc:
 * author: as
 * date: 2019/8/14
 */
@Getter
@AllArgsConstructor
public enum BaseRespCodeEnum {
    CODE_SUCCESS("0000", "请求成功"),
    CODE_FAILURE("9999", "请求失败");

    String code;
    String msg;
}