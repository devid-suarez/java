package com.example.java17;

import com.example.java17.switchexercise.SwitchDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Java17Application {

  public static void main(final String... args) {
    SpringApplication.run(Java17Application.class, args);

    switchFeature(5.0);
  }

  private static <T> void switchFeature(final T input) {
    final SwitchDelegate switchDelegate = new SwitchDelegate();
    log.info(switchDelegate.execute(input));
  }
}
