package com.chenyuxin.bloggeniusaibackend.ai;

import com.chenyuxin.bloggeniusaibackend.ai.model.HtmlCodeResult;
import com.chenyuxin.bloggeniusaibackend.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/chenyuxin0328">chenyuxin</a>
 * @Date: 2025/10/4 15:33
 */
@SpringBootTest
class AiCodeGeneratorServiceTest {


    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHTMLCode("做个程序员鱼皮的博客，不超过 20 行");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result = aiCodeGeneratorService.generateMultiFileCode("做个程序员鱼皮的留言板");
        Assertions.assertNotNull(result);
    }
}