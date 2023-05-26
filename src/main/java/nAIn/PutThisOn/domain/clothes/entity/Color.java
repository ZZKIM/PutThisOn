package nAIn.PutThisOn.domain.clothes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Color {
    LEVEL_0("level 0"),
    LEVEL_1("level 1"),
    LEVEL_2("level 2"),
    LEVEL_3("level 3"),
    LEVEL_4("level 4"),
    LEVEL_5("level 5");

    private final String name;

}
