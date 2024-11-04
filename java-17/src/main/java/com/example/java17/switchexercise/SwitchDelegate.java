package com.example.java17.switchexercise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SwitchDelegate {

  private static final String THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS =
      "The type of input is a %s and its value " + "is: %s";
  private static final String THE_TYPE_OF_INPUT_IS_A_UNKNOW_AND_ITS_VALUE_IS =
      "The type of input is unknow";

  public <T> String execute(final T input) {

    return switch (input.getClass().getSimpleName()) {
      case "String" -> THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted("String", input);
      case "Integer" -> THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted("Integer", input);
      case "Double" -> THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted("Double", input);
      case "FirstSwitchClassDelegate" ->
          THE_TYPE_OF_INPUT_IS_A_X_AND_ITS_VALUE_IS.formatted(
              input.getClass().getSimpleName(), ((FirstSwitchClassDelegate) input).execute());
      default -> THE_TYPE_OF_INPUT_IS_A_UNKNOW_AND_ITS_VALUE_IS;
    };
  }
}
