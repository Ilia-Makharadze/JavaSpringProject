package ge.tsu.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "file:./config/myconfig.properties", ignoreResourceNotFound = true, encoding = "UTF-8")
public class ExternalConfig {
}
