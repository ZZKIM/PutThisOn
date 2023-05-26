package nAIn.PutThisOn.domain.avatar.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BodyType {
    HOUR_GLASS("hour_glass"),
    APPLE("apple"),
    INVERTED_TRIANGLE("inverted_triangle"),
    PEAR("pear"),
    RECTANGLE("rectangle");

    private final String name;

}
