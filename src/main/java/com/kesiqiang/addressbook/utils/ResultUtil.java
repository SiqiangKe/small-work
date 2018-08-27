/**
 * FileName: ResultUtil
 * Author:   SiqiangKe
 * Date:     2018/8/25 19:44
 * Description:
 */
package com.kesiqiang.addressbook.utils;

import com.kesiqiang.addressbook.dataobject.Result;

public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("SUCCESS");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
