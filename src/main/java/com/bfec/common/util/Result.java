package com.bfec.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bfec.common.enums.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 结果对象 success boolean	是否成功 errCode	int	错误码（0：成功） message	String	消息
 */
@ApiModel(value = "返回值", description = "errCode:错误码 message:错误描述")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {

    public static final int SuccessCode = 0x00000000;
    public static final int UnknownCode = 0xffffffff;

    @ApiModelProperty(value = "错误代码", notes = "0:正确 其他见错误码描述", dataType = "int")
    private int errCode;
    @ApiModelProperty(value = "错误描述", notes = "错误描述信息", dataType = "String")
    private String message;
    @ApiModelProperty(hidden = true)
    private Serializable tag;

    public String getValue(String key) {
        HashMap<String, String> map = (HashMap<String, String>) tag;
        if (map != null && map.containsKey(key)) {
            return map.get(key);
        } else {
            return null;
        }
    }

    public static Result getResult(String response) throws JSONException {
        Object obj = JSON.parse(response);
        return Result.Success((Serializable) obj);
    }

    public static Result getResult(JSONObject obj) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        int code = obj.getInteger("code");
        String message;
        try {
            message = obj.getString("msg");
        } catch (JSONException ex) {
            message = "";
        }
        obj.keySet().forEach(key -> {
            if (!key.equals("code") && !key.equals("msg")) {
                map.put(key, obj.getString(key));
            }
        });

        return new Result(code, message, map);
    }


    public Result(int errCode) {
        this(errCode, "", null);
    }

    public Result(int errCode, String message) {
        this(errCode, message, null);
    }


    public Result(ErrorCode code, Serializable tag) {
        this.errCode = code.getCode();
        this.message = code.getMessage();
        this.tag = tag;
    }

    public static Result Success(String message, Serializable tag) {
        return new Result(SuccessCode, message, tag);
    }

    public static Result Success() {
        return Success(ErrorCode.Success.getMessage(), null);
    }

    public static Result Success(String message) {
        return Success(message, null);
    }

    public static Result Success(Serializable tag) {
        return Success(ErrorCode.Success.getMessage(), tag);
    }

    public static Result Fail(int errCode, String message, Serializable tag) {
        return new Result(errCode, message, tag);
    }

    public static Result Fail(int errCode, String message, Throwable ex) {
        return new Result(errCode, message, ex);
    }

    public static Result Fail(int errCode, String message) {
        return Fail(errCode, message, null);
    }

    public static Result Fail(int errCode) {
        return Fail(errCode, "", null);
    }

    public static Result Fail(ErrorCode code) {
        return Fail(code.getCode(), code.getMessage());
    }

    public static Result Fail(ErrorCode code, Serializable tag) {
        return Fail(code.getCode(), code.getMessage(), tag);
    }

    public static Result Fail(ErrorCode code, Throwable ex) {
        return Fail(code.getCode(), code.getMessage(), ex);
    }

    public static Result Result(ErrorCode code, Serializable tag) {
        return new Result(code.getCode(), code.getMessage(), tag);
    }

    @ApiModelProperty(hidden = true)
    public boolean isSuccess() {
        return errCode == SuccessCode;
    }

    /**
     * get the object from the result object
     *
     * @return
     */
    @ApiModelProperty(hidden = true)
    public Serializable getData() {
        if (!isSuccess()) {
            return tag;
        } else {
            return null;
        }
    }
}
