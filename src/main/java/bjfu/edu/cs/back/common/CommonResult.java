package bjfu.edu.cs.back.common;

import lombok.Getter;

@Getter
public class CommonResult {
    private Integer code;
    private String msg;
    private Object obj;

    private CommonResult(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public static CommonResult nohandler() {
        return new CommonResult(ResultCode.NOHANDLER.getCode(), ResultCode.NOHANDLER.getMsg(),null);
    }
    public static CommonResult success(Object obj) {
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(),obj);
    }
    public static CommonResult failed() {
        return new CommonResult(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMsg(),null);
    }
    public static CommonResult failed(String msg) {
        return new CommonResult(ResultCode.FAILED.getCode(),msg,null);
    }


    public static CommonResult notoken() {
        return new CommonResult(ResultCode.NOTOKEN.getCode(), ResultCode.NOTOKEN.getMsg(),null);
    }
    public static CommonResult nopremiss() {
        return new CommonResult(ResultCode.NOPERMISS.getCode(), ResultCode.NOPERMISS.getMsg(),null);
    }
}

