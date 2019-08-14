package com.meyacom.stone.controller.dto;

import com.meyacom.stone.enums.BaseRespCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * desc:
 * author: as
 * date: 2019/8/14
 */
@Getter
@ToString
@Builder
@AllArgsConstructor
public class BaseRespDTO<T> {
    private String code;
    private String msg;
    private T data;
    private String exceStack;

    public static BaseRespDTO buildSucc() {
        return BaseRespDTO.builder().code(BaseRespCodeEnum.CODE_SUCCESS.getCode()).
                msg(BaseRespCodeEnum.CODE_SUCCESS.getMsg()).build();
    }

    public static <E> BaseRespDTO buildSucc(E d) {
        return BaseRespDTO.builder().code(BaseRespCodeEnum.CODE_SUCCESS.getCode()).
                msg(BaseRespCodeEnum.CODE_SUCCESS.getMsg()).data(d).build();
    }

    public static BaseRespDTO buildFail(Exception e) {
        return BaseRespDTO.builder().code(BaseRespCodeEnum.CODE_SUCCESS.getCode()).
                msg(BaseRespCodeEnum.CODE_SUCCESS.getMsg()).exceStack(e.getMessage()).build();
    }

    public static <E> BaseRespDTO buildFail(E d, Exception e) {
        return BaseRespDTO.builder().code(BaseRespCodeEnum.CODE_SUCCESS.getCode()).
                msg(BaseRespCodeEnum.CODE_SUCCESS.getMsg()).data(d).exceStack(e.getMessage()).build();
    }
}
