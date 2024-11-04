package com.example.java21;

import com.example.java21.switchexercise.FirstSwitchClassDelegate;
import com.example.java21.switchexercise.SwitchDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Java21Application {

  public static void main(final String... args) {
    SpringApplication.run(Java21Application.class, args);

    final FirstSwitchClassDelegate firstSwitchClassDelegate = new FirstSwitchClassDelegate();

    switchFeature(firstSwitchClassDelegate);
  }

  private static <T> void switchFeature(final T input) {
    final SwitchDelegate switchDelegate = new SwitchDelegate();
    log.info(switchDelegate.execute(input));
  }
}
