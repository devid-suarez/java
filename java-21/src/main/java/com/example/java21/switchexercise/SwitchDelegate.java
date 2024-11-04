package com.example.java21.switchexercise;

import org.springframework.stereotype.Component;

@Component
public class SwitchDelegate {

  private static final String THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS =
      "The type of input is a %s and its value " + "is: %s";
  private static final String THE_TYPE_OF_INPUT_IS_A_UNKNOW_AND_ITS_VALUE_IS =
      "The type of input is unknow";

  public <T> String execute(final T input) {
    return switch (input) {
      case final String variable ->
          THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted("String", variable);
      case final Integer variable ->
          THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted("Integer", variable);
      case final Double variable ->
          THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted("Double", variable);
      case final FirstSwitchClassDelegate variable ->
          THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted(
              variable.getClass().getSimpleName(), variable.execute());

      default -> THE_TYPE_OF_INPUT_IS_A_UNKNOW_AND_ITS_VALUE_IS;
    };
  }
}
