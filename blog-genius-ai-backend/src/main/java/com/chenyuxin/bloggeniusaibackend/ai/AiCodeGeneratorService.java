package com.chenyuxin.bloggeniusaibackend.ai;

import com.chenyuxin.bloggeniusaibackend.ai.model.HtmlCodeResult;
import com.chenyuxin.bloggeniusaibackend.ai.model.MultiFileCodeResult;
import dev.langchain4j.service.SystemMessage;
import reactor.core.publisher.Flux;

/**
 * @author <a href="https://github.com/chenyuxin0328">chenyuxin</a>
 * @Date: 2025/10/4 15:22
 */
public interface AiCodeGeneratorService {
    /**
     * 生成HTML代码
     *
     * @param userMessage 用户提示词
     * @return AI输出结果
     */
    @SystemMessage(fromResource = "prompt/codegen-html-system-prompt.txt")
    HtmlCodeResult generateHTMLCode(String userMessage);

    /**
     * 生成多文件代码
     *
     * @param userMessage 用户提示词
     * @return AI输出结果
     */
    @SystemMessage(fromResource = "prompt/codegen-multi-file-system-prompt.txt")
    MultiFileCodeResult generateMultiFileCode(String userMessage);

    /**
     * 流式生成HTML代码
     *
     * @param userMessage 用户提示词
     * @return AI输出结果
     */
    @SystemMessage(fromResource = "prompt/codegen-html-system-prompt.txt")
    Flux<String> generateHTMLCodeStream(String userMessage);

    /**
     * 流式生成多文件代码
     *
     * @param userMessage 用户提示词
     * @return AI输出结果
     */
    @SystemMessage(fromResource = "prompt/codegen-multi-file-system-prompt.txt")
    Flux<String> generateMultiFileCodeStream(String userMessage);
}
