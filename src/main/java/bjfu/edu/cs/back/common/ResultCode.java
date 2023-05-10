package bjfu.edu.cs.back.common;

import lombok.Getter;

@Getter
public enum ResultCode {
    NOHANDLER(404,"请求地址错误"),
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    NOTOKEN(401,"未登录或登录已超时"),
    NOPERMISS(403,"无操作权限"),
    USER_EXIST(501,"该用户已注册"),
    EMAIL_VERIFY(502, "邮箱格式不正确"),
    MOBILE_VERIFY(503,"手机号码格式不正确"),
    NAME_NULL(504,"用户名不能为空"),
    REAL_NAME_NULL(505,"真实姓名不能为空"),
    MOBILE_NULL(506,"联系电话不能为空"),
    EMAIL_NULL(507,"邮箱不能为空"),
    ADDRESS_NULL(508,"住址不能为空"),
    PASSWORD_NULL(509,"密码不能为空"),
    FILE_TYPE_ERROR(510,"请上传PNG/JPG类型的文件"),
    NAME_CHECK(511, "工作人员用户名为纯数字"),
    NAME_LESS(512, "用户名不能少于4位"),
    ADMIN_REMOVE_ERROR(513, "系统管理员不可删除"),
    UNIT_NULL(514, "所属单位不能为空"),
    STAFF_UNIT_NULL(515, "工作人员单位不能为空"),
    SAMPLE_NAME_NULL(516, "标本名称不能为空"),
    SAMPLE_PLACE_NULL(517, "出土地不能为空"),
    SAMPLE_DESCRIPTION_NULL(518, "器物类型不能为空"),
    SAMPLE_MATERIAL_NULL(519, "标本材质不能为空"),
    UNIT_NAME_NULL(520, "单位名称不能为空"),
    CONCACT_ADDRESS_NULL(521, "联系地址不能为空"),
    CONCAT_MAN_NULL(522, "联系人不能为空"),
    CHARACTERS_NULL(523, "单位性质不能为空"),
    DELETE_UNIT_ERROR(524, "请先删除该单位下的用户或标本"),
    EXCAVATION_TIME_NULL(525, "出土时间不能为空"),
    AGE_NULL(526, "所属年代不能为空"),
    IMG_NULL(527, "请上传标本图片"),
    EXCEL_NULL(528, "请上传指定模板的Excel表格"),
    REASON_NULL(529, "必须填写借阅理由"),
    BORROW_ADDRESS_NULL(530, "借阅人地址不能为空"),
    EMAIL_CODE_NULL(531, "邮箱验证码不能为空"),
    CODE_ERROR(532, "验证码错误"),
    NEED_CODE(533, "请先获取验证码"),
    NEED_RETURN(534, "请待标本归还再删除"),
    EMAIL_REPEAT(535,"邮箱已被注册");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}