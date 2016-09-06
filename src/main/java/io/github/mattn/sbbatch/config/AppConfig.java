package io.github.mattn.sbbatch.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by mattn on 2016/09/07.
 */
@Component
@Data
@ConfigurationProperties(prefix = "app")
public class AppConfig {
}
