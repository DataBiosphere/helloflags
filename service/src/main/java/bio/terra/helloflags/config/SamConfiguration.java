package bio.terra.helloflags.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "helloflags.sam")
public record SamConfiguration(String basePath) {}
