package com.rocs.chaosojcodesandbox;


import com.rocs.chaosojcodesandbox.model.ExecuteCodeRequest;
import com.rocs.chaosojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
