package com.rocs.chaosojcodesandbox;

import com.rocs.chaosojcodesandbox.model.ExecuteCodeRequest;
import com.rocs.chaosojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/***
 * java原生继承直接复用原生模板代码
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate{

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }

}
