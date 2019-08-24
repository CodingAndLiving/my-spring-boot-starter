package autoconfigure.annotation;

import autoconfigure.HelloAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用短信息配置
 *
 * @author Dax
 * @since 16:03  2019-05-15
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloAutoConfiguration.class)
public @interface EnableHello {
}
