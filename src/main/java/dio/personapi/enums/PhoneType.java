package dio.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Fixo"),
    MOBILE("Móvel"),
    COMMERCIAL("Comercial");

    private final String description;
}
