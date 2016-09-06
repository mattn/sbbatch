package io.github.mattn.sbbatch.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Application Configuration.
 *
 * @author mattn
 */
@Component
@Data
@ConfigurationProperties(prefix = "app")
public class AppConfig {
}
